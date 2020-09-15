

public class Lendemain {
    	int jour;
    	int mois;
    	int annee;


    	public Lendemain() {
    		this.jour = 15;
    		this.mois = 12;
    		this.annee = 2019;
    	}

    	public void datePls(){
    		
    			if (this.jour == 31) {
    				this.mois++;
    				this.jour = 01;
    			} else {

    				this.jour++;
    			}
    			if (this.mois == 12 && this.jour == 31) {
    				this.mois = 1;
    				this.annee++;
    			}

    	}




    	public String toString(){
    		return(this.jour+"-"+this.mois+"-"+this.annee);

    	}
    	public static void main(String[] args) {
    		Lendemain c = new Lendemain();
    		System.out.println("Date du jour : " + c);
    	
    		c.datePls();


    		for (int i = 1 ;i <= 160  ;i++ ) {
    			System.out.println("Date apres "+ i + " jours : " + c);
    			c.datePls();	
    		}
    	}

    }
