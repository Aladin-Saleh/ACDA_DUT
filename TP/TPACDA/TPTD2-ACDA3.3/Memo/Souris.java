import java.awt.event.MouseWheelEvent;
import java.util.ArrayList;
import java.awt.*;

public class Souris implements java.awt.event.MouseWheelListener {

  
    private javax.swing.JTextArea zone;
    private  ArrayList<Color> c = new ArrayList<Color>();
    private int i = 0;

    public Souris(javax.swing.JTextArea zone)
    {
        
        c.add(0, Color.RED);
        c.add(1, Color.RED);
        c.add(2, Color.WHITE);

        this.zone = zone;
    }

    @Override
    public void mouseWheelMoved(MouseWheelEvent e) {
       
        int val = ++i%c.size();
        System.out.println(i);
        zone.setBackground(c.get(val));
        zone.repaint();

    }
    
}
