/**
 * Start class definition
 * based on StarUML project Mag8+ on 24/06/2012
 *
 * @author Luc Hernandez
 */

public class Start extends Thread {
  private static javax.swing.JFrame window;
  public static void main(String[] args) {
    window = new javax.swing.JFrame("Mag8");
    javax.swing.JLabel display = new javax.swing.JLabel("?", javax.swing.JLabel.CENTER);
    javax.swing.JTextField input = new javax.swing.JTextField();

    History model;
    if (args.length > 1)
      model = new History(display, args[0], args[1]);
    else
      model = new History(display, null, null);

    Controler control = new Controler(model);
    display.addMouseWheelListener(control);
    input.addActionListener(control);
    window.addWindowListener(control);

    window.setResizable(false);
    window.setSize(400, 100);
    window.setLocation(100, 100);
    window.setLayout(new java.awt.BorderLayout());
    window.add(display, java.awt.BorderLayout.CENTER);
    window.add(input, java.awt.BorderLayout.SOUTH);
    javax.swing.SwingUtilities.invokeLater(new Start());
  }
  public void run() {
    window.setVisible(true);
  }
}
