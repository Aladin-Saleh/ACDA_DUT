/**
 * Controler class definition
 * generated from StarUML project Mag8+ on 24/06/2012
 *
 * @author Luc Hernandez
 */

public class Controler implements java.awt.event.MouseWheelListener,
                                  java.awt.event.WindowListener,
                                  java.awt.event.ActionListener {
  private History model;
  public Controler(History h) {
    model = h;
  }

  public void actionPerformed(java.awt.event.ActionEvent e) {

    if (model.isQuestionIsPurge(e.getActionCommand())) {
      model.purge();
      ((javax.swing.JTextField) e.getSource()).setText("");
    }else
    {
    model.generate(e.getActionCommand());
    ((javax.swing.JTextField) e.getSource()).setText("");
  }
  }

  public void mouseWheelMoved(java.awt.event.MouseWheelEvent e) {
    model.shiftSelection(e.getWheelRotation());
  }

  public void windowClosing(java.awt.event.WindowEvent e) {
    model.close();
    ((javax.swing.JFrame) e.getSource()).dispose();
    System.exit(0);
  }

  public void windowOpened(java.awt.event.WindowEvent e) {}
  public void windowClosed(java.awt.event.WindowEvent e) {}
  public void windowIconified(java.awt.event.WindowEvent e) {}
  public void windowDeiconified(java.awt.event.WindowEvent e) {}
  public void windowActivated(java.awt.event.WindowEvent e) {}
  public void windowDeactivated(java.awt.event.WindowEvent e) {}
}
