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




	public void generationReponse(int[] rep,int bnRep,int nbrReponse)
	{


	



	}






}