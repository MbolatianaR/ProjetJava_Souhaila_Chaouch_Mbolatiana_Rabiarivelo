package consoCarboneTest;
import consoCarbone.*;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
/**Dans la classe LogementTest nous testons toutes les methodes de la classe Logement
 * <br>
 * Nous remarquons qu'il n'est pas necessaire de faire de test unitaire pour les <em>getters</em>. 
 * 
 * @author Souhaila
 * @author Mbolatiana
 * 
 *  */
class LogementTest {
	
	Logement log = new Logement();

	
	@Test
	void testToString() {
		String expectedvalue = "Logement {id = 1 , Impact = 0.0, Superficie = 0 , ce = D}";
		assertEquals(expectedvalue,log.toString());
	}
	

	// Test Unitaire pour le constructeur non parametre
	@Test
	void testLogement() {
		int sup = 0;
		CE ce = CE.D;
		assertEquals(sup,log.getSuperficie());
		assertEquals(ce,log.getCE());
	}


	@Test
	void testAfficher() {
		fail("Void, ne renvoie rien");
	}

	@Test
	void testCompareTo() {
		Logement log2 = new Logement(15,CE.C);
		assertEquals(0,log.compareTo(log2));
	}

}
