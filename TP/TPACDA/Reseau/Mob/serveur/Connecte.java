package serveur;

import java.io.IOException;
import java.io.InputStream;
import java.io.DataOutputStream;
import java.net.Socket;

/**
 * Connecte class definition
 * generated from StarUML project Mob on 17/03/2012
 *
 * @author Luc Hernandez
 */
public class Connecte extends Thread {
  private InputStream in;
  private DataOutputStream out;
  private ListeConnectes parent;

  public Connecte(Socket s) throws IOException {
    in  = s.getInputStream();
    out = new DataOutputStream(s.getOutputStream());
  }

  public void setParent(ListeConnectes l) {
    parent = l;
  }

  public void envoyer(int taille) {
    try {
      out.writeInt(taille);
      out.flush();
    } catch(IOException e) {
      // ignore
    }
  }

  public void run() {
    try {
      while(in.read() != -1)
        ; // corps vide
    } catch(IOException e) {
    }
    parent.supprimer(this);
    try {
      out.close();
    } catch(IOException e2) {
      // ignore
    }
  }
}
