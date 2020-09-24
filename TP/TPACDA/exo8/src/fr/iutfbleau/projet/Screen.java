package fr.iutfbleau.projet;
import java.awt.*;
import javax.swing.*;

	


public class Screen extends JFrame
{


	public Screen()
	{
		int a,b,rep;
		String[] question = new String[10];
		String[] reponse = new String[10];



		this.setSize(200,200);
		this.setLocation(100,100);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel panQuestion = new JPanel();
		JPanel panReponse = new JPanel();
		

		createQuestion qsnt = new createQuestion();

		System.out.println(qsnt.generationDeQuestion());
		

		JLabel[] affichageQuestion = new JLabel[10];
		

		for (int i = 0;i < 10;i++ ) {
			
		a = qsnt.generationDeQuestion();
		b = qsnt.generationDeQuestion();
		rep = a*b;	
		question[i] = String.valueOf(a)+ "x" +String.valueOf(b);
		reponse[i] = String.valueOf(rep);
		affichageQuestion[i] = new JLabel(String.valueOf(a)+ "x" +String.valueOf(b)+ "="+reponse[i]);
		
		panQuestion.add(affichageQuestion[i]);

			

		}

		this.add(panQuestion);

		this.setVisible(true);



	}

}