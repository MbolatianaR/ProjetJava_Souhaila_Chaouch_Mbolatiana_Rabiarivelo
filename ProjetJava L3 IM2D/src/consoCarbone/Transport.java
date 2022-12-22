package consoCarbone;


// La classe Transport 

/** Transport  est un poste de consommation lie au transport de l'utilisateur 
@author Souhaila
@author Mbolatiana
*/

public class Transport extends ConsoCarbone { // hérite de la classe ConsoCarbone
	

    // Les attributs de la classe Transport    
	/**Booleen indiquant si l’utilisateur.rice possede une voiture */
	private boolean possede;  			// Booleen indiquant si l’utilisateur.rice possède une voiture.
	/**Taille du vehicule*/
	Taille taille;            			// Taille du véhicule
	/**Nombre de kilometres parcourus par an a l'aide du vehicule */
	private int kilomAnnee;           	// Nombre de kilomètres parcourus par an.
	/**Duree de conservation du vehicule*/
	private int amortissement;        	// Durée de conservation du véhicule
	/**Emissions necessaires a la fabrication de la voiture*/
	private double fabrication;			// Emissions nécessaires à la fabrication de la voiture
	



	// Constructeur 
	
	
	// Constructeur sans parametre
	/**Constructeur sans parametre de Transport*/
	public Transport() {
		this.possede = false;			// On va considerer que la personne n'a pas de voiture par defaut
		this.kilomAnnee = 0;
		this.amortissement = 0;
		this.fabrication = 0;
	}
	
	// Constructeur avec parametres
	
	/**Constructeur parametre de Transport*/
	public Transport(boolean possede, Taille taille, int kilomAnnee, int amortissement, double fabrication) {
		this.possede = possede;
		this.taille = taille;
		this.kilomAnnee = kilomAnnee;
		this.amortissement = amortissement;
		this.fabrication = fabrication;
	}
	 
		
	// Getters et Setters de Possede 
	
	/**Getter de Possede*/
	public boolean getPossede() {
		return this.possede;
	}
	
	/**Setter de possede*/
	 public void setPossede(boolean p) {
		this.possede = p;
	}
	
	// Getters et Setters de kilomAnnee
	
	 /**Getter de kilomAnnee*/
	public int getKilomAnnee() {
		return this.kilomAnnee;
	}
	
	/**Setter de kilomAnnee*/
	public void setKilomAnnee(int km) {
		this.kilomAnnee = km;
	}
	
	// Getters et Setters de Amortissement 
	
	/**Getter de Amortissement*/
	public int getAmortissement() {
		return this.amortissement;
	}
	
	/**Setter de Amortissement*/
	public void setAmortissement(int amo) {
		this.amortissement = amo;
	}
	
	// Getters et Setters de Fabrication 
	
	/**Getter de Fabrication */
	public double getFabrication() {
		return this.fabrication;
	}
	
	/**Setter de Fabrication*/
	public void setFabrication(int fab) {
		this.fabrication = fab;
	}
	

	// Getters et Setters de Impact
	
	// Pour le getter, on utilisera le getter du ConsoCarbone, la classe mere 
	// Mais on peut aussi faire cela 
	
	/*
	
	 public double getImpact() {
		return super.impact;
	}
	 
	*/
	
	// Pour le setter : 
	
	/**Setteur de Impact*/
	public void setImpact() {
		if (this.possede == false) {
			this.impact = 0;
			}
			else {
				this.impact = (this.kilomAnnee * 1.93 * 0.0001) + this.fabrication/this.amortissement; 
			}
	}
	
	// Methode Statique 
	
	/** affiche l'empreinte carbonne moyenne d'un.e français.e vis à vis de son moyen de transport
	*/
	public static void afficher() {
		System.out.println("L’empreinte carbone moyenne d’un.e français.e vis-à-vis de son transport est de : " + 2835 + " TCO2eq ");
	}

	
	// Redéfinition de la methode toString()
	
	/** Methode toString() modifiée pour cette classe 
	 * @return Transport{id, impact, possede, kilomAnnee, amortissement, fabrication}
	 */
	@Override
	public String toString() {
		return "Transport {" + "id = " + id + " , Impact = " + impact + " , Possede = " 
				+ possede + " , Taille = " + taille +
				 " , kilomAnnee = " + kilomAnnee +
				 " , Amortissement = " + amortissement +
				  " , Fabrication = " + fabrication +
				"} ";
	}
	
	// Heritage 
	/**Comme Transport herite de ConsoCarbone, qui implemente l'interface comparable, elle herite aussi de cette methode*/

	@Override
	public int compareTo(ConsoCarbone o) {
		return 0;
	}

	
	/**calcul l'impact des deplacements*/
	public double transportImpact(boolean posseder, String taille, int kilomAnnee, int amortissement, double fabrication) {
		return  (kilomAnnee * 1.93 * 0.0001) + fabrication/amortissement;

	}
}

	
	

