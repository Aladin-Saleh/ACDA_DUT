import java.util.*;
import javax.swing.*;
import java.awt.Color;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;


public class WheelGestion implements MouseWheelListener
{



private JTextArea zone;
private ArrayList<Color> importance = new ArrayList<Color>();
private int i = 1;
private boolean estImportant = false;

public WheelGestion(JTextArea z)
{
	importance.add(0,Color.WHITE);
	importance.add(1,Color.RED);
	importance.add(2,Color.WHITE);

	
	this.zone = z;
}


@Override
public void mouseWheelMoved(MouseWheelEvent e)
{

	System.out.println(estImportant);

	zone.setBackground(importance.get(++i%importance.size()));
	zone.repaint();
	estImportant = !estImportant;

	
}










}