package consoCarbone;

// Logement herite de ConsoCarbonne

public class Logement extends  ConsoCarbone{ // hérite de la classe ConsoCarbone

    // Les attributs de la classe 

	private int superficie;         // la superficie du logement en m2
	static CE ce;                   // la classe énergétique du logement 
	private static double impact;   // l’impact du logement en termes d’émissions de GES en TCO2eq

	// Pour creer un atribut : acces (static/public/private/protected), type de la variable, le nom de la variable ;
	// l impact est calculé dans le setter, on doit pas l utiliser dans le constructeur
	
	// Constructeurs de logement 
	
	// Constructeur sans parametres
	
	public Logement() {

		// Logement herite aussi des attributs de ConsoCarbone => super() => Appel du constructeur de ConsoCarbone
		super(); 
		this.superficie = 0;
		
	}
	
	// Constructeur parametré
	
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
	
	public double getSuperficie() {
		return this.superficie;	
	}
	
	public void setSuperficie(int superficie) {
		this.superficie = superficie;
	}
	
	// Getters et Setters de Impact
	
	public double getImpact() {
		return impact;
	}
	
	
	public void setImpact() {
		impact = ce.alpha * superficie; 
	}
	
	
	
	// Getters et Setters de CE

	// On n'a pas besoin de faire des getters et des setters pour CE car on n'a pas de valeur par défault en cas de 
	// non reponse, ni a-t-on le droit de modifier les valeurs du ce
	
	
	//Une méthode statique est une méthode de la classe (attribut aussi)
	
	// Methode statique :
	
	public static void afficher() {
		System.out.println("L’empreinte carbone moyenne d’un.e français.e vis-à-vis de son logement est de : " + 2706 + "  TCO2eq. ");
	}
		

	// Redéfinition de la methode toString()
	
	
	@Override
	public String toString() {
		return "Logement {" + "id = " + id + " , Impact = " + impact + 
				" , Superficie = " + superficie + " , ce = " + ce + "} ";
	}
	
    

	@Override
	public int compareTo(ConsoCarbone o) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
