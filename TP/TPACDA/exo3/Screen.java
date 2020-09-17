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

		


		JLabel image = new JLabel(new ImageIcon("3.jpg"));
		image.setOpaque(true);


	

		this.add(image);
		




		Souris souris = new Souris(this,image);
		this.addMouseListener(souris);

		this.setVisible(true);
	}

}