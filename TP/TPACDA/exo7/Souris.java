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
private int indice = 1;
private int val;

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
          
             if (event.getX() > fen.getWidth()/2) {
                 System.out.println("droite");


             fen.remove(img);
             img.setOpaque(true);
             val =  indice%this.photo.length;
              if (val == 0) {
                val =1;
             }
             JLabel image = new JLabel(new ImageIcon(photo[++indice%this.photo.length]));//Permet de revenir à 0 quand on atteint la limite
            
             System.out.println("indice + modulo : " + indice%this.photo.length);
             image.setOpaque(true);

             fen.add(image);
                   fen.revalidate();

             }

             if (event.getX() < fen.getWidth()/2) {
                 System.out.println("droite");


             fen.remove(img);
             img.setOpaque(true);
             val =  indice%this.photo.length;
              if (val == 0) {
                val =1;
             }
             JLabel image = new JLabel(new ImageIcon(photo[--indice%this.photo.length]));//Permet de revenir à 0 quand on atteint la limite
            
             System.out.println("indice + modulo : " + indice%this.photo.length);
             image.setOpaque(true);

             fen.add(image);
                   fen.revalidate();

             }


			 
          	          	    

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