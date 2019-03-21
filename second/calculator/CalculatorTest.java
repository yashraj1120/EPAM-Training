package epam.second;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {

	private Calculator calculatorTest;
	 
	@Before
	public void setUp() throws Exception{
		calculatorTest=new Calculator();
	}
	
	@Test
	public void testAdd() {
		assertEquals(8,calculatorTest.add(5,3));
		assertEquals(82,calculatorTest.add(52,30));
		assertEquals(0,calculatorTest.add(5,-5));
		assertEquals(4,calculatorTest.add(5,-1));
	}

	@Test
	public void testSubtract() {
		assertEquals(2,calculatorTest.subtract(5,3));
		assertEquals(22,calculatorTest.subtract(52,30));
		assertEquals(10,calculatorTest.subtract(5,-5));
		assertEquals(4,calculatorTest.subtract(5,1));
	}

	@Test
	public void testDivide() {
		assertEquals(1,calculatorTest.divide(5,3));
		assertEquals(1,calculatorTest.divide(52,30));
		assertEquals(-1,calculatorTest.divide(5,-5));
		assertEquals(5,calculatorTest.divide(5,1));
	}

	@Test
	public void testMultiply() {
		assertEquals(0,calculatorTest.multiply(0,3));
		assertEquals(-15,calculatorTest.multiply(5,-3));
		assertEquals(-121,calculatorTest.multiply(11,-11));
		assertEquals(15,calculatorTest.multiply(5,3));
	}

}
