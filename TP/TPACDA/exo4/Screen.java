import java.awt.*;
import javax.swing.JFrame;
import javax.swing.JLabel; 
import javax.swing.ImageIcon; 
import javax.swing.JDialog;


public class Screen extends JFrame  
{

	
	public Screen()
	{

		this.setSize(500,500);
		this.setLocation(100,100);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JDialog pop = new JDialog(this,"test");
		JLabel l = new JLabel("this is a dialog box"); 
  
  			pop.add(l); 
            pop.setSize(100, 100); 
            pop.setVisible(true);  


		JLabel image = new JLabel(new ImageIcon("3.jpg"));
		image.setOpaque(true);


	

		this.add(image);
		




		Souris souris = new Souris(this,image);
		this.addMouseListener(souris);

		this.setVisible(true);
	}

}