package cse360assign3;

import static org.junit.Assert.*;

import org.junit.Test;

/*
 * Junit test cases to be implemented with the file: Calculator.java
 * Second version. 
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
	
	//getTotal - Test if the initial total is 0.
	@Test
	public void testGetTotalInitial(){
		
		Calculator calc = new Calculator();
		
		assertEquals(0, calc.getTotal());
		
	}
	
	//add - Test to add value and 0.
	@Test
	public void testAddTotalInitial(){
		
		Calculator calc = new Calculator();
		
		calc.add(8);
		
		assertEquals(8, calc.getTotal());
		
	}
	
	//add - Test to add two numbers.
	@Test
	public void testAddTwoNumbers(){
			
		Calculator calc = new Calculator();
			
		calc.add(8);
		calc.add(2);
			
		assertEquals(10, calc.getTotal());
			
	}
	
	//add - Test to add five numbers. 
	@Test
	public void testAddFiveNumbers(){
				
		Calculator calc = new Calculator();
				
		calc.add(13);
		calc.add(6);
		calc.add(7);
		calc.add(22);
		calc.add(1);
				
		assertEquals(49, calc.getTotal());
				
	}
	
	//add - Test to add two negative numbers.
	@Test
	public void testAddTwoNegNumbers(){
					
		Calculator calc = new Calculator();
					
		calc.add(-100);
		calc.add(-45);
					
		assertEquals(-145, calc.getTotal());
					
	}
	
	//add - Test to add a negative and positive number. 
	@Test
	public void testAddNegPosNumbers(){
						
		Calculator calc = new Calculator();
						
		calc.add(-56);
		calc.add(7);
						
		assertEquals(-49, calc.getTotal());
						
	}
	
	//add - Test to add a positive and negative number. 
	@Test
	public void testAddPosNegNumbers(){
							
		Calculator calc = new Calculator();
							
		calc.add(56);
		calc.add(-7);
							
		assertEquals(49, calc.getTotal());
							
	}
	
	//subtract - Test to subtract value and 0.
	@Test
	public void testSubtractTotalInitial(){
		
		Calculator calc = new Calculator();
		
		calc.subtract(8);
		
		assertEquals(-8, calc.getTotal());
		
	}
	
	//subtract - Test to subtract two numbers.
	@Test
	public void testSubtractTwoNumbers(){
			
		Calculator calc = new Calculator();
			
		calc.subtract(10);
		calc.subtract(5);
			
		assertEquals(-15, calc.getTotal());
			
	}
	
	//subtract - Test to subtract five numbers.
	@Test
	public void testSubtractFiveNumbers(){
				
		Calculator calc = new Calculator();
				
		calc.subtract(36);
		calc.subtract(9);
		calc.subtract(88);
		calc.subtract(25);
		calc.subtract(74);
				
		assertEquals(-232, calc.getTotal());
				
	}
	
	//subtract - Test to subtract a negative and positive number.
	@Test
	public void testSubtractNegPosNumbers(){
					
		Calculator calc = new Calculator();
					
		calc.subtract(-25);
		calc.subtract(15);
					
		assertEquals(10, calc.getTotal());
					
	}
	
	//subtract - Test to subtract a positive and negative number.
	@Test
	public void testSubtractPosNegNumbers(){
						
		Calculator calc = new Calculator();
						
		calc.subtract(7);
		calc.subtract(-33);
						
		assertEquals(26, calc.getTotal());
						
	}
	
	//subtract - Test to subtract value from a non-zero total.
	@Test
	public void testSubtractNonZeroTotal(){
					
		Calculator calc = new Calculator();
			
		calc.add(100);
		calc.subtract(12);
		
		assertEquals(88, calc.getTotal());
					
	}
	
	//multiply - Test to multiply value and 0. 
	@Test
	public void testMultiplyTotalInitial(){
		
		Calculator calc = new Calculator();
		
		calc.multiply(8);
		
		assertEquals(0, calc.getTotal());
		
	}
	
	//multiply - Test to multiply value and a positive total. 
	@Test
	public void testAddThenMultiply(){
			
		Calculator calc = new Calculator();
		
		calc.add(9);
		calc.multiply(6);
			
		assertEquals(54, calc.getTotal());
			
	}
	
	//multiply - Test to multiply value and a negative total. 
	@Test
	public void testSubtractThenMultiply(){
				
		Calculator calc = new Calculator();
			
		calc.subtract(14);
		calc.multiply(2);
				
		assertEquals(-28, calc.getTotal());
				
	}
	
	//multiply - Test to multiply a negative value and a negative total. 
	@Test
	public void testMultiplyTwoNeg(){
					
		Calculator calc = new Calculator();
				
		calc.subtract(6);
		calc.multiply(-6);
					
		assertEquals(36, calc.getTotal());
					
	}
	
	//multiply&divide - Test to multiply value to 0, and then divide by a non-zero value. 
	@Test
	public void testMultiplyThenDivideInitial(){
					
		Calculator calc = new Calculator();
				
		calc.multiply(75);
		calc.divide(18);
					
		assertEquals(0, calc.getTotal());
					
	}
	
	//multiply&divide - Test to multiply value and a positive total, then divide by a positive value. 
	@Test
	public void testAddMultiplyDivide(){
						
		Calculator calc = new Calculator();
		
		calc.add(5);
		calc.multiply(4);
		calc.divide(4);
						
		assertEquals(5, calc.getTotal());
						
	}
	
	//multiply&divide - Test to multiply value and a negative total, then divide by positive value. 
	@Test
	public void testSubtractMultiplyDivide(){
							
		Calculator calc = new Calculator();
			
		calc.subtract(12);
		calc.multiply(2);
		calc.divide(2);
							
		assertEquals(-12, calc.getTotal());
							
	}
	//divide - Test to divide value and 0. 
	@Test
	public void testDivideByZeroNumerator(){
		
		Calculator calc = new Calculator();
		
		calc.divide(8);
		
		assertEquals(0, calc.getTotal());
		
	}
	
	//divide - Test to divide 0 and non-zero. 
	@Test
	public void testDivideByZeroDenominator(){
			
		Calculator calc = new Calculator();
			
		calc.add(4);
		calc.divide(0);
			
		assertEquals(0, calc.getTotal());
			
	}
	
	//divide - Test to divide positive value and non-zero total. 
	@Test
	public void testAddDivideByPositive(){
				
		Calculator calc = new Calculator();
				
		calc.add(45);
		calc.divide(5);
				
		assertEquals(9, calc.getTotal());
				
	}
	
	//divide - Test to divide negative value and non-zero total. 
	@Test
	public void testAddDivideByNegative(){
					
		Calculator calc = new Calculator();
					
		calc.add(88);
		calc.divide(-11);
					
		assertEquals(-8, calc.getTotal());
					
	}
	
	//divide - Test to divide positive value and non-zero total. 
	@Test
	public void testSubtractDivideByPositive(){
					
		Calculator calc = new Calculator();
					
		calc.subtract(26);
		calc.divide(13);
					
		assertEquals(-2, calc.getTotal());
					
	}
		
	//divide - Test to divide negative value and non-zero total. 
	@Test
	public void testSubtractDivideByNegative(){
						
		Calculator calc = new Calculator();
						
		calc.subtract(90);
		calc.divide(-10);
						
		assertEquals(9, calc.getTotal());
						
	}
	
	//divide - Test to divide and multiply non-zero numbers, with 0 total. 
	@Test
	public void testDivideMultiplyInitial(){
				
		Calculator calc = new Calculator();
				
		calc.divide(82);
		calc.multiply(245);
				
		assertEquals(0, calc.getTotal());
				
	}
	
	
	//Test to add, subtract, multiply, then divide. 
	@Test
	public void testAddSubtractMultiplyDivide(){
					
		Calculator calc = new Calculator();
		
		calc.add(100);
		calc.subtract(50);
		calc.multiply(2);
		calc.divide(4);
					
		assertEquals(25, calc.getTotal());
					
	}
	
	//getHistory - Test will fail
	@Test
	public void testGetHistory(){
		
		fail("Not yet implemented");
		
	}

}
