package consoCarbone;


public class ServicesPublics {
	private static final ServicesPublics singleton = new ServicesPublics();  
	
	// Constructeur de ServicesPublics
	
	// On decide de mettre le constructeur en private pour que
	// l'utilisateur ne puisse pas créer de nouvelles instances de cette classe 

	private ServicesPublics() {}
	
	private static double valeurServicesPublics = 1.5 ; // on definit la valeur du singleton ici 1.5

	//Pour pouvoir utiliser un singleton, il faut connaître son instance
		// C'est le but de cette méthode habituellement nommée getInstance.
	
	public static ServicesPublics getInstance() {
		return singleton ; 
	}
	
	// Getter et Setter de Services Publics

	public double getvaleurServicesPublics() {
		return valeurServicesPublics;
	}

	public void setvaleurServicesPublics(int valeur) {
		valeurServicesPublics = valeur;
	}

	}

