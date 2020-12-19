package serveur;

import java.util.Arrays;

/**
 * ListeConnectes class definition
 * generated from StarUML project Mob on 17/03/2012
 *
 * @author Luc Hernandez
 */
public class ListeConnectes {
  private static final int CAPACITE_MIN = 10;
  private static final int CAPACITE_INC = 10;
  private volatile int taille;
  private Connecte tab[];

  public ListeConnectes() {
    tab = new Connecte[CAPACITE_MIN];
    taille = 0;
  }

  public synchronized void ajouter(Connecte c) {
    if (taille >= tab.length)
      tab = Arrays.copyOf(tab, tab.length + CAPACITE_INC);
    tab[taille++] = c;
    c.setParent(this);
    diffuser();
  }

  public synchronized void supprimer(Connecte c) {
    int i;
    for(i = 0; (i < taille)&&(c != tab[i]); i++)
      ; //corps vide
    if (i < taille) {
      taille--;
      do {
        tab[i] = tab[i+1];
        i++;
      } while(i < taille);
      diffuser();
    }
  }

  public void diffuser() {
    System.out.println("Nombre de clients connectes : " + taille);
    for(int i = 0; i < taille; i++)
      tab[i].envoyer(taille);
  }
}
