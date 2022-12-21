package Utilisatrice;
import consoCarbone.*;

public class Main_Utilisatrice {
			
			public static void main(String[] args) {
		 	
			// verifier utilisatrice:
			//Utilisatrice lulu = new Utilisatrice();
			//lulu.afficherEmpreinteUtilisatrice();
			
			Utilisatrice toto = new Utilisatrice();
			Utilisatrice titi = new Utilisatrice();
			
			// verifier le fonctionement du getter et du setter de txBoeuf :
			
			Alimentation ali1 = new Alimentation();
			System.out.println("l'id de ali1 est : " + ali1.getId());
			
			Alimentation ali2 = new Alimentation();
			System.out.println("l'id de ali2 est : " + ali2.getId());
			
			Alimentation ali3 = new Alimentation();
			System.out.println("l'id de ali3 est : " + ali3.getId());

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
			
			
			titi.setAlimentation(ali1);
			toto.setAlimentation(ali3);
			
			
			}


}
