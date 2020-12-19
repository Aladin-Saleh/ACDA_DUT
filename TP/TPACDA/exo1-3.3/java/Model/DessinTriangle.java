
import java.util.*;
import java.awt.*;
import javax.swing.*;

/**
 * 
 */
public class DessinTriangle extends JComponent {

    /**
     * Default constructor
     */
    public DessinTriangle() {
    }



    /**
     * @param p
     */
    
    protected void paintComponent(Graphics p) {
        // TODO implement here

        
    Graphics secondPinceau = p.create();
    // obligatoire : si le composant n'est pas censé être transparent
    if (this.isOpaque()) {
      // obligatoire : on repeint toute la surface avec la couleur de fond
      secondPinceau.setColor(this.getBackground());
      secondPinceau.fillRect(0, 0, this.getWidth(), this.getHeight());
    }
    // maintenant on dessine ce que l'on veut
    secondPinceau.setColor(Color.BLUE);
    secondPinceau.fillPolygon(xPoints, yPoints, 3);
    }

}