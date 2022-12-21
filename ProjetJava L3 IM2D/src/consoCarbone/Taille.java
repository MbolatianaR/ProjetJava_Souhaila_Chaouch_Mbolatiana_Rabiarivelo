package consoCarbone;

// Enumération Taille

public enum Taille {
	P("petite voiture",4.2), 
	G("grosse voiture", 19);
	
   // Les attributs de l'enumeration Taille => T(taille,production)

	private String taille;
	private double production;
	
    // Constructeur de Taille

	private Taille(String t, double prd){
		this.taille = t;
		this.production = prd;
	}

}
