package consoCarboneTest;
import consoCarbone.*;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
/**Dans la classe AlimentationTest nous testons toutes les methodes de la classe Alimentation
 * <br>
 * Nous remarquons qu'il n'est pas necessaire de faire de test unitaire pour les <em>getters</em>. 
 * 
 * @author Souhaila
 * @author Mbolatiana
 * 
 *  */
class AlimentationTest {
	
	Alimentation ali =  new Alimentation();

	@Test
	void testToString() {
		String expectedvalue = "Alimentation {id = 1 , Impact = 0.0, txBoeuf = 0 , txVege = 0}";
		assertEquals(expectedvalue,ali.toString());
	}
	
	@Test
	void testAlimentation() {
		double a = 0;
		double b = 0;
		assertEquals(a,ali.getTxVege());
		assertEquals(b,ali.getTxBoeuf());
	}


	@Test
	void testAfficher() {
		fail("Void, ne renvoie rien");
	}

	@Test
	void testCompareTo() {
		ConsoCarbone conso = new Logement();
		assertEquals(0, ali.compareTo(conso));
	}
	
}
