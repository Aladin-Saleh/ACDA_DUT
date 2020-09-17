import java.awt.*;
import java.awt.event.*;



public class Souris implements MouseListener
{


private Screen fen;
private JLabel img;

public Souris(Screen fen,JLabel img)
{
	this.fen = fen;
	this.img = img;
}

   @Override
        public void mouseClicked(MouseEvent event) {
             System.out.println("X : " + event.getX() +  " Y : " + event.getY());
             fen.remove(img);
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