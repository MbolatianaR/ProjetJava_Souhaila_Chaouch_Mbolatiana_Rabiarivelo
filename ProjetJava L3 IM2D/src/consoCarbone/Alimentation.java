package consoCarbone;

/** Alimentation est un poste de consommation lie a l'alimentation de l'utilisateur 
 @author Souhaila
 @author Mbolatiana
 */

// La classe Alimentation 

public class Alimentation extends ConsoCarbone { // herite de la classe ConsoCarbone
	
	// Les attributs de la classe Alimentation:
	
	
	/**le taux de repas à base de boeuf (une valeur entre 0 et 1)*/
	private double txBoeuf;         // le taux de repas (une valeur entre 0 et 1) à base de boeuf (le type deviande le plus emissif )
	/**le taux de repas vegetariens (une valeur entre 0 et 1)*/
	private double txVege;          // le taux de repas vegetariens ;
	/**l’impact de l’alimentation de l’utilisateur.rice en termes d’émissions deGES en TCO2eq*/
	private static double impact;   // l’impact de l’alimentation de l’utilisateur.rice en termes d’emissions deGES en TCO2eq
	
	// Les constantes utilisees dans la classe
	
	/**constante 1 utilisee lors du calcul de l'impact, c1 = 8 */
	private final int  c1 = 8;
	/**constante 2 utilisee lors du calcul de l'impact, c2 = 1.6*/
	private final double c2 = 1.6;
	/**constante 3 utilisee lors du calcul de l'impact, c3 = 0.9*/
	private final double c3 = 0.9;
	
	// Constructeurs :
		
	// Constructeur parametre : 
	
	/**Constructeur parametre de la classe Alimentation qui a pour parametre txBoeuf et txVege qui sont tout les deux des double*/
	public Alimentation(double txB, double txV) {
		//Appel au constructeur de la classe mere ConsoCarbone
		super();
		txBoeuf = txB;
		txVege = txV;
	}
	
	// Constructeur sans parametres 
	
	/**Constructeur sans parametre de la classe Alimentation, on met les valeurs par defaut a 0 */
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
	
	/**Getter de TxBoeuf*/
	public double getTxBoeuf() {
		return this.txBoeuf;
	}
	
	/**Setter de TxBoeuf*/
	public void setTxBoeuf(double txBoeuf) { // on met le void pour dire que cela ne renvoie rien, on affecte juste une valeur a txBoeuf
		this.txBoeuf = txBoeuf;
	}

	
	// Getters et Setters de TxVege
	/**Getter de TxVege*/
	public double getTxVege() {
		return this.txVege; 
	}
	
	/**Setter de TxVege*/
	public void setTxVege(double txVege) {
		this.txVege = txVege;
	}
	
	
	// Getters et Setters de Impact
	
	/**Getter de impact*/
	public double getImpact() {
		return Alimentation.impact;
	}
	
	/**Setter de impact*/
	public void setImpact() {
		Alimentation.impact =  c1 * this.txBoeuf + c2 * (1 - this.txVege - this.txBoeuf) + c3 * txVege;
	}
	
	// Methode statique
	
	
	/** affiche l'empreinte carbonne moyenne d'un.e français.e vis à vis de son alimentation
	*/
	public static void afficher() {
		System.out.println("L’empreinte carbone moyenne d’un.e français.e vis-à-vis de son alimentation est de : " + 2353 + "  TCO2eq. ");
	}
	

	// Redéfinition de la methode toString()
	
	/** Methode toString() modifiee pour cette classe 
	 * @return Alimentation{id, impact, txBoeuf, txVege}
	 */
	@Override // comme toString() est une methode de la classe object , pour l'utiliser, il faut mettre override
	public String toString() {
		return "Alimentation {" + "id = " + this.id + " , Impact = " + this.impact + " , txBoeuf = " + txBoeuf + ", txVege = " + txVege + "} ";
	}

    // Héritage 
	
	/**Comme Alimentation herite de ConsoCarbone, qui implemente l'interface comparable, Alimentation herite aussi de cette methode*/
	@Override
	public int compareTo(ConsoCarbone o) {
		return 0;
		
	}

	
}
