package client;

import java.io.IOException;
import java.io.DataInputStream;
import java.net.Socket;

/**
 * Central class definition
 * generated from StarUML project Mob on 24/06/2012
 *
 * @author Luc Hernandez
 */
public class Central {
  private DataInputStream in;
  private Fenetre fntr;
  private volatile boolean alive;

  public Central(String hote, int port, Fenetre f) throws IOException {
   fntr = f;
   Socket skt = new Socket(hote, port);
   in = new DataInputStream(skt.getInputStream());
   alive = true;
  }

  public boolean interroger() {
    int nb;
    try{
      while (alive) {
        nb = in.readInt();
        fntr.display(nb);
      }
    } catch (IOException e) {
      // ignore
    }
    return !alive;
  }

  public void quitter() {
    try {
      alive = false;
      in.close();
    } catch (IOException e) {
      // ignore
    }
  }
}
