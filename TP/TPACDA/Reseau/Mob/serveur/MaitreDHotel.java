package serveur;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * MaitreDHotel class definition
 * generated from StarUML project Mob on 17/03/2012
 *
 * @author Luc Hernandez
 */
public class MaitreDHotel {
  private ListeConnectes liste;
  private ServerSocket srvskt;

  public MaitreDHotel(int port) throws IOException{
    srvskt = new ServerSocket(port);
    liste = new ListeConnectes();
  }

  public void accueillir() throws IOException {
    Socket s = srvskt.accept();
    try {
      Connecte c = new Connecte(s);
      liste.ajouter(c);
      c.start();
    } catch(IOException e) {
      System.err.println("Connexion mal formee !");
      try {
        s.close();
      }catch(IOException e2) {
        // ignore
      }
    }
  }

  public void quitter() {
    try {
      srvskt.close();
    }catch(IOException e) {
      // ignore
    }
  }
}
