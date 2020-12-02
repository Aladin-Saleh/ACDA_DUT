/**
 * ControleFenetre class definition
 * generated from StarUML project Memo on 18/06/2012
 *
 * @author Luc Hernandez
 */




public class ControleFenetre implements java.awt.event.WindowListener {
  public void windowClosing(java.awt.event.WindowEvent e) {
   ((Fenetre) e.getSource()).destroy();
  }

  public void windowActivated(java.awt.event.WindowEvent e) {}
  public void windowClosed(java.awt.event.WindowEvent e) {}
  public void windowDeactivated(java.awt.event.WindowEvent e) {}
  public void windowDeiconified(java.awt.event.WindowEvent e) {}
  public void windowIconified(java.awt.event.WindowEvent e) {}
  public void windowOpened(java.awt.event.WindowEvent e) {}
}
