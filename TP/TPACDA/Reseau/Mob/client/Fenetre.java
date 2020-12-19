package client;

/**
 * Fenetre class definition
 * generated from StarUML project Mob on 24/06/2012
 *
 * @author Luc Hernandez
 */

public class Fenetre extends javax.swing.JFrame {
  private javax.swing.JLabel etiquette;
  private Central serveur;
  public Fenetre() {
    etiquette = new javax.swing.JLabel("0", javax.swing.JLabel.CENTER);
    add(etiquette);
    addWindowListener(new ControleFenetre());
    setSize(100, 100);
    setLocation(200, 200);
  }

  public void setServeur(Central c) {
    serveur = c;
  }

  public void destroy() {
    if (serveur != null)
      serveur.quitter();
    dispose();
  }

  public void display(int nbClients) {
    etiquette.setText("" + nbClients);
  }
}
