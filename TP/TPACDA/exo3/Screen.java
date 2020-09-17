import java.awt.*;
import javax.swing.JFrame;
import javax.swing.JLabel; 
import javax.swing.ImageIcon; 



public class Screen extends JFrame  
{


	public Screen()
	{
		this.setSize(500,500);
		this.setLocation(100,100);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JLabel image = new JLabel(new ImageIcon("index.jpg"));
		this.add(image);
		JLabel image2 = new JLabel(new ImageIcon("yoda.jpg"));
		this.add(image2);
		JLabel image3 = new JLabel(new ImageIcon("index.jpg"));
		this.add(image3);

		Souris souris = new Souris(this);
		this.addMouseListener(souris);

		this.setVisible(true);
	}

}