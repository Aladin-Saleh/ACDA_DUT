package fr.iutfbleau.projet;

import java.util.*;
import java.awt.*;
import javax.swing.*;


public class CreateQuestion
{


private Screen fen;

public CreateQuestion(Screen fen)
{

	this.fen = fen;

}


	public int generationDeQuestion()
	{
		int nb;
		
		Random random = new Random();
		
		

		nb = random.nextInt(255);
		return nb;

	}



	public void generationReponse()
	{

	ButtonGroup choix = new ButtonGroup();
    JRadioButton[] rep = new JRadioButton[3];
    


   	for (int i = 0;i < 3 ;i++ ) {
   		
   		rep[i] = JRadioButton("test");
   		choix.add(rep[i]);
   		fen.add(rep[i],BorderLayout.CENTER);

   	}


    




	}






}