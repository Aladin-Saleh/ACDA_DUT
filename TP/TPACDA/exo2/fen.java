import javax.swing.*;
import java.awt.*;

public class fen extends JFrame
{


	public fen()
	{

		 this.setSize(400, 400);
   		 this.setLocation(100, 100);
    	 this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    	 graphic dessin = new graphic();
    	 this.add(dessin);







    	 this.setVisible(true);
	}



}