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
    private GridLayout gridL = new GridLayout(2,1);

    /**
     * 
     */
    private JTextField userNameEntry;

    /**
     * 
     */
    private JTextField userNumEntry;

    /**
     * 
     */
    private ButtonListener btnLstnr;


    /**
     * 
     */
    private ButtonListener btnListener;

    /**
     * @param btnL
     */
    public ChampDeTexte(ButtonListener btnL) {
        // TODO implement here
        this.setLayout(gridL);
        userNameEntry = new JTextField(); 
        userNumEntry = new JTextField(); 
        this.add(userNameEntry);
        this.add(userNumEntry);
    }

    /**
     * @return
     */
    public String getName() {
        // TODO implement here
        return "";
    }

    /**
     * @return
     */
    public String getNum() {
        // TODO implement here
        return "";
    }

}