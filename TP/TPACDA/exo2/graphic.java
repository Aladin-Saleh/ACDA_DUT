import javax.swing.JComponent;
import java.awt.Graphics;
import java.awt.*;

public class graphic extends JComponent
{
    @Override
  protected void paintComponent(Graphics pinceau) {
    // obligatoire : on crée un nouveau pinceau pour pouvoir le modifier plus tard
    Graphics secondPinceau = pinceau.create();
    // obligatoire : si le composant n'est pas censé être transparent
    if (this.isOpaque()) {
      // obligatoire : on repeint toute la surface avec la couleur de fond
      secondPinceau.setColor(this.getBackground());
      secondPinceau.fillRect(0, 0, this.getWidth(), this.getHeight());
    }
    // maintenant on dessine ce que l'on veut
    secondPinceau.setColor(Color.BLACK);
    secondPinceau.drawString(getPays(), 10, 20);

    secondPinceau.setColor(Color.BLACK);
    secondPinceau.drawString(getPoint(), 10, 20);
  }







}