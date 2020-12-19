import java.util.Iterator;
import java.util.NoSuchElementException;

/** 
MonBrin code un brin d'ADN sous forme de liste simplement chaînée.
On n'utilise pas java.util (sauf pour l'interface Iterator pour faire joli) et on recode tout.

Cette version a un problème : la structuration et la navigation sont dans la même classe.
*/
public class MonBrin implements Iterator<Base> {

    private Base b;
    private MonBrin mb;

    //Le constructeur de base retourne un brin à une base;
    public MonBrin(Base b){
        this.b = b;

        
    }

    // Le constructeur évolué ajoute une base dans un nouveau brin avec à la suite le brin passé en paramètre.
    public MonBrin(Base b, MonBrin l){
        this.b = b;
        this.mb = l;
    }

    public Base getBase(){
        return this.b;
    }

    public MonBrin getSuiteBrin(){
        return this.mb;
    }
    
    /** Pour naviguer? 
        On implémente l'interface iterator de java.util ici
        L'avantage c'est que c'est standard et tout le monde comprendra sans trop de mal comment la navigation fonctionne.
    **/

    // hint : il faut un attribut qui sert de doigt (et même d'index ;) à l'itérateur 


    // rappel : on met @Override pour dire au compilateur qu'on veut surcharger (en particulier c'est le cas quand on implémente une interface)
    // ce n'est pas nécessaire dans ce cas mais ça permet d'avoir des messages d'alerte si on se trompe (typo dans le nom de la méthode ...)
    // voir https://stackoverflow.com/questions/94361/when-do-you-use-javas-override-annotation-and-why
    @Override
    public boolean hasNext(){

        if (this.mb != null) {
            
            return true;
        }

        else
        
        {
            return false;
        }

    }

    @Override
    // regarder la doc de Iterator afin d'avoir le comportement adapté, il faut parfois soulever une exception adaptée.
    public Base next() {
        if(hasNext())
        {
        Base b2 = mb.getBase();
        this.mb = mb.getSuiteBrin();
        return b2;
        }

        throw new NoSuchElementException();
    }
    

}


