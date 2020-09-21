import java.awt.*;
import javax.swing.*;

public class Screen extends JFrame
{
	
	public Screen()
	{

		this.setSize(400,400);
		this.setLocation(100,100);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


		Requete sql = new Requete();
		

		this.setVisible(true);

	}

}