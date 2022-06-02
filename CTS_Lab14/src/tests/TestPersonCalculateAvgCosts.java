package tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import classes.Person;
import classes.SlowTestsClass;

public class TestPersonCalculateAvgCosts {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	
	//CORRECT
	
	@Category(SlowTestsClass.class)
	@Test
	public void testConformance() throws Exception {
		//validate the format of the input (you retrun a double-> did you receive a double as parameter?)
		int [] costs= {20, 30, 10,70,95,100};
		Person pers=new Person();
		pers.setCostReceipts(costs);
		
		double result=pers.calcAvgCosts();
		//check the format of the result -> it should be a double
		double expected=54.16;  //54.(6)
		assertEquals(expected, result, 0.2);		//format test 
		
		
	}

	//simple test
	@Test
	public void testOrdering() throws Exception {
		
		//if the changing the order of the values is changing the result
		int [] costs= {30,20, 10,70,95,100};
		Person pers=new Person();
		pers.setCostReceipts(costs);
		
		double result=pers.calcAvgCosts();
		double expected=54.16;  //54.(6)
		assertEquals(expected, result, 0.2);		//checking the results only			
	}

	@Test
	public void testRangeResult() throws Exception {
		//result
		int [] costs= {30,20, 10,70,95,100};
		Person pers=new Person();
		pers.setCostReceipts(costs);
		
		double result=pers.calcAvgCosts();
		//double expected=54.16;  //54.(6)
		assertTrue((result>=0&&result<=200));
	}
	
	//expeccting the error
	@Test(expected=Exception.class)
	public void testRangeInput() throws Exception {
		int [] costs= {30,20, 10,-70,95,100};
		Person pers=new Person();
		pers.setCostReceipts(costs);
		
		double result=pers.calcAvgCosts();
		//double expected=54.16;  //54.(6)
		//assertTrue((result>=0&&result<=200));
	}
	
	@Test		//not expecting the error
	public void testRangeInput2() {
		int [] costs= {30,20, 10,-70,95,100};
		Person pers=new Person();
		pers.setCostReceipts(costs);
		
		
		try {
			double result=pers.calcAvgCosts();
			fail("range input test not throwing expcetion");
		} catch (Exception e) {
			// TODO Auto-generated catch block
//			/e.printStackTrace();
			assertTrue(true);		//expect to get the exception
		}

	}
	
	@Category(SlowTestsClass.class)
	@Test(expected=Exception.class)
	public void testExistance() throws Exception {
		int[]costs= {};
		Person pers=new Person();
		pers.setCostReceipts(costs);
		
		pers.calcAvgCosts(); //expecting an error bc we trhew it in the method
		
	}
	
	@Category(SlowTestsClass.class)
	@Test
	public void testCardinality() throws Exception {
		//1 val
		int[]costs= {90};
		Person pers=new Person();
		pers.setCostReceipts(costs);
		pers.calcAvgCosts(); //not expecting errors
		
		assertEquals(1, pers.getCostReceipts().length);
		
	}
}
