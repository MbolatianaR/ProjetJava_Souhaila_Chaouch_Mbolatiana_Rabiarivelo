package Utilisatrice;

import consoCarbone.*;

public class Utilisatrice {
	
	private Alimentation alimentation;//le poste de consommation carbone del’utilisatrice concernant son alimentation.
	private	BienConso bienConso; /*le poste deconsommation carbone de l’utilisatrice concernant ses dépenses en biens de consommation.*/
	private Logement logement; /*le poste de consommation carbone de l’utilisatrice concernant son logement.*/
	private Transport transport; /*le poste de consommation carbone de l’utilisatriceconcernant ses déplacements.*/
	private ServicesPublics services; /*lepostedeconsommationcarbonedel’utilisatrice concernant son utilisation des services publics.*/
    
	
	// creation des valeurs par default quand aucune valeur saisie 
	private final Alimentation ali = new Alimentation();
	private final BienConso bien = new BienConso();
	private final Logement log = new Logement();
	private final Transport trans = new Transport();
	private final ServicesPublics serv = ServicesPublics.getInstance();;
	
	// Constructeur sans parametre
	
	public Utilisatrice() {
		alimentation = ali;
		bienConso = bien;
		logement = log; 
		transport = trans; 
		services = serv; 
	}
	
	
	// Constructeur parametre
	
    public Utilisatrice(Alimentation al, BienConso bienC, Logement lg,Transport trp, ServicesPublics serv) {
		this.alimentation = al;
		this.bienConso = bienC;
		this.logement = lg;
		this.transport = trp;
		this.services= serv;
	}
    //modif
	//modif
    // Nous n'avons pas creer de getters et de setters pour les attributs de cette classe 
    
    
    // Methode calculer Empreinte 
    private double calculerEmpreinte() {
		double empreinte = alimentation.getImpact()+bienConso.getImpact() + logement.getImpact() + 
				transport.getImpact();//+ services.getInstance();
		return empreinte;
	}
    
    // methode afficherEmpreinteUtilisatrice
	public void afficherEmpreinteUtilisatrice() {
		System.out.println("L’empreinte carbone de l’utilisateur.rice est : "+calculerEmpreinte()+ "TCO2eq.");
		System.out.println("L’empreinte carbone moyenne de l’utilisateur.rice vis-à-vis de son alimentation est de : "+ alimentation.getImpact() +"  TCO2eq.");
		System.out.println("L’empreinte carbone moyenne de l’utilisateur.rice vis-à-vis de son logement est de : "+logement.getImpact()+"  TCO2eq.");
		System.out.println("L’empreinte carbone moyenne de l’utilisateur.rice vis-à-vis de ses BienConso est de : "+bienConso.getImpact()+"  TCO2eq.");
		System.out.println("L’empreinte carbone moyenne de l’utilisateur.rice vis-à-vis de ses transport est de : "+transport.getImpact()+"  TCO2eq.");
		System.out.println("L’empreinte carbone moyenne de l’utilisateur.rice vis-à-vis de ses services publics est de : "+ services.getvaleurServicesPublics()+"  TCO2eq.");
	}



	
}
