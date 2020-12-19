import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.Random;

/**
 * History class definition
 * generated from StarUML project Mag8+ on 24/06/2012
 *
 * @author Luc Hernandez
 */

public class History {
  private javax.swing.JLabel view;
  boolean enLigne;
  Connection connexion;
  Statement declaration;
  int nbReponses;
  int nbQuestions;
  int currentQuestion;
  Random rng;

  public History(javax.swing.JLabel v, String login, String password) {
    view = v;
    rng = new Random(System.currentTimeMillis());
    if ((login != null)&&(password != null)) {
      try {
        Class.forName("org.mariadb.jdbc.Driver");
        try {
          connexion = DriverManager.getConnection("jdbc:mariadb://dwarves.iut-fbleau.fr/saleh",login, password);
          try {
            declaration = connexion.createStatement();
            try {
              ResultSet rs = declaration.executeQuery("SELECT COUNT(texte) FROM Reponses");
              rs.first();
              nbReponses = rs.getInt(1);
              try {
                rs.close();
                rs = null;
              } catch(SQLException e) {
                // ignore
              }
              rs = declaration.executeQuery("SELECT COUNT(texte) FROM Questions");
              rs.first();
              nbQuestions = rs.getInt(1);
              try {
                rs.close();
                rs = null;
              } catch(SQLException e) {
                // ignore
              }
              currentQuestion = nbQuestions - 1;
              enLigne = true;
              refreshView();
            } catch(SQLException e) {
              enLigne = false;
              System.err.println("Hors Ligne (echec des premieres requetes)");
              try {
                connexion.close();
                connexion = null;
                declaration = null;
              } catch(SQLException e2) {
                // ignore
              }
            }
          } catch(SQLException e) {
            enLigne = false;
            System.err.println("Hors Ligne (echec de la declaration)");
            try {
              connexion.close();
              connexion = null;
            } catch(SQLException e2) {
              // ignore
            }
          }
        } catch(SQLException e) {
          enLigne = false;
          System.err.println("Hors Ligne (echec de la connexion)");
        }
      } catch(ClassNotFoundException e) {
        enLigne = false;
        System.err.println("Hors Ligne (driver indisponible)");
      }
    } else {
      enLigne = false;
      System.err.println("Hors Ligne (pas de login/mdp sur la ligne de commande)");
    }
    if (!enLigne)
      view.setText("[Hors Ligne]");
  }

  public void close() {
    if (enLigne)
      try {
        connexion.close();
        connexion = null;
        declaration = null;
      } catch(SQLException e) {
        // ignore
      }
  }

  public void generate(String question) {
    if (enLigne)

  
    

      try {


        if(question.equals("purge"))
        {
            String query = "DELETE FROM Questions WHERE cle < (Select MAX(cle) FROM Questions) - 5";
            ResultSet rs = declaration.executeQuery(query);
        }
        else
        {




        int choice = rng.nextInt(nbReponses);
        String query = "SELECT cle FROM Reponses "
                    + "ORDER BY cle "
                    + "LIMIT 1 OFFSET " + choice;
        ResultSet rs = declaration.executeQuery(query);
        rs.first();
        int reponse = rs.getInt(1);
        try {
          rs.close();
          rs = null;
        } catch(SQLException e) {
          // ignore
        }
        query = "INSERT INTO Questions SET "
             + "cle=DEFAULT, "
             + "reponse=" + reponse+ ", "
             + "texte='" + question + "'";
        declaration.executeUpdate(query);
        nbQuestions++;
        currentQuestion = nbQuestions - 1;
        refreshView();
      }
      } catch(SQLException e) {
        enLigne = false;
        view.setText("[Hors Ligne]");
        System.err.println("Hors Ligne (echec de la requete d'insertion)");
        close();
      }
    
    
  }


  public void shiftSelection(int offset) {
    if (enLigne) {
      int oldQuestion = currentQuestion;

      currentQuestion += offset;
      if (currentQuestion < 0)
        currentQuestion = 0;
      else if (currentQuestion >= nbQuestions)
        currentQuestion = nbQuestions - 1;

      if (currentQuestion != oldQuestion)
        refreshView();
    }
  }

  private void refreshView() {
    try {
      String query = "SELECT Questions.texte As qt, Reponses.texte As rt "
        + "FROM (Questions JOIN Reponses ON Questions.reponse = Reponses.cle) "
        + "ORDER BY Questions.cle "
        + "LIMIT 1 OFFSET " + currentQuestion;
      ResultSet rs = declaration.executeQuery(query);
      rs.first();
      String txt = rs.getString(1) + " ? " + rs.getString(2);
      view.setText(txt);
      try {
        rs.close();
      } catch(SQLException e) {
        // ignore
      }
    } catch(SQLException e) {
      enLigne = false;
      System.err.println("Hors Ligne (echec de la requete de mise a jour)");
      view.setText("[Hors Ligne]");
      close();
    }
  }
}
