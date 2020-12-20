import javax.swing.*;
import java.util.*;
import java.awt.*;
import java.awt.event.*;


/**
 * 
 */
public class ButtonListener extends JPanel implements ActionListener
{
    
    private JLabel msg;

     /**
     * 
     */
    private ChampDeTexte monChmpTexte;
    
    /**
     * 
     */
    private String returnString ="Bienvenue dans l'annuaire !";
        
    /**
     * 
     */
    private InterractionBaseDeDonnee interactBD;

    /**
     * @param e
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO implement here
        System.out.println("Click !");
       
        System.out.println(monChmpTexte.getName() + " + "+ monChmpTexte.getNum());

        if (monChmpTexte.getName().equals("") && monChmpTexte.getNum().equals("")) 
        {
            //Si tout les champs de texte sont vides
            returnString = "Entrer un numéro ou un nom pour que l'annuaire fasse son travail ! ";
        }
        else if(monChmpTexte.getName().equals("") && monChmpTexte.getNum() != null)
        {
            //Si il n'y a que le champs de nom qui est null/vide et que le champ de numero ne l'est pas
            System.out.println("Valid" + monChmpTexte.getNum());
            if(interactBD.isNumExist(monChmpTexte.getNum()))
            {
                //Si le numero existe alors on donne le nom qui lui est associé 
                returnString = interactBD.getNameUser(monChmpTexte.getNum());
            }
            else
            {
                //Sinon on ne connait pas le numero
                returnString = "Notre base de donnée ne possède pas cette information, vous pouvez l'ajouter en ajoutant un nom à ce numéro";
            }

        }
        else if(monChmpTexte.getName() != null && monChmpTexte.getNum().equals(""))
        {
            //Si le champ de nom n'est pas vide et que le champ numero l'est 
            if (interactBD.isNameExist(monChmpTexte.getName())) 
            {
             //Si le nom existe alors on donne le numero qui lui est associé   
            returnString = interactBD.getNumUser(monChmpTexte.getName());
            }
            else
            {
                //Sinon on ne connait pas le nom
                returnString = "Notre base de donnée ne possède pas cette information, vous pouvez l'ajouter en ajoutant un numéro à ce nom";
            }

        }
        else if(monChmpTexte.getName() != null && monChmpTexte.getNum() != null)
        {
            //Si le nom et le numero n'est pas vide 
            if (interactBD.isNameExist(monChmpTexte.getName()) && !interactBD.isNumExist(monChmpTexte.getNum())) {
                //Si le nom existe et le numero n'existe pas
                interactBD.updateUserNum(monChmpTexte.getNum(),monChmpTexte.getName());
                returnString = "Annuaire mise à jour !";
            }
            else if(!interactBD.isNameExist(monChmpTexte.getName()) && interactBD.isNumExist(monChmpTexte.getNum()))
            {
                //Si le nom n'existe pas et le numéro existe
                interactBD.updateUserName(monChmpTexte.getName(),monChmpTexte.getNum());
                returnString = "Annuaire mise à jour !";
            }
            else if(!interactBD.isNameExist(monChmpTexte.getName()) && !interactBD.isNumExist(monChmpTexte.getNum()))
            {
                //Si le nom et le numéro n'existe pas
                interactBD.addUser(monChmpTexte.getName(),monChmpTexte.getNum());
               
                returnString = "Ajout à notre annuaire !";
                
            }
        }
       
        System.out.println(returnString);
        monChmpTexte.userNameEntry.setText("");
        monChmpTexte.userNumEntry.setText("");


    }



    public String getReturString()
    {
       return returnString;
    }

    /**
     * @param interactBD
     */
    public ButtonListener(InterractionBaseDeDonnee interactBD,ChampDeTexte chmpTexte,JLabel msgJLabel) {
        // TODO implement here
        this.interactBD = interactBD;
        this.monChmpTexte = chmpTexte;
        JButton validationButton = new JButton("Valider information");
        this.add(validationButton);
        validationButton.addActionListener(this);

    }

}


