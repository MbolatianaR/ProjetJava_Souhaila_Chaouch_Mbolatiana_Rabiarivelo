/** <strong> consoCarbone </strong> est un package composé de 8 éléments, 
 * <em>en ne comptant pas la classe main où nous avons écris tous les tests pour vérifier le bon fonctionnement des différents éléments. </em>

 * <br>
 * <br>
 * Le package est composé de 6 classes. 
 * <br><br>
 * Il y a la classe mère : <strong>ConsoCarbone</strong>, qui correspond à un poste de consommation générique. 
 * <br>
 * Quatres classes héritent de cette classe  : <strong>Alimentation, BienConso, Logement, Transport</strong> : <br>
 * <br> 
 * - <strong>Alimentation</strong> est une classe fille de <strong>ConsoCarbone</strong> qui correspond au poste de consommation carbone de l’utilisateur.rice concernant son alimentation <br>
 * - <strong>BienConso</strong> est une classe fille de <strong>ConsoCarbone</strong> qui correspond au poste de consommation carbonne de l'utlisteur.rice concernant ses dépenses en biens de consommation <br>
 * - <strong>Transport</strong> est une classe fille de <strong>ConsoCarbone</strong> qui correspond au poste de consommation carbonne de l'utlisteur.rice concernant ses déplacements <br>
 * - <strong>Logement</strong> est une classe fille de <strong>ConsoCarbone</strong> qui correspond au poste de consommation carbonne de l'utlisteur.rice concernant son logement <br>
 * <br>
 * La classe <strong>ServicesPublics</strong> est la seule classe à ne pas hériter de <strong>ConsoCarbone</strong>. <em>Cette classe a la particularité de valoir 1. TCO2eq pour tous les français.</em> 
 * <br><br>
 * Nous retrouvons aussi des enumerations dans ce package. <br>
 * Il y en a 2 : <br>
 * - <strong>CE</strong>, qui correspond à est un coefficient multiplicatif dépendant de la classe énergétique du logement. <em>C'est plus détaillé dans l'énumération CE</em> <br>
 * - <strong>Taille</strong>, qui a deux instances P et G correspondant à "petite voiture" et "grosse voiture". La production d’une petite voiture émet 4.2tCO2eq et celle d’une grosse voiture 19tCO2eq
 * 
 * 
 * @author Souhaila
 * @author Mbolatiana

 * */
package consoCarbone;

