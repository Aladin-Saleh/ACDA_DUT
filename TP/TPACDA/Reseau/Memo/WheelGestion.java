import java.util.*;
import javax.swing.*;
import java.awt.Color;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;


public class WheelGestion implements MouseWheelListener
{



private JTextArea zone;
private int i = 1;
private String zoneBackgroundColor="WHITE";
private String iptc;

public WheelGestion(JTextArea z,String importance)
{
	this.zone = z;
	if(importance.equals("RED"))
	{
		zoneBackgroundColor ="RED";
		zone.setBackground(Color.RED);
	}

}

@Override
public void mouseWheelMoved(MouseWheelEvent e)
{
	i = e.getWheelRotation();
	if(i < 0 )
	{	
		//HAUT
		System.out.println("haut");
		zone.setBackground(Color.red);
		zone.repaint();
		zoneBackgroundColor = "RED";
	}
	else
	{
		//BAS
		System.out.println("bas");
		zone.setBackground(Color.WHITE);
		zone.repaint();
		zoneBackgroundColor = "WHITE";

	}
	//System.out.println(zone.getBackground());
}

public String getColorZone()
{
	return zoneBackgroundColor;
}

}
