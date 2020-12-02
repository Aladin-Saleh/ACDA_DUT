/**
 * ServeurStart class definition
 * generated from StarUML project Memo on 18/06/2012
 *
 * @author Luc Hernandez
 */




public class ServeurStart {
  public static void main(String[] args) {
    try {
      ServeurDepot srv = new ServeurDepot(11111);
      while(true) {
        srv.ecoute();
      }
    } catch (java.io.IOException e) {
      System.err.println("Mise en place impossible");
    }
  }
}
