import java.io.IOException;
import client.Fenetre;
import client.Central;

/**
 * ClientStart class definition
 * generated from StarUML project Mob on 24/06/2012
 *
 * @author Luc Hernandez
 */

public class ClientStart  extends Thread {
	private static Fenetre fen;
  public static void main(String[] args) {
    fen = new Fenetre();
    try {
      Central serveur= new Central("localhost", 11111, fen);
      fen.setServeur(serveur);
      javax.swing.SwingUtilities.invokeLater(new ClientStart());
      if (!serveur.interroger()) {
        System.err.println("Connexion interrompue !");
        fen.destroy();
      }
    } catch(IOException e) {
      System.err.println("Impossible de se connecter au serveur !");
    }
  }
  public void run() {
    fen.setVisible(true);
  }

}
