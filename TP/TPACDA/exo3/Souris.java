import java.awt.*;
import java.awt.event.*;
import javax.swing.JLabel; 
import javax.swing.ImageIcon; 



public class Souris implements MouseListener
{


private Screen fen;
private JLabel img;
private String photo[] = new String[6];
private int i = 0;
private int indice = 0;

public Souris(Screen fen,JLabel img)
{	
	this.fen = fen;
	this.img = img;

for (i = 0; i < photo.length;i++ ) {
    
    photo[i] = i+".jpg";


}

	

}


   @Override
        public void mouseClicked(MouseEvent event) {
         
             System.out.println("X : " + event.getX() +  " Y : " + event.getY());
          

             fen.remove(img);
             img.setOpaque(true);

             JLabel image = new JLabel(new ImageIcon(photo[++indice%this.photo.length]));
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