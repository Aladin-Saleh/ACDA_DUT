import java.awt.*;
import javax.swing.*;

public class Screen extends JFrame
{
	
	public Screen()
	{



		this.setSize(400,400);
		this.setLocation(100,100);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel pan = new JPanel();

		Requete sql = new Requete();

		String[] module = new String[sql.nbrModule()];

		sql.Module(module);
		


		

		JLabel[] mdl = new JLabel[sql.nbrModule()];



		GridBagConstraints[] gbc = new GridBagConstraints[4];


      	for (int i = 0;i < 3 ;++i ) {

      		mdl[i] = new JLabel(module[i]);
			//pan.add(mdl[i]);

						JLabel[] champC = new JLabel[sql.nbrChamp(sql.getIDModule(module[i]))];
								for (int j = 0; j< sql.nbrChamp(sql.getIDModule(module[i]));j++ ) {
										String[] champ = new String[sql.nbrChamp(sql.getIDModule(module[i]))];
						
											sql.getChamp(champ,sql.getIDModule(module[i]));


											champC[j] = new JLabel(champ[j]);
      										
											
											pan.add(champC[j]);

				}
      		gbc[i] = new GridBagConstraints();
      		
      	}

      	pan.setLayout(new GridBagLayout());

		gbc[0].gridx = 0;      // la plage de cellules commence à la première colonne
		gbc[0].gridy = 0;      // la plage de cellules commence à la deuxième ligne
		gbc[0].gridwidth = 2;  // la plage de cellules englobe deux colonnes
		gbc[0].gridheight = 1; // la plage de cellules englobe une seule lign	e
		gbc[0].fill = GridBagConstraints.BOTH;     // n'occupe pas tout l'espace de la plage
		gbc[0].weightx = 1.0;  // souhaite plus de largeur si possible
		gbc[0].weighty = 1.0;

		gbc[1].gridx = 0;      // la plage de cellules commence à la première colonne
		gbc[1].gridy = 1;      // la plage de cellules commence à la deuxième ligne
		gbc[1].gridwidth = 2;  // la plage de cellules englobe deux colonnes
		gbc[1].gridheight = 1; // la plage de cellules englobe une seule lign	e
		gbc[1].fill = GridBagConstraints.BOTH;     // n'occupe pas tout l'espace de la plage
		gbc[1].weightx = 1.0;  // souhaite plus de largeur si possible
		gbc[1].weighty = 1.0; 

		gbc[2].gridx = 0;      // la plage de cellules commence à la première colonne
		gbc[2].gridy = 0;      // la plage de cellules commence à la deuxième ligne
		gbc[2].gridwidth = 1;  // la plage de cellules englobe deux colonnes
		gbc[2].gridheight = 2; // la plage de cellules englobe une seule lign	e
		gbc[2].fill = GridBagConstraints.BOTH;     // n'occupe pas tout l'espace de la plage
		gbc[2].weightx = 1.0;  // souhaite plus de largeur si possible
		gbc[2].weighty = 1.0; 



				for (int j = 0; j < 3 ; ++j ) {
					pan.add(mdl[j],gbc[j]);
			}


		
		this.add(pan);
		

		this.setVisible(true);

	}

}