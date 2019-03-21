package epam.second;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class HouseConstructionTest {

	HouseConstruction testClass1;
	HouseConstruction testClass2;
	HouseConstruction testClass3;
	HouseConstruction testClass4;
	
	@Before
	public void setUp() throws Exception
	{
		testClass1=new HouseConstruction(1,1000,false);
		testClass2=new HouseConstruction(2,1000,false);
		testClass3=new HouseConstruction(3,1000,false);
		testClass4=new HouseConstruction(3,1000,true);
		testClass1.setCostPerSquareFeet();
		testClass2.setCostPerSquareFeet();
		testClass3.setCostPerSquareFeet();
		testClass4.setCostPerSquareFeet();
	}
	

	@Test
	public void testGetCostPerSquareFeet() {
		assertEquals(1200,testClass1.getCostPerSquareFeet());
		assertEquals(1500,testClass2.getCostPerSquareFeet());
		assertEquals(1800,testClass3.getCostPerSquareFeet());
		assertEquals(2500,testClass4.getCostPerSquareFeet());
	}

	@Test
	public void testGetTotalCost() {
		assertEquals(1200000,testClass1.getTotalCost());
		assertEquals(1500000,testClass2.getTotalCost());
		assertEquals(1800000,testClass3.getTotalCost());
		assertEquals(2500000,testClass4.getTotalCost());
	}

}

