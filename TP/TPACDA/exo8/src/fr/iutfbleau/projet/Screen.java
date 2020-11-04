package fr.iutfbleau.projet;
import java.awt.*;
import javax.swing.*;

	

public class Screen extends JFrame
{


	public Screen()
	{
	



		this.setSize(200,200);
		this.setLocation(100,100);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panQuestion = new JPanel();
		JPanel panReponse = new JPanel();
		panReponse.setBackground(Color.DARK_GRAY);

		CreateQuestion gen = new CreateQuestion(this);
		JLabel affichageQuestion = new JLabel("OK");
		affichageQuestion.setFont(new Font("Serif", Font.BOLD, 48));
		
		gen.nombreDeReponse();
		JLabel affichageRep = new JLabel("OK");

	

		panQuestion.add(affichageQuestion,BorderLayout.CENTER);

		QuestionSuivante nxt = new QuestionSuivante(this,affichageQuestion,panQuestion,gen);

		Souris gestionSouris = new Souris(this,nxt);

		this.addMouseListener(gestionSouris);
		this.add(panQuestion,BorderLayout.WEST);
				

		panReponse.add(affichageRep);
		this.add(panReponse,BorderLayout.EAST);





		this.setVisible(true);



	}

}