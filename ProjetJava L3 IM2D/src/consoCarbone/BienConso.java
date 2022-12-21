package consoCarbone;

// La classe BienConso

public class BienConso extends ConsoCarbone { // hérite de la classe ConsoCarbonne
	

    // Les attributs de la classe BienConso
	
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
	
	public static void afficher() {
		System.out.println("L’empreinte carbone moyenne d’un.e français.e vis-à-vis de son BienConso est de : " + 2625 + " TCO2eq ");
		}

	
	// Redéfinition de la methode toString()
	
	@Override // comme toString() est une methode de la classe object , pour l'utiliser, il faut mettre override
	public String toString() {
		return "BienConso {" + "id = " + id + " , Impact = " + impact + ", montant = " + montant + "} ";
	}
	

    @Override
	public int compareTo(ConsoCarbone o) {
		// TODO Auto-generated method stub
		return 0;
	}


}