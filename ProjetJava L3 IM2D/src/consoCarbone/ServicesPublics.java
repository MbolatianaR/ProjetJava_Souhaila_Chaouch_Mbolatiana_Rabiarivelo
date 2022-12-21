package consoCarbone;

/** ServicesPublics est un poste de consommation lié aux services publics  de l'utilisateur, il est de 1.5 TCO2eq pour tous les français 
@author Souhaila
@author Mbolatiana
*/

public class ServicesPublics {
	
	private static final ServicesPublics singleton = new ServicesPublics();  
	
	// Constructeur de ServicesPublics
	
	// On decide de mettre le constructeur en private pour que
	// l'utilisateur ne puisse pas créer de nouvelles instances de cette classe 
	
	// constructeur en private pour ne pas autoriser les modifications 
	private ServicesPublics() {
		
	}
	
	/**valeurServicesPublics est la valeur du singleton donc 1.5*/
	private static double valeurServicesPublics = 1.5 ; // on definit la valeur du singleton ici 1.5

	//Pour pouvoir utiliser un singleton, il faut connaître son instance
		// C'est le but de cette méthode habituellement nommée getInstance.
	
	/**Methode utilisé dans un singleton 
	 * @return singleton qui sera toujours 1.5
	*/
	public static ServicesPublics getInstance() {
		return singleton ; 
	}
	
	// Getter de Services Publics
	// On l'utilise dans la methode afficherEmpreinteUtilisatrice() dans la classe utilisatricec 
	
	public double getvaleurServicesPublics() {
		return valeurServicesPublics;
	}

	}

