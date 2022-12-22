package consoCarbone;

// Logement herite de ConsoCarbonne

/** Logement est un poste de consommation lie au  de l'utilisateur 
@author Souhaila
@author Mbolatiana
*/

public class Logement extends  ConsoCarbone{ // hérite de la classe ConsoCarbone

    // Les attributs de la classe 
	
	/**la  superficie du logement en m2*/
	private int superficie;         // la superficie du logement en m2
	/**la classe energetique du logement*/
	static CE ce;                   // la classe énergétique du logement 
	/**l'impact du logement en termes d'emissions de GES  en TCO2eq */
	private static double impact;   // l’impact du logement en termes d’émissions de GES en TCO2eq

	// Pour creer un atribut : acces (static/public/private/protected), type de la variable, le nom de la variable ;
	// l impact est calculé dans le setter, on doit pas l utiliser dans le constructeur
	
	// Constructeurs de logement 
	
	// Constructeur sans parametres
	
	/**Constructeur sans parametre de Logement*/
	public Logement() {

		// Logement herite aussi des attributs de ConsoCarbone => super() => Appel du constructeur de ConsoCarbone
		super(); 
		this.superficie = 0;
		this.ce = CE.D; /*CE ici est par defaut D qui est la mediane de tous les CE*/
		
	}
	
	// Constructeur parametré
	/**Constructeur parametre de Logement*/
	public Logement(int sup, CE ce) {
		super(); 
		this.superficie = sup;
		Logement.ce = ce ;
	}
	
	/*
	 * Autre maniere de rediger les constructeurs
	 * 
	// Constructeur parametré
	
	public Logement(int superficie , CE ce) {
		this.setSuperficie(superficie);
		this.setCe(ce);
	}
	
	// Constructeur sans parametre
	
	public Logement() {
		this.setSuperficie(0);
	}
	
	*/
	
	
	// Getters et Setters de Superficie
	
	/**Getter de Superficie*/
	public int getSuperficie() {
		return this.superficie;	
	}
	
	
	/**Setter de Superficie*/
	public void setSuperficie(int superficie) {
		this.superficie = superficie;
	}
	
	// Getters et Setters de Impact
	
	/**Getter de impact*/
	public double getImpact() {
		return impact;
	}
	
	
	/**Setter de impact*/
	public void setImpact(int sup, CE ce) {
		 impact = ce.alpha * sup; 
	}
	
	
	
	// Getters et Setters de CE
	
	/**Getter de CE*/
	public double getCE() {
		return ce.alpha;
	}
	
	/**Setter de CE*/
	public void setCE(CE ce) {
		this.ce = ce; 
	}
	
	
	//Une méthode statique est une méthode de la classe (attribut aussi)
	
	// Methode statique :
	
	 /** affiche l'empreinte carbonne moyenne d'un.e français.e vis à vis de son Logements
	*/
	public static void afficher() {
		System.out.println("L’empreinte carbone moyenne d’un.e français.e vis-à-vis de son logement est de : " + 2706 + "  TCO2eq. ");
	}
		

	// Redéfinition de la methode toString()
	
	/** Methode toString() modifiée pour cette classe 
	 * @return Logement{id, impact, superficie, ce}
	 */
	@Override
	public String toString() {
		return "Logement {" + "id = " + id + " , Impact = " + impact + 
				" , Superficie = " + superficie + " , ce = " + ce + "} ";
	}
	
    
	/**Comme Logement herite de ConsoCarbone, qui implemente l'interface comparable, elle herite aussi de cette methode*/

	@Override
	public int compareTo(ConsoCarbone o) {
		return 0;
	}
	
}
