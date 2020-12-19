import javax.swing.*;
import java.util.*;
import java.awt.*;

/**
 * 
 */
public class ChampDeTexte extends JPanel {


    /**
     * 
     */
    private GridLayout gridL = new GridLayout(4,1);

    /**
     * 
     */
    public JTextField userNameEntry;

    /**
     * 
     */
    public JTextField userNumEntry;

    /**
     * 
     */
    public ChampDeTexte() {
        // TODO implement here
        this.setLayout(gridL);
        this.add(new JLabel("Nom"));
        userNameEntry = new JTextField();
        
        userNumEntry = new JTextField();
        
        this.add(userNameEntry);
        this.add(new JLabel("Numero"));
        this.add(userNumEntry);
    }

    /**
     * @return
     */
    public String getName() {
        return userNameEntry.getText();
    }

    /**
     * @return
     */
    public String getNum() {
        return userNumEntry.getText();
    }

}