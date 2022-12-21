package consoCarbone;

public class Main_ConsoCarbone {

	public static void main(String[] args) {
		
		/*créer des objets des classes Alimentation, Logement, BienConso, Transport et utiliser les setters pour donner ou modifier
    	les valeurs des attributs et utiliser  les getters pour acceder à ces valeurs*/
    	
    	
    	/*Alimentation*/
    	
    	// verifier le fonctionement de id:
    	
    	Alimentation ali1 = new Alimentation();
    	System.out.println("l'id de ali1 est : " + ali1.getId());
    	
    	Alimentation ali2 = new Alimentation();
    	System.out.println("l'id de ali2 est : " + ali2.getId());
    	
    	Alimentation ali3 = new Alimentation();
    	System.out.println("l'id de ali3 est : " + ali3.getId());
    	
    	// verifier le fonctionement du getter et du setter de txBoeuf :
    	
    	ali1.setTxBoeuf(0.9);
    	ali2.setTxBoeuf(0.5);
    	System.out.println("le taux de repas à base de boeuf de ali1 est : " + ali1.getTxBoeuf());
    	System.out.println("le taux de repas à base de boeuf de ali2 est : " + ali2.getTxBoeuf());
    	
    	// verifier le fonctionement du getter et du setter de txVege :
    	
    	ali1.setTxVege(0.6);
    	System.out.println("le taux de repas végétariens de ali1 est : " + ali1.getTxVege());
        
    	// verifier le fonctionnement du getter et du setter de impact :
    	
    	ali1.setImpact();
    	System.out.println("l’impact de l’alimentation de ali1 est : " + ali1.getImpact()+ " TCO2eq ");
    
    	// verifier le fonctionement de la méthode afficher  :
    	
    	ali1.afficher();
    	System.out.println(" \n ");
    	
    	
    	/**********************************************************************************************************************/
    	
    	/*Logement*/
    	
    	// verifier le fonctionement de id:
    	ConsoCarbone log = new Logement();
    	
    	System.out.println(log);
    	
    	Logement log1 = new Logement(12, CE.A);
    	System.out.println("l'id de log1 est : " + log1.getId());
    	
    	Logement log2 = new Logement(12, CE.B);
    	System.out.println("l'id de log2 est : " + log2.getId());
    	
    	// verifier le fonctionement du getter et du setter de superficie :
    
    	//log1.setSuperficie(34567890);
    	//System.out.println("la superficie du logement en m2 est : " + log1.getSuperficie()+ " m2 ");
    	
    	// verifier le fonctionement du getter et du setter de impact :
    	
    	log1.setImpact();
    	System.out.println("L'impact du Logement de log1 est : " + log1.getImpact() + " TCO2eq ");
    	
    	// verifier le fonctionement de la méthode afficher  :
    	
    	log1.afficher();
    	
    	System.out.println(" \n ");
    	
    	/**********************************************************************************************************************/
    	
    	
    	/*BienConso*/
    	
    	// verifier le fonctionement de id:
    	
    	BienConso cons1 = new BienConso();
    	System.out.println("l'id de cons1 est : " + cons1.getId());
    	
    	BienConso cons2 = new  BienConso();
    	System.out.println("l'id de cons2 est : " + cons2.getId());
    	
    	
    	// verifier le fonctionement du getter et du setter de montant :
    	
    	cons1.setMontant(0.7);
    	System.out.println("Le montant des dépenses annuelles de l’utilisateur.rice. est : " + cons1.getMontant());
    	
    
    	// verifier le fonctionement du getter et du setter de impact :
    	
    	cons1.setImpact();
    	
    	System.out.println("L'impact des biens consommés de cons1 est : " + cons1.getImpact()+ " TCO2eq ");
    	
    	// verifier le fonctionement de la méthode afficher  :
    	
    	cons1.afficher();
    	
    	System.out.println(" \n ");
    	
    	
    	/**********************************************************************************************************************/
    	
    	
    	/*Transport*/
    	
    	// verifier le fonctionement de id:
    	Transport t1 = new Transport();
    	System.out.println("l'id de t1 est : " + t1.getId());
    	Transport t2 = new Transport();
    	System.out.println("l'id de t2 est : " + t2.getId());
    	
    	
    	// verifier le fonctionement du getter et du setter de possede :
    	
    	t1.setPossede(false);
    	System.out.println("Est ce que cette personne a une voiture ? " + t1.getPossede());
    	
    	// verifier le fonctionement du getter et du setter de kilomAnnee :
    	
    	t1.setKilomAnnee(34556);
    	System.out.println("nombre de kilomètres parcourus par an est : " + t1.getKilomAnnee() + " Km ");
    	
    	// verifier le fonctionement du getter et du setter de amortissement :
    	
    	t1.setAmortissement(234568890);
    	System.out.println("la durée de conservation du véhicule est : " + t1.getAmortissement()+ " ans ");
    	
    	// verifier le fonctionement du getter et du setter de fabrication :
    	
    	t1.setFabrication(234);
    	System.out.println("Les émissions nécessaires à la fabrication de la voiture sont : " + t1.getFabrication() + " TCO2eq ");
    	
    	// verifier le fonctionement du getter et du setter de impact :
    	
    	t1.setImpact();
    	System.out.println("L'impact du transport de t1 est : " + t1.getImpact()+ " TCO2eq ");
    	
    	
    	// verifier le fonctionement de la méthode afficher  :
    	
    	t1.afficher();
    	
    	
    	/**************************************************************************************************/
    	
    	// design pattern singleton:
    	
    	ServicesPublics singleton1 = ServicesPublics.getInstance();
    	System.out.println(singleton1.getvaleurServicesPublics());
   
    	ServicesPublics singleton2 = ServicesPublics.getInstance();
    	System.out.println(singleton2.getvaleurServicesPublics());
    	
    	
    	
    	
    	
    	
		/*Scanner scanner = new Scanner(System.in);
		
		System.out.println("entrer votre taux de repas (une valeur entre 0 et 1) à base de boeuf svp!");
	    double txBoeuf = scanner.nextDouble();
	    
	    System.out.println("entrer votre taux de repas végétariens svp!");
	    double txVege = scanner.nextDouble();
	    
	    double impact = alimentationImpact(txBoeuf,txVege );
	    
	    Alimentation alimentation1 = new Alimentation(txBoeuf,txVege, impact);*/
	
		
    	
    	

	}

}
