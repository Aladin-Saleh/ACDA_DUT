package fr.iutfbleau.projet;

import java.awt.*;
import java.awt.event.*;
import javax.swing.JLabel;


import javax.swing.ImageIcon; 
import javax.swing.*;

public class QuestionSuivante
{
	private JLabel qstn;
private Screen fen;
private JPanel panQ;
private int a,b,rep;
private String[] question = new String[10];
private int indice = 0;
private CreateQuestion generator;
private int[] reponse = new int[50];

	public QuestionSuivante(Screen fen,JLabel qstn,JPanel panQ,CreateQuestion generator)
	{
		this.fen = fen;
    	this.qstn = qstn;
    	this.panQ = panQ;

    for (int i = 0;i<10 ;++i ) {
        a = generator.generationDeQuestion();
        b = generator.generationDeQuestion();
        rep = a*b;
        question[i] = String.valueOf(a)+ "x" +String.valueOf(b);
       

    }

	}

	public void next()
	{

		 		 panQ.remove(qstn);
		 		 fen.remove(panQ);
                 qstn = new JLabel(question[++indice%this.question.length]);
                 qstn.setFont(new Font("Serif", Font.BOLD, 48));
                 qstn.setForeground(Color.WHITE);
                 qstn.setBackground(Color.BLUE);
                 qstn.setOpaque(true);
                 //panQ.setOpaque(true);
                 
                 panQ.add(qstn,BorderLayout.WEST);
                 
                 fen.add(panQ);
                 panQ.revalidate();


	}




	public void prev()
	{

		 		 panQ.remove(qstn);
                 qstn = new JLabel(question[--indice%this.question.length]);
                 qstn.setOpaque(true);
                 qstn.setFont(new Font("Serif", Font.BOLD, 48));
                 qstn.setForeground(Color.WHITE);
                 qstn.setBackground(Color.BLUE);
                 qstn.setOpaque(true);
                 //panQ.setOpaque(true);
                 panQ.add(qstn,BorderLayout.CENTER);
                 
                 fen.add(panQ);
                 panQ.revalidate();


	}


}