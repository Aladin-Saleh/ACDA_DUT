import java.awt.*;
import java.awt.event.*;
import javax.swing.JLabel; 
import javax.swing.ImageIcon; 



public class Souris implements MouseListener
{


private Screen fen;
private JLabel img;
private String photo[] = new String[2];
private int i = 0;

public Souris(Screen fen,JLabel img)
{	
	this.fen = fen;
	this.img = img;
photo[0] = new String("singe.jpg");
photo[1] = "yoda.jpg";

	

}


   @Override
        public void mouseClicked(MouseEvent event) {
             System.out.println("X : " + event.getX() +  " Y : " + event.getY());
              fen.remove(img);

             JLabel image = new JLabel(new ImageIcon(photo[i]));
             
             fen.add(image);
			 fen.revalidate();
			 
          	          	    

        }
  
        @Override
        public void mouseEntered(MouseEvent event) {
                 
              
                 
        }
  
        @Override
        public void mouseExited(MouseEvent event) {
  
              
                 
        }
  
        @Override
        public void mousePressed(MouseEvent event) {
  
                
                 
        }
  
        @Override
        public void mouseReleased(MouseEvent event) {
                 
                       
        }   





}