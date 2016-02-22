package cse360assign3;

import static org.junit.Assert.*;

import org.junit.Test;

/*
 * Junit test cases to be implemented with the file: Calculator.java
 * Initial version. 
 * 
 * Author: Patricia Evans PIN: 308 for CSE360 Spring 2016
 * Date: February 21, 2016
 * 
 */
public class CalculatorTest{

	//Checking that the constructor is not null. 
	@Test
	public void testCalculator(){
		
		Calculator calc = new Calculator();
		assertNotNull(calc);
		
	}
	
	//getTotal - Test will fail
	@Test
	public void testGetTotal(){
		
		fail("Not yet implemented");
		
	}
	
	//add - Test will fail
	@Test
	public void testAdd(){
		
		fail("Not yet implemented");
		
	}
	
	//subtract - Test will fail
	@Test
	public void testSubtract(){
		
		fail("Not yet implemented");
		
	}
	
	//multiply - Test will fail
	@Test
	public void testMultiply(){
		
		fail("Not yet implemented");
		
	}
	
	//divide - Test will fail
	@Test
	public void testDivide(){
		
		fail("Not yet implemented");
		
	}
	
	//getHistory - Test will fail
	@Test
	public void testGetHistory(){
		
		fail("Not yet implemented");
		
	}

}
