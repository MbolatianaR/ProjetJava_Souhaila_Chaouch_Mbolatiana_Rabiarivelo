package consoCarbone;
import java.util.Scanner;
import java.util.Arrays;


import Utilisatrice.Utilisatrice;
public class Main {


    public static void main(String[] args) {
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
    ali3.setTxBoeuf(4.5);
    System.out.println("le taux de repas à base de boeuf de ali1 est : " + ali1.getTxBoeuf());
    System.out.println("le taux de repas à base de boeuf de ali3 est : " + ali3.getTxBoeuf());
   
   
   
    // verifier le fonctionement du getter et du setter de txVege :
   
    ali1.setTxVege(0.6);
    ali3.setTxVege(3.5);
    System.out.println("le taux de repas végétariens de ali1 est : " + ali1.getTxVege());
       
    // verifier le fonctionnement du getter et du setter de impact :
   
    ali1.setImpact();
    System.out.println("l’impact de l’alimentation de ali1 est : " + ali1.getImpact()+ " TCO2eq ");
    ali3.setImpact();
    System.out.println("l’impact de l’alimentation de ali3 est : " + ali3.getImpact()+ " TCO2eq ");

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
   
    log1.setImpact(12, CE.A);
    System.out.println(log1.getSuperficie());
    System.out.println(log1.getImpact());
    //System.out.println("L'impact du Logement de log1 est : " + log1.getImpact() + " TCO2eq ");
   
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
   
    //cons1.setMontant(0.7);
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
   
   
    // design pattern singleton:
   
    //on vérifie si tous les francais ont la même empreinte de 1.5TCO2eq pour le poste de consommation induit les services publics:
    ServicesPublics singleton1 = ServicesPublics.getInstance();
    System.out.println(singleton1.getvaleurServicesPublics());
   
    ServicesPublics singleton2 = ServicesPublics.getInstance();
    singleton2.getvaleurServicesPublics();
   


    // verifier utilisatrice:
   
    Utilisatrice lulu = new Utilisatrice(ali3, cons1, log1, t2, singleton1);
    Utilisatrice Mbolatiana = new Utilisatrice(ali3, cons1, log1, t2, singleton1);
    Utilisatrice Mairie = new Utilisatrice(ali3, cons1, log1, t2, singleton1);


    lulu.detaillerEmpreinte();
    lulu.afficher();
    System.out.println(" \n ");
    lulu.ordonner();
    lulu.recommendations();

        System.out.println(Mbolatiana.Logement("Mbolatiana"));
        System.out.println(Mbolatiana.Voiture("Mbolatiana"));

       
        System.out.println(Mairie.Logement("Mairie"));
       
       
       
    /**********************************************************************************************************************/

        //////////////Intéraction avec l'utilisateur////////////////
    //////////////Alimentation//////////////////////////////////
   
        //on va utiliser les scanners pour permettre à utilisateur d'inserer son taux de repas à base de boeuf, et  taux de repas végétariens et on va calculer
        //l'impact de l’alimentation de cet utilisateur.rice en termes d’émissions de GES en TCO2eq.

   double txBoeuf1,txVege1;

   Scanner s1 = new Scanner(System.in);
   System.out.println("entrer votre taux de repas (une valeur entre 0 et 1) à base de boeuf svp!");
   txBoeuf1 = s1.nextDouble();
   while(txBoeuf1 >1 || txBoeuf1<0) {
   System.out.println("La valeur que vous avez écrit est inapropriée, entrer une valeur entre 0 et 1 svp!");
   txBoeuf1 = s1.nextDouble();

   }

   //System.out.println("votre taux de repas à base de boeuf est " + txBoeuf1);
   System.out.println("entrer votre taux de repas végétariens svp!");
   
   txVege1 = s1.nextDouble();
        while(txVege1 >1 || txVege1<0) {
        System.out.println("La valeur que vous avez écrit est inapropriée, entrer une valeur entre 0 et 1 svp!");
        txVege1 = s1.nextDouble();
        }
       
        System.out.println("L'impact de votre alimentation est "+ ali1.alimentationImpact(txBoeuf1, txVege1)+" TCO2eq");

    /**********************************************************************************************************************/

    //////////////Logement//////////////////////////////////
       
       int superficie;
   System.out.println("Entrer la superficie de votre logement svp!");
   superficie = s1.nextInt();
   while(superficie <0) {
   System.out.println("La valeur que vous avez écrit est inapropriée, entrer une valeur positive svp!");
   superficie = s1.nextInt();

   }
   String classeEnergetique;
   System.out.println("Merci de saisir une lettre parmi ces lettres :A,B,C,D,E,F,G qui correspond à la classe énergétique de votre logement");
   classeEnergetique = s1.next();
   //on a essayé de faire une condition sur classeEnergetique pour que l'utilisateur ne puisse pas saisir des valeurs différentes de A,B,C,D,E,F,G mais le code ne marche pas.
   String [] tab = {"A","B","C","D","E","F","G"};
   //while (classeEnergetique != "A" && classeEnergetique != "B" && classeEnergetique != "C" && classeEnergetique != "D" && classeEnergetique != "E" && classeEnergetique != "F"&& classeEnergetique != "G" ) {
     //  System.out.println("Saisir une lettre parmi A,B,C,D,E,F,G svp!");
       //classeEnergetique = s1.next();
       //System.out.println("Merci de saisir une lettre parmi ces lettres :A,B,C,D,E,F,G qui correspond à la classe énergétique de votre logement");
       //classeEnergetique = s1.next();

    //}
   
   

   

   CE classeEnum = CE.valueOf(classeEnergetique);
   
   
   System.out.println("L'impact de votre Logement est :"+log1.logementImpact(superficie, classeEnum)+ " TCO2eq");
  
   
       
   /**********************************************************************************************************************/

    //////////////BienConso//////////////////////////////////
        double Bienc ;
        System.out.println("Entrer le montant de vos dépenses annuelles (un nombre réel positif)svp!");
        Bienc = s1.nextDouble();
        while (Bienc < 0) {
   System.out.println("La valeur que vous avez écrit est inapropriée, entrer une valeur positive svp!");
   Bienc = s1.nextDouble();

        }
        System.out.println("le poste de consommation carbone concernant vos dépenses en biens de consommation est : "+ cons1.BienConsoImpact(Bienc));
       
        /**********************************************************************************************************************/

    //////////////Transport//////////////////////////////////
   
    boolean posseder;
    System.out.println("Est ce que vous avez une voiture svp ?(répondez par true c-a-d oui ou false c-a-d non ");
    posseder = s1.nextBoolean();
   
    if (posseder == true) {
   
    String taille;
        System.out.println("saisir le type de votre voiture svp : G pour grosse ou P pour petite ?");
        taille = s1.next();
        Taille taiileEnum = Taille.valueOf(taille);
       
        int km;
        System.out.println("Saisir le kilométrage parcourus cette année svp(saisir un entier positif)?");
        km = s1.nextInt();
        while(km<0) {
        System.out.println("Saisir le kilométrage parcourus cette année svp(saisir un entier positif )?");
            km = s1.nextInt();
        }
       
       
        int amortissement;
        System.out.println("Merci de saisir la durée de conservation de votre véhicule (saisir un entier positif)");
        amortissement = s1.nextInt();
        while (amortissement <0) {
            System.out.println("Merci de saisir la durée de conservation de votre véhicule (saisir un entier positif)");
        }
       
        double fabrication;
        //on aurait pu éviter la question suivante, car normalement l'utilisateur ne sait pas la réponse mais on l'a gardé comme même.
        System.out.println("Merci de saisir le taux des émissions nécessaires à la fabrication de votre voiture (saisir un réel positif)");
        fabrication = s1.nextDouble();
       
           
            while(fabrication<0) {
            System.out.println("Merci de saisir le taux des émissions nécessaires à la fabrication de votre voiture(saisir un réel positif) ");

            }
            System.out.println("l’impact de vos déplacements est : " +t1.transportImpact(posseder, taille, km, amortissement, fabrication)+ " TCO2eq ");
        }
    else {
    System.out.println("l’impact de vos déplacements est : 0 TCO2eq");
    }
       
   
   
   
   
   
   
   
   

}
   
}

