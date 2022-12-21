package consoCarbone;

// La classe BienConso

/** BienConso est un poste de consommation, autre que Logement, Transport et Alimentation, de l'utilisateur 
@author Souhaila
@author Mbolatiana
*/

public class BienConso extends ConsoCarbone { // hérite de la classe ConsoCarbonne
	

    // Les attributs de la classe BienConso
	/**Le montant des dépenses annuelles de l'utilisateur.rice*/
	private double montant;         //le montant des dépenses annuelles de l’utilisateur.rice.
		
	// Constructeurs
	
	// Constructeur sans parametres
	
	public BienConso() {
		super();
		this.montant = 0;
	}
	
	// Constructeur parametré
	
	public BienConso(double mt) {
		super();
		this.montant = mt;
		}
	
	
	// Getters et Setters de Montant des dépenses 
	
	public double getMontant() {
		return this.montant;
	}
	
	
	public void setMontant(double mt) {
		this.montant = mt;
	}
	
	
	// Getters et Setters de Impact
	
	public double getImpact() {
		return super.impact;
	}
	
	// On ne met pas this.impact 
	// C'est l'attribut impact de la classe mere dont on fait reference, on n'a pas d'impact dans les attributs 
	// de la classe fille
	
	 public void setImpact() {
		impact = 1750 * montant;
	}
	 
	
	
	// Methode Statique
	
	 /** affiche l'empreinte carbonne moyenne d'un.e français.e vis à vis de son BienConso
		*/
	public static void afficher() {
		System.out.println("L’empreinte carbone moyenne d’un.e français.e vis-à-vis de son BienConso est de : " + 2625 + " TCO2eq ");
		}

	
	// Redéfinition de la methode toString()
	
	/** Methode toString() modifiée pour cette classe 
	 * @return BienConso{id, impact, montant}
	 */
	@Override // comme toString() est une methode de la classe object , pour l'utiliser, il faut mettre override
	public String toString() {
		return "BienConso {" + "id = " + id + " , Impact = " + impact + ", montant = " + montant + "} ";
	}
	
	// Héritage 

    @Override
	public int compareTo(ConsoCarbone o) {
		return 0;
	}


}