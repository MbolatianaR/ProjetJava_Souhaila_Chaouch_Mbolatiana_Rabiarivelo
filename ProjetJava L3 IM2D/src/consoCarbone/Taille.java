package consoCarbone;

// Enumération Taille
/** Deux instances P et G correspondant à "petite voiture" et "grosse voiture". La production d’une petite voiture émet 4.2 TCO2eq et celle d’une grosse voiture
19 TCO2eq.*/
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
