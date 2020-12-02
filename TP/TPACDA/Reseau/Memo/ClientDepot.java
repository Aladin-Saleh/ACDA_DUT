import java.io.*;
import java.net.*;

/**
 * ClientDepot class definition
 * generated from StarUML project Memo on 18/06/2012
 *
 * @author Luc Hernandez
 */




public class ClientDepot {
  private String hote;
  private int port;
  private Socket skt;
  private BufferedReader reception;
  private BufferedWriter envoi;
  private String color ="";

  public String extraire() {
    String res = "";

    try {
      connecter();
      try {
        envoi.write("Load");
        envoi.newLine();
        envoi.flush();
        res = reception.readLine();
        color = reception.readLine();
      } catch(IOException e) {
        System.err.println("Entreposage impossible");
      }
      deconnecter();
    } catch (IOException e) {
      System.err.println("Connexion impossible");
    }
    return res;
  }

  public void entreposer(String s,String c) {
    try {
      connecter();
      try {
        envoi.write("Store");
        envoi.newLine();
        envoi.flush();
        envoi.write(s);
        envoi.newLine();
        envoi.flush();
        envoi.write(c);
        envoi.newLine();
        envoi.flush();
      } catch(IOException e) {
        System.err.println("Entreposage impossible");
      }
      deconnecter();
    } catch (IOException e) {
      System.err.println("Connexion impossible");
    }
  }

  public ClientDepot(String hote, int port) {
    this.hote = hote;
    this.port = port;
  }

  private void connecter() throws IOException {
    skt = new Socket(hote, port);
    reception = new BufferedReader(
                new InputStreamReader(
                skt.getInputStream()));
    envoi = new BufferedWriter(
            new OutputStreamWriter(
            skt.getOutputStream()));
  }
  private void deconnecter() {
    try {
      skt.close();
    } catch (IOException e) {
      System.err.println("Cloture de connexion impossible");
    }
  }


  public String getLastColor()
  {
    return color;
  }

}
