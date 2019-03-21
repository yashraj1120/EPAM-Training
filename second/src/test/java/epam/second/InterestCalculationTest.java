package epam.second;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class InterestCalculationTest {

	InterestCalculation testClass;
	
	@Before
	public void setUp() throws Exception
	{
		testClass=new InterestCalculation();
	}
	
	@Test
	public void testSimpleInterest() {
		assertEquals(2500.00,testClass.simpleInterest(5000.00,10.00,5),0.5);
	}

	@Test
	public void testCompoundInterest() {
		assertEquals(8235.05,testClass.compoundInterest((double)5000,0.05,12,10),0.5);
	}

}
