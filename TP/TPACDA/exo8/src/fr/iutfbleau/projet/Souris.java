package fr.iutfbleau.projet;

import java.awt.*;
import java.awt.event.*;
import javax.swing.JLabel; 
import javax.swing.ImageIcon; 
import javax.swing.*;




public class Souris implements MouseListener
{

private Screen fen;
private QuestionSuivante nxt;

public Souris(Screen fen,QuestionSuivante nxt)
{	
    this.nxt = nxt;
    this.fen = fen;
   

  
	

}


   @Override
        public void mouseClicked(MouseEvent event) {
         
             System.out.println("X : " + event.getX() +  " Y : " + event.getY());
          
             if (event.getX() > fen.getWidth()/2) {
                 System.out.println("droite");

                 nxt.next();
        
         }

                if (event.getX() < fen.getWidth()/2) {
                 System.out.println("gauche");

                 nxt.prev();
        
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