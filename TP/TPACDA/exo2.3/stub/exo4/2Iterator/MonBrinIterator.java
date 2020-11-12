import java.util.Iterator;
import java.util.NoSuchElementException;

/** 
MonBrinIterator 

gère la navigation dans un Brin d'ADN

*/
public class MonBrinIterator implements Iterator<Base> {

    private MonBrin mb;
    
    //Le constructeur de base retourne un brin à une base;
    public MonBrinIterator(MonBrin iter){
        this.mb = iter;
    }
    
    /** Pour naviguer? 
        On implémente l'interface iterable de java.util ici
        L'avantage c'est que c'est standard et tout le monde comprendra sans trop de mal comment la navogation fonctionne.
    **/
    
    @Override
    public boolean hasNext(){
        if (mb != null) {
            return true;
        }
        else
        {
            return false;
        }

    }

    @Override
    public Base next() {
        
        if (hasNext()) {
            
            Base b = mb.getBase();
            this.mb = mb.getSuiteBrin();
            return b;
        }


        throw new NoSuchElementException();
    }
 
}


