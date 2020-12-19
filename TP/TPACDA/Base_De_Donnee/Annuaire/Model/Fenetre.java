import java.awt.*;
import java.util.*;
import javax.swing.*;

/**
 * 
 */
public class Fenetre extends JFrame {

   


    /**
     * 
     */
    private ChampDeTexte chmpTexte;

    /**
     * 
     */
    public Fenetre() {
        // TODO implement here
        this.setLocation(500, 100);
        this.setSize(500,500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        InterractionBaseDeDonnee iBd = new InterractionBaseDeDonnee();
        ChampDeTexte chmpTexte = new ChampDeTexte();
        JLabel message = new JLabel();
        ButtonListener btnListener = new ButtonListener(iBd,chmpTexte,message);
       
        

        this.setLayout(new GridLayout(3,1));
        this.add(chmpTexte);
        this.add(btnListener);
        this.add(message);
        
        
        this.setVisible(true);
    }

}