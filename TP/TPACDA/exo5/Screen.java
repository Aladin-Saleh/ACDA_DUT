import java.awt.*;
import javax.swing.JFrame;
import javax.swing.JLabel; 
import javax.swing.ImageIcon; 
import javax.swing.JDialog;
import javax.swing.JButton;
import javax.swing.JPanel;




public class Screen extends JFrame  
{

	
	public Screen()
	{

		this.setSize(500,500);
		this.setLocation(100,100);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                              
		JPanel conteneur = new JPanel();
		this.add(conteneur);
      	
      	JButton[] bouton = new JButton[6];
		GridBagConstraints[] gbc = new GridBagConstraints[6];

      	for (int i = 1;i <= 5 ;++i ) {

      		bouton[i] = new JButton(""+i);
      		gbc[i] = new GridBagConstraints();
      		
      	}

      	conteneur.setLayout(new GridBagLayout());

		gbc[1].gridx = 0;      // la plage de cellules commence à la première colonne
		gbc[1].gridy = 0;      // la plage de cellules commence à la deuxième ligne
		gbc[1].gridwidth = 2;  // la plage de cellules englobe deux colonnes
		gbc[1].gridheight = 1; // la plage de cellules englobe une seule lign	e
		gbc[1].fill = GridBagConstraints.BOTH;     // n'occupe pas tout l'espace de la plage
		gbc[1].weightx = 1.0;  // souhaite plus de largeur si possible
		gbc[1].weighty = 1.0;  // n'a pas besoin de hauteur supplémentaire
		

		gbc[2].gridx = 2;      // la plage de cellules commence à la première colonne
		gbc[2].gridy = 0;      // la plage de cellules commence à la deuxième ligne
		gbc[2].gridwidth = 1;  // la plage de cellules englobe deux colonnes
		gbc[2].gridheight = 2; // la plage de cellules englobe une seule lign	e
		gbc[2].fill = GridBagConstraints.BOTH;     // n'occupe pas tout l'espace de la plage
		gbc[2].weightx = 1.0;  // souhaite plus de largeur si possible
		gbc[2].weighty = 1.0; 


		gbc[3].gridx = 0;      // la plage de cellules commence à la première colonne
		gbc[3].gridy = 1;      // la plage de cellules commence à la deuxième ligne
		gbc[3].gridwidth = 1;  // la plage de cellules englobe deux colonnes
		gbc[3].gridheight = 2; // la plage de cellules englobe une seule lign	e
		gbc[3].fill = GridBagConstraints.BOTH;     // n'occupe pas tout l'espace de la plage
		gbc[3].weightx = 1.0;  // souhaite plus de largeur si possible
		gbc[3].weighty = 1.0; 



		gbc[4].gridx = 1;      // la plage de cellules commence à la première colonne
		gbc[4].gridy = 2;      // la plage de cellules commence à la deuxième ligne
		gbc[4].gridwidth = 2;  // la plage de cellules englobe deux colonnes
		gbc[4].gridheight = 2; // la plage de cellules englobe une seule lign	e
		gbc[4].fill = GridBagConstraints.BOTH;     // n'occupe pas tout l'espace de la plage
		gbc[4].weightx = 1.0;  // souhaite plus de largeur si possible
		gbc[4].weighty = 1.0; 


		gbc[5].gridx = 1;      // la plage de cellules commence à la première colonne
		gbc[5].gridy = 1;      // la plage de cellules commence à la deuxième ligne
		gbc[5].gridwidth = 1;  // la plage de cellules englobe deux colonnes
		gbc[5].gridheight = 1; // la plage de cellules englobe une seule lign	e
		gbc[5].fill = GridBagConstraints.BOTH;     // n'occupe pas tout l'espace de la plage
		gbc[5].weightx = 1;  // souhaite plus de largeur si possible
		gbc[5].weighty = 1; 


		for (int j = 1; j <= 5  ; ++j ) {
			conteneur.add(bouton[j],gbc[j]);
		}

		this.add(conteneur);


		this.setVisible(true);
	}

}