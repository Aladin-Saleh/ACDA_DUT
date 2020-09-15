import org.junit.Test;

public class test extends Lendemain{


	@Test
	public void testMois()
	{
		assertTrue(mois < 12);	
	}

	@Test
	public void testJour()
	{
		assertTrue("Valeur jour respecté",jour < 31);
	}

	@Test
	public void testAnne()
	{
		assertTrue("Valeur année respecté",mois < 12 && jour < 31);
	}

}
