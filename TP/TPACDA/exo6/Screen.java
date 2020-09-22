import java.awt.*;
import javax.swing.*;

public class Screen extends JFrame
{
	
	public Screen()
	{

		this.setSize(400,400);
		this.setLocation(100,100);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel pan = new JPanel();
		this.add(pan);

		Requete sql = new Requete();

		sql.nbrModule();
		
		

			sql.Module();
			
		

		JLabel[] mdl = new JLabel[3];
		


		
		

		this.setVisible(true);

	}

}