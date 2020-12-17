
import java.util.*;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.*;

/**
 * 
 */
public class DrawGraph extends JPanel{

    private int multiplicateurReponse;
  
    public DrawGraph(int multiplicateur) {
        this.multiplicateurReponse = multiplicateur;
    }


    /**
     * @param g
     */
    @Override
    protected void paintComponent(Graphics g) {
        // TODO implement here
        Graphics secondPinceau = g.create();

        secondPinceau.setColor(Color.BLACK);
        secondPinceau.fillRect(0, 490-(25*multiplicateurReponse), 120, 120+(25*multiplicateurReponse));

        secondPinceau.setColor(Color.RED);
        secondPinceau.fillRect(10,500-(25*multiplicateurReponse),100,100+(25*multiplicateurReponse));

        
    }

}