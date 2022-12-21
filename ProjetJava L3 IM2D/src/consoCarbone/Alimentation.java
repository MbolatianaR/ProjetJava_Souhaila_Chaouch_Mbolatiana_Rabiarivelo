package consoCarbone;

// La classe Alimentation 

public class Alimentation extends ConsoCarbone { // hérite de la classe ConsoCarbone
	
	// Les attributs de la classe Alimentation:
	
	private double txBoeuf;         // le taux de repas (une valeur entre 0 et 1) à base de boeuf (le type deviande le plus émissif )
	private double txVege;          // le taux de repas végétariens ;
	private static double impact;   // l’impact de l’alimentation de l’utilisateur.rice en termes d’émissions deGES en TCO2eq
	
	// Les constantes utilisées dans la classe
	
	
	private final int  c1 = 8;
	private final double c2 = 1.6;
	private final double c3 = 0.9;
	
	// Constructeurs :
		
	// Constructeur paramêtré : 
	
	public Alimentation(double txB, double txV) {
		//Appel au constructeur de la classe mere ConsoCarbone
		super();
		txBoeuf = txB;
		txVege = txV;
	}
	
	// Constructeur sans paramêtres 
	
	public Alimentation() {
		super();
		txBoeuf = 0;
		txVege = 0;
	}
	
	
	// Maintenant, on va creer les getters et les setters 
	
	// On accede a l'attribut en utilisant le getter 
	// On change la valeur de l'attribut en utilisant le setter
	
	// Getters et Setters 
	
	// Getters et Setters de TxBoeuf
	
	public double getTxBoeuf() {
		return this.txBoeuf;
	}
	
	public void setTxBoeuf(double txBoeuf) { // on met le void pour dire que cela ne renvoie rien, on affecte juste une valeur a txBoeuf
		this.txBoeuf = txBoeuf;
	}

	
	// Getters et Setters de TxVege
	
	public double getTxVege() {
		return this.txVege; 
	}
	
	public void setTxVege(double txVege) {
		this.txVege = txVege;
	}
	
	
	// Getters et Setters de Impact
	
	public double getImpact() {
		return Alimentation.impact;
	}
	
	public void setImpact() {
		Alimentation.impact =  c1 * this.txBoeuf + c2 * (1 - this.txVege - this.txBoeuf) + c3 * txVege;
	}
	
	// Methode statique
	
	public static void afficher() {
		System.out.println("L’empreinte carbone moyenne d’un.e français.e vis-à-vis de son alimentation est de : " + 2353 + "  TCO2eq. ");
	}
	

	// Redéfinition de la methode toString()
	
	@Override // comme toString() est une methode de la classe object , pour l'utiliser, il faut mettre override
	public String toString() {
		return "Alimentation {" + "id = " + this.id + " , Impact = " + this.impact + " , txBoeuf = " + txBoeuf + ", txVege = " + txVege + "} ";
	}

    // Héritage + implements (Partie 4 )

	@Override
	public int compareTo(ConsoCarbone o) {
		// TODO Auto-generated method stub
		return 0;
	}

	
}