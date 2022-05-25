package tests;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import classes.ETypeMarket;
import classes.Market;
import classes.Supermarket;
import exceptions.ExceptionMarket;

public class TestSupermarketGetBiggestMarketByArea {

	static Market m1;
	static Market m2;
	static Market m3;
	static Market m4;
	static Market m5;

	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("setUpBeforeClass");
		m1=new Market("Sephora",20, ETypeMarket.BEAUTY);
		m2=new Market("Douglas",15, ETypeMarket.BEAUTY);
		m3=new Market("Mobexpert",40, ETypeMarket.DECORATION);
		m4=new Market("Zara",24, ETypeMarket.DRESS);
		m5=new Market("H&M",20, ETypeMarket.DRESS);

		
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("tearDownAfterClass");

	}

	@Before
	public void setUp() throws Exception {
		System.out.println("setUp");

	}

	@After
	public void tearDown() throws Exception {
		System.out.println("tearDown");

	}

//	@Test
//	public void test() {
//		//fail("Not yet implemented");
//	}

	//RIGHT BICEP
	
	@Test
	public void testRight() {
		System.out.println("Test RIGHT");
		ArrayList<Market> listMarket=new ArrayList<>();
		listMarket.add(m1);
		listMarket.add(m2);
		listMarket.add(m3);
		listMarket.add(m4);
		listMarket.add(m5);

		Supermarket supermarket=new Supermarket("Mall Bucharest", listMarket);
		try {
			Market result=supermarket.getBigestMarketByArea(ETypeMarket.BEAUTY);
			String expected="Sephora";
			assertEquals(expected, result.getName());
//			if(result.getName().equals(expected)) {
//				assertTrue(true);
//			}else {
//				assertTrue(false);
//			}
		} catch (ExceptionMarket e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			fail("Im not expected to fail");
		}
	}
	
	@Test
	public void testBoundary() {
		//boundary-> the list should have AT LEAST  one element
		System.out.println("Test boundary");
		ArrayList<Market> listMarket=new ArrayList<>();
		listMarket.add(m1);
		Supermarket supermarket=new Supermarket("Mall Bucharest", listMarket);
		try {
			Market result=supermarket.getBigestMarketByArea(ETypeMarket.BEAUTY);
			
			assertEquals("Sephora", result.getName());
		} catch (ExceptionMarket e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			fail("not ok");
		}


	}
	
	@Test(expected=ExceptionMarket.class)
	public void testException() throws ExceptionMarket {
		System.out.println("Test exception");
		ArrayList<Market> listMarket=new ArrayList<>();
		Supermarket supermarket=new Supermarket("Mall Vitan", listMarket);
		
		supermarket.getBigestMarketByArea(ETypeMarket.BEAUTY);
	


	}
	
	
	@Test
	public void testException2()  {
		System.out.println("Test exception");
		ArrayList<Market> listMarket=new ArrayList<>();
		Supermarket supermarket=new Supermarket("Mall Vitan", listMarket);
		
		try {
			supermarket.getBigestMarketByArea(ETypeMarket.BEAUTY);
			fail("not ok, it should fail");
		} catch (ExceptionMarket e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			assertTrue(true);
			assertEquals(10.2,10.3,0.5);	//0.5-delta: used for comparing 2 values that can have small differences in a given delta interval
		}
	


	}
	
	@Test
	public void testPerformance() throws ExceptionMarket {
		System.out.println("Test performance");
		ArrayList<Market> listMarket=new ArrayList<>();
		listMarket.add(m1);
		listMarket.add(m2);
		listMarket.add(m3);
		listMarket.add(m4);
		listMarket.add(m5);

		Supermarket supermarket=new Supermarket("Mall Bucharest", listMarket);
		
		double startTime=System.currentTimeMillis();
		supermarket.getBigestMarketByArea(ETypeMarket.BEAUTY); 	//call only the method between startTime and endtime
		double endTime=System.currentTimeMillis();
		
		assertTrue("it s fast",endTime-startTime<5);
	}
	
	public Market getLargestMarket(ArrayList<Market> list, ETypeMarket type) {
		Market m=null;
		//sort the list by area
		 
		return m;
	}
	
	@Test
	public void testCrossCheck() {
		//find another way to get the result
		System.out.println("Test crosscheck");
		ArrayList<Market> listMarket=new ArrayList<>();
		listMarket.add(m1);
		listMarket.add(m2);
		listMarket.add(m3);
		listMarket.add(m4);
		listMarket.add(m5);

		Supermarket supermarket=new Supermarket("Mall Bucharest", listMarket);
		Market expected=getLargestMarket(listMarket, ETypeMarket.BEAUTY);
		Market actual=getLargestMarket(listMarket, ETypeMarket.BEAUTY);
		assertEquals(expected, actual);
		
	}
	
	@Test
	public void testInversion() throws ExceptionMarket {
		System.out.println("Test RIGHT");
		ArrayList<Market> listMarket=new ArrayList<>();
		listMarket.add(m1);
		listMarket.add(m2);
		listMarket.add(m3);
		listMarket.add(m4);
		listMarket.add(m5);
		
		Supermarket supermarket=new Supermarket("Mall Bucharest", listMarket);
		Market result=supermarket.getBigestMarketByArea(ETypeMarket.BEAUTY);
		for(int i=0;i<listMarket.size();i++) {
			if(result.getName().equals(listMarket.get(i))) {
				//maxArea
				//save positioin
			}
		}
		//check if the positioin is between [0,listM.size()]
		
	}
}
