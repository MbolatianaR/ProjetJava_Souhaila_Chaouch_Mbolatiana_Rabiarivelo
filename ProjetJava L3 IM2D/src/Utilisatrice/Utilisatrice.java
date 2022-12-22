package Utilisatrice;
import java.util.HashMap;
import java.util.Arrays;
import java.util.Map;
import consoCarbone.*;

/**Utilisatrice correspond a l'utilisater.rice de notre projet 
 * <br> 
 * 
 * @author Souhaila
 * @author Mbolatiana
*/
public class Utilisatrice {
	
	/**le poste de consommation carbone de l’utilisatrice concernant son alimentation.*/
	private Alimentation alimentation;//le poste de consommation carbone del’utilisatrice concernant son alimentation.
	/***le poste deconsommation carbone de l’utilisatrice concernant ses depenses en biens de consommation.*/
	private	BienConso bienConso; /*le poste deconsommation carbone de l’utilisatrice concernant ses dépenses en biens de consommation.*/
	/**le poste de consommation carbone de l’utilisatrice concernant son logement*/
	private Logement logement; /*le poste de consommation carbone de l’utilisatrice concernant son logement.*/
	/**le poste de consommation carbone de l’utilisatrice concernant ses deplacements.*/
	private Transport transport; /*le poste de consommation carbone de l’utilisatriceconcernant ses déplacements.*/
	/**le poste de consommation carbone de l’utilisatrice concernant son utilisation des services publics*/
	private ServicesPublics services; /*le poste de consommation carbone de l’utilisatrice concernant son utilisation des services publics.*/
    /**un booleen qui permet de sortir */
	private boolean sortir = true;
	private double temp;
	
	
	// Constructeur parametre
	
	/**Constructeur parametre de Utilisatrice*/
    public Utilisatrice(Alimentation al, BienConso bienC, Logement lg,Transport trp, ServicesPublics serv) {
		this.alimentation = al;
		this.bienConso = bienC;
		this.logement = lg;
		this.transport = trp;
		this.services= serv;
	}
    
    
    // Methode calculer Empreinte 
    
    /**calcule l'emprunte carbone de l'utilisatrice
     * @return la somme des impacts de chaque poste de consommation
     * */
    private double calculerEmpreinte() {
		double empreinte = alimentation.getImpact()+bienConso.getImpact() + logement.getImpact() + transport.getImpact() + services.getvaleurServicesPublics();
		return empreinte;
	}
    
    /**affiche sur la console une description detaillee de l’empreinte carbone de l’utilisateur.rice*/
    //
	public void detaillerEmpreinte() {
		System.out.println("L’empreinte carbone de l’utilisateur.rice est : "+calculerEmpreinte()+ " TCO2eq.");
		System.out.println("L’empreinte carbone moyenne de l’utilisateur.rice vis-à-vis de son alimentation est de : "+ alimentation.getImpact() +"  TCO2eq.");
		System.out.println("L’empreinte carbone moyenne de l’utilisateur.rice vis-à-vis de son logement est de : "+logement.getImpact()+"  TCO2eq.");
		System.out.println("L’empreinte carbone moyenne de l’utilisateur.rice vis-à-vis de ses BienConso est de : "+bienConso.getImpact()+"  TCO2eq.");
		System.out.println("L’empreinte carbone moyenne de l’utilisateur.rice vis-à-vis de ses transport est de : "+transport.getImpact()+"  TCO2eq.");
		System.out.println("L’empreinte carbone moyenne de l’utilisateur.rice vis-à-vis de ses services publics est de : "+ services.getvaleurServicesPublics()+"  TCO2eq.");
	}

	
	//Methode afficher
	
	/**affiche pour chaque poste de consommation de l'utilisatrice l'empreinte carbonne de ces derniers. Il s'agit d'une liste ordonnee */
	public void afficher() {
		double[] tab = {alimentation.getImpact(), bienConso.getImpact(), logement.getImpact(), transport.getImpact(), services.getvaleurServicesPublics()};
		    for (int i = 0; i<tab.length; i++) {
		    System.out.print(tab[i]+ "  ");
		    }
	}
	
	/**ordonne les empreintes carbonne des differents postes de consommation de l'utilisatrice par ordre decroissant.
	 * <br>
	 * On utilise cette fonction lorsqu'on souhaite dire a l'utilisatrice quelle poste de consommation doit elle diminuer
	 *  */
	public void ordonner() {
		double[] tab = {alimentation.getImpact(), bienConso.getImpact(), logement.getImpact(), transport.getImpact(), services.getvaleurServicesPublics()};       
		while (sortir == true) {
			sortir = false;
			for(int i = 0; i<tab.length - 1; i++) {
				if(tab[i]>tab[i+1]) {
					temp = tab[i];
					tab[i] = tab[i+1];
					tab[i+1] = temp;
					sortir = true;
				}
			}
		}
		for (int i = 0; i<tab.length; i++) {
		    System.out.print(tab[i]+" ");
		    }     
		}

	
	/**recommande a l'utilisatrice de diminuer sa consommation pour le poste de consommation le plus eleve*/
	public void recommendations() {
		double[] tab = {alimentation.getImpact(), bienConso.getImpact(), logement.getImpact(), transport.getImpact(), services.getvaleurServicesPublics()};
		String[]typeCons = {"alimentation", "bienConso", "Logement", "Transport", "ServicesPublics"};
		double max = tab[0];
		for (int i = 1; i<tab.length; i++) {
			if(tab[1]>max) {
				max = tab[1];
				}
			}
		System.out.println(" \n ");
		System.out.println("il faut diminuer ta consommation vis-à-vis de "+max);
		
	}
		
	
	/**collection de logements de l'utilisatrice*/
	public String  Logement(String cle) {
		
		Map <String, String> logement = new HashMap();
		logement.put("Lila", "Maison");
		logement.put("Mellissa", "Appartement");
		logement.put("Mbolatiana", "Maison");
		logement.put("Souhaila", "Appartement");
		logement.put("Paul", "Maison");
		logement.put("Farid", "Appartement");
		logement.put("Mairie", "Caravane");

		return logement.get(cle);
		
	}
	
	/**collection de voiture de l'utilisatrice*/
	public String  Voiture(String cle) {
		
		Map <String, String> voiture = new HashMap();
		voiture.put("Lila", "Audi");
		voiture.put("Mellissa", "Citroën");
		voiture.put("Mbolatiana", "BMW");
		voiture.put("Souhaila", "Mercedes");
		voiture.put("Paul", "Peugeot");
		voiture.put("Farid", "Renault");
		voiture.put("Mairie", "Mercedes");

		return voiture.get(cle);

	}



}

