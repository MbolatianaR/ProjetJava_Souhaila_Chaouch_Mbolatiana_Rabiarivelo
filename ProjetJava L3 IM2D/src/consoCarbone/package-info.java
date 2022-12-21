/** <strong> consoCarbone </strong> est un package compose de 8 elements, 
 * <em>en ne comptant pas la classe main ou nous avons ecris tous les tests pour verifier le bon fonctionnement des differents elements. </em>

 * <br>
 * <br>
 * Le package est compose de 6 classes. 
 * <br><br>
 * Il y a la classe mere : <strong>ConsoCarbone</strong>, qui correspond a un poste de consommation generique. 
 * <br>
 * Quatres classes heritent de cette classe  : <strong>Alimentation, BienConso, Logement, Transport</strong> : <br>
 * <br> 
 * - <strong>Alimentation</strong> est une classe fille de <strong>ConsoCarbone</strong> qui correspond au poste de consommation carbone de l’utilisateur.rice concernant son alimentation <br>
 * - <strong>BienConso</strong> est une classe fille de <strong>ConsoCarbone</strong> qui correspond au poste de consommation carbonne de l'utlisteur.rice concernant ses depenses en biens de consommation <br>
 * - <strong>Transport</strong> est une classe fille de <strong>ConsoCarbone</strong> qui correspond au poste de consommation carbonne de l'utlisteur.rice concernant ses deplacements <br>
 * - <strong>Logement</strong> est une classe fille de <strong>ConsoCarbone</strong> qui correspond au poste de consommation carbonne de l'utlisteur.rice concernant son logement <br>
 * <br>
 * La classe <strong>ServicesPublics</strong> est la seule classe a ne pas heriter de <strong>ConsoCarbone</strong>. <em>Cette classe a la particularite de valoir 1. TCO2eq pour tous les français.</em> 
 * <br><br>
 * Nous retrouvons aussi des enumerations dans ce package. <br>
 * Il y en a 2 : <br>
 * - <strong>CE</strong>, qui correspond a est un coefficient multiplicatif dépendant de la classe énergétique du logement. <em>C'est plus detaille dans l'enumeration CE</em> <br>
 * - <strong>Taille</strong>, qui a deux instances P et G correspondant à "petite voiture" et "grosse voiture". La production d’une petite voiture emet 4.2tCO2eq et celle d’une grosse voiture 19tCO2eq
 * 
 * 
 * @author Souhaila
 * @author Mbolatiana

 * */
package consoCarbone;

