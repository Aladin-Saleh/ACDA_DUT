package fr.iutfbleau.projet;

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

  
  		 
		ClassLoader loader = Thread.currentThread().getContextClassLoader();

		JLabel image = new JLabel(new ImageIcon("res/img/3.jpg"));
		image.setOpaque(true);


	

		this.add(image);
		




		Souris souris = new Souris(this,image);
		this.addMouseListener(souris);

		this.setVisible(true);
	}

}