import java.io.*;
import java.net.*;

/**
 * ServeurDepot class definition
 * generated from StarUML project Memo on 18/06/2012
 *
 * @author Luc Hernandez
 */




public class ServeurDepot {
  public String texte;
  public ServerSocket srvskt;
  BufferedReader reception;
  BufferedWriter envoi;
  Socket skt;
  public void ecoute() {
    try {
      skt = srvskt.accept();
      try {
        reception = new BufferedReader(
                    new InputStreamReader(
                    skt.getInputStream()));
        envoi = new BufferedWriter(
                new OutputStreamWriter(
                skt.getOutputStream()));
        System.out.println("Connexion etablie");
        String choix = reception.readLine();
        System.out.println(choix);
        if (choix.equals("Load"))
          envoyerTexte();
        else if (choix.equals("Store"))
          recevoirTexte();
      } catch (IOException e) {
        System.err.println("Lecture de la requete impossible");
      } finally {
        try{
          skt.close();
        } catch (IOException e) {
          System.err.println("Cloture de connexion impossible");
        }
        System.out.println("Connexion terminee");
      }
    } catch(IOException e) {
      System.err.println("Connexion impossible");
    }
  }

  public ServeurDepot(int port) throws IOException {
    srvskt = new ServerSocket(port);
    texte = "";
  }

  public void envoyerTexte() {
    try {
      envoi.write(texte);
      envoi.newLine();
      envoi.flush();
      System.out.println("Texte transmis : " + texte);
    } catch(IOException e) {
      System.err.println("Transmission du texte impossible");
    }
  }

  public void recevoirTexte() {
    try {
      texte = reception.readLine();
      System.out.println("Texte recu : " + texte);
    } catch (IOException e) {
      System.err.println("Lecture de la mise a jour impossible");
    }
  }
}
