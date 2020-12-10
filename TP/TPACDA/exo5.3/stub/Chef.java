import java.util.LinkedHashSet;
import java.util.*;
import java.util.Objects;

/** feuille du motif composite */
/*Ce code possede 2 version, une avec des LinkedHashSet et une autre avec ArrayList avec des Iterator*/
public class Chef extends Person 
{
    private LinkedHashSet<Person> liste = new LinkedHashSet<Person>();
    private List<Person> sub = new ArrayList<Person>();

    public boolean addSubalterne(Person p)
    {
        //return this.liste.add(p);

        return this.sub.add(p);
    }


    
    /** constructeur
     *
     * @param n fun factor
     *
     */ 
    public Chef(int n){
        super(n);

        // d'autres choses peut-être.
    }

    
    /** 
     * La meilleure fête avec moi, c'est la meilleure fête sans mes subalternes pour eux plus moi. 
     *
     * @return retourne la valeur de la meilleure fête en invitant seulement les gens dont cette personne est le ou la supérieure hiérarchique, mais pas elle.
     *
     */ 
    public int bestPartyWithoutMe()
    {
        int count = 0;
        Iterator<Person> itr = sub.iterator(); 
        while(itr.hasNext())
        {
            count += itr.next().bestParty();
        }
        return count;

        /*int funParty = 0;
        for(Person p : this.liste)
        {
        	funParty += p.bestParty();
        }

        return funParty;*/
    }

    /**
     *  La meilleure fête est soit sans moi (c'est l'union des meilleures fêtes de mes subalternes). 
     *  soit c'est la meilleure fête avec moi.
     *
     * @return la valeur de la meilleure fête en invitant seulement les gens dont cette personne est le ou la supérieure hiérarchique (peut-être avec elle).
     *
     */ 
    public int bestParty()
    {

    	int myFunFactor = this.getFunFactor();


    	Iterator<Person> itr = sub.iterator(); 
        while(itr.hasNext())
        {
            myFunFactor += itr.next().bestPartyWithoutMe();
            //System.out.println("my" + myFunFactor);
        }

        /*for (Person p: this.liste) {
        	
        	myFunFactor +=p.bestPartyWithoutMe();

        }*/

    	if (myFunFactor > this.bestPartyWithoutMe()) {

    		return myFunFactor;
    		
    	}
    	else
    	{
    		return this.bestPartyWithoutMe();
    	}

    

    }
    
}


