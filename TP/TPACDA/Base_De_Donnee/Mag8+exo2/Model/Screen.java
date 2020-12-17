import javax.swing.*;
import java.util.*;
import java.awt.*;

/**
 * 
 */
public class Screen extends JFrame {

    private GridLayout gridLayout = new GridLayout(1,20);
    public Screen() {

        this.setLocation(100,100);
        this.setSize(800, 600);
        this.setTitle("Graphique de Réponse");
        this.setResizable(false);
        InteractionBD interactionBD = new InteractionBD();
        int[] bufferCountReponse = interactionBD.getCountReponse();
        JPanel containerGraph = new JPanel();
        DrawGraph[] dGraphs = new DrawGraph[20];
        containerGraph.setLayout(gridLayout);
        for (int i = 0; i < 20; i++) {
            System.out.println(bufferCountReponse[i]);
            dGraphs[i] = new DrawGraph(bufferCountReponse[i]);
            containerGraph.add(dGraphs[i]);
        }
        this.add(containerGraph);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);

    }

    /**
     * 
     */
    private Controlleur controlleur;

    /**
     * 
     */
    private DrawGraph graph;

  

}