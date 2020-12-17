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
        ButtonListener btnListener = new ButtonListener(iBd);
        ChampDeTexte chmpTexte = new ChampDeTexte(btnListener);
        this.add(chmpTexte);
        
        this.setVisible(true);
    }

}