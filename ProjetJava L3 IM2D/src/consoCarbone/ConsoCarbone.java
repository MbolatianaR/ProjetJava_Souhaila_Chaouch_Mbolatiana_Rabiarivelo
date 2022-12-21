package consoCarbone;

/** ConsoCarbone est un poste de consommation générique 
 * @author Souhaila
 * @author Mbolatiana
 */

// ConsoCarbone est notre classe mère 
// Pour la première question de la partie 4, on a decide que ça soit une classe abstraite car on ne sait pas réellement à quoi cela correspond 
// Cela peut a la fois etre le logement ou le transport 

public abstract class ConsoCarbone implements Comparable<ConsoCarbone> {

    
    // Les attributs de la classe ConsoCarbone

	/** id est l'identifiant unique attribué à chaque instance de la classe
	*/
	protected static int id;        // Un correspondant à un identifiant unique attribué à l’instance
	
	/** impact du poste de consommation générique en termes d’émissions de GES en TCO2eq
	*/
	protected double impact;        // Impact en général on ne sais pas vraiment a quoi cela correxpond => Abstract
	// protected pour pouvoir utiliser impact dans les classes filles


	// Constructeur
	
	public ConsoCarbone() {
		ConsoCarbone.id++;
	}
	

	// Getter et Setter de Id :
	
	public int getId() {
		return ConsoCarbone.id;
	}
	
	public void setId() {
		ConsoCarbone.id = 0;
	}
	
	
	// Getter et Setter de Impact :
	
	public double getImpact() {
		return this.impact;
		
	}

	public void setImpact(double impact) {
		 this.impact = impact;
	}


	// Redéfinition de la methode toString()
	
	@Override // comme toString() est une methode de la classe object , pour l'utiliser, il faut mettre override
	
	/** Methode toString() modifée pour cette classe 
	 * @return renvoit ConsoCarbone{id,impact}
	*/
	public String toString() {
		return "ConsoCarbone {" + "id = " + id + " , Impact = " + impact + "} ";
	}
	
	
	
}
