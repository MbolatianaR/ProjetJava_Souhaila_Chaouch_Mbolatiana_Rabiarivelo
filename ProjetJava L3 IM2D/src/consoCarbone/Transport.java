package consoCarbone;


// La classe Transport 

public class Transport extends ConsoCarbone { // hérite de la classe ConsoCarbone
	

    // Les attributs de la classe Transport    

	private boolean possede;  			// Booleen indiquant si l’utilisateur.rice possède une voiture.
	Taille taille;            			// Taille du véhicule
	private int kilomAnnee;           	// Nombre de kilomètres parcourus par an.
	private int amortissement;        	// Durée de conservation du véhicule
	private double fabrication;			// Emissions nécessaires à la fabrication de la voiture
	



	// Constructeur 
	
	
	// Constructeur sans parametre
	
	public Transport() {
		this.possede = false;			// On va considerer que la personne n'a pas de voiture par defaut
		this.kilomAnnee = 0;
		this.amortissement = 0;
		this.fabrication = 0;
	}
	
	// Constructeur avec parametres
	
	public Transport(boolean possede, Taille taille, int kilomAnnee, int amortissement, double fabrication) {
		this.possede = possede;
		this.taille = taille;
		this.kilomAnnee = kilomAnnee;
		this.amortissement = amortissement;
		this.fabrication = fabrication;
	}
	 
		
	// Getters et Setters de Possede 
	
	public boolean getPossede() {
		return this.possede;
	}
	
	 public void setPossede(boolean p) {
		this.possede = p;
	}
	
	// Getters et Setters de kilomAnnee
	
	public int getKilomAnnee() {
		return this.kilomAnnee;
	}
	
	public void setKilomAnnee(int km) {
		this.kilomAnnee = km;
	}
	
	// Getters et Setters de Amortissement 
	
	public int getAmortissement() {
		return this.amortissement;
	}
		
	public void setAmortissement(int amo) {
		this.amortissement = amo;
	}
	
	// Getters et Setters de Fabrication 
	
	public double getFabrication() {
		return this.fabrication;
	}
				
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
	
	public void setImpact() {
		if (this.possede == false) {
			this.impact = 0;
			}
			else {
				this.impact = (this.kilomAnnee * 1.93 * 0.0001) + this.fabrication/this.amortissement; 
			}
	}
	
	// Methode Statique 
	
	public static void afficher() {
		System.out.println("L’empreinte carbone moyenne d’un.e français.e vis-à-vis de son transport est de : " + 2835 + " TCO2eq ");
	}

	
	// Redéfinition de la methode toString()
	
	
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
    
	@Override
	public int compareTo(ConsoCarbone o) {
		// TODO Auto-generated method stub
		return 0;
	}

	}
	
	
	
	

