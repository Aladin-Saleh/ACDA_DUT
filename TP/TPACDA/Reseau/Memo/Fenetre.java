/**
 * Fenetre class definition
 * generated from StarUML project Memo on 18/06/2012
 *
 * @author Luc Hernandez
 */
import java.awt.Color;




public class Fenetre extends javax.swing.JFrame {
  private ClientDepot depot;
  javax.swing.JTextArea zone;
  public Fenetre() {
    depot = new ClientDepot("localhost", 11111);
    zone = new javax.swing.JTextArea(depot.extraire());
    zone.setBackground(Color.WHITE);
    add(zone);
    addWindowListener(new ControleFenetre());
   	addMouseWheelListener(new WheelGestion(zone));
    setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
    setSize(200, 200);
    setTitle("Memo");
    setLocation(200, 200);
  }

  public void destroy() {
    depot.entreposer(zone.getText());
    dispose();
  }
}
