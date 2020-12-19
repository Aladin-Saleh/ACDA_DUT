import java.io.IOException;

import serveur.*;

/**
 * ServeurStart class definition
 * generated from StarUML project Mob on 17/03/2012
 *
 * @author Luc Hernandez
 */
public class ServeurStart {
  public static void main(String[] args) {
    try {
      MaitreDHotel mdh = new MaitreDHotel(11111);
      int echecs = 0;
      while(echecs<3)
        try {
          mdh.accueillir();
        } catch (IOException e) {
          System.err.println("Echec de la connexion avec un client !");
          echecs++;
        }
      mdh.quitter();
    } catch (IOException e) {
      System.err.println("Impossible de demarrer le serveur !");
    }
  }
}
