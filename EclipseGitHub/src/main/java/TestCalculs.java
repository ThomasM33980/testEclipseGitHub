
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestCalculs {

	int valeur1 = 10;
	int valeur2 = 5;
	
	Calculs calcul1 = new Calculs(valeur1, valeur2);
	@Test
	public void testAddition() {	  
		assertEquals(15,calcul1.additionner());
	}
	/**
	@Test
	public void testSoustraction() {	  
		assertEquals(5,calcul1.soustraire());
	}
	
	@Test
	public void testDivision() {	  
		assertEquals(2,calcul1.diviser());
	}
	
	@Test
	public void testMultiplication() {	  
		assertEquals(50,calcul1.multiplier());
	}**/
}
