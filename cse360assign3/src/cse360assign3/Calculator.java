package cse360assign3;

/**
 * Class to implement calculator functions: add, subtract, total, multiply, divide, and 
 * will return the history of the mathematical functions used. 
 * Third version. 
 * 
 * @author Patricia Evans PIN: 308 for CSE360 Spring 2016
 * @version February 21, 2016
 * 
 */
public class Calculator {
	
	private int total;
	private String history;
	
	/**
	 * Total is zero, history is "0".
	 * 
	 * @param none
	 */
	public Calculator(){
	
		total = 0; 
		history = "0";
		
	}
	
	/**
	 * getTotal - returns the total calculated. 
	 * 
	 * @param none
	 * @return total int  A class variable that is the total calculated. 
	 */
	public int getTotal(){
		
		return total;
		
	}
	
	/**
	 * add - adds total and value. 
	 * 					String history is appended with " + " + value. 
	 * 
	 * @param value int The value that is added to the total. 
	 */
	public void add(int value){
		
		total = total + value;
		history = history + " + " + value;
		
	}
	
	/**
	 * subtract - subtracts value from total. 
	 * 					String history is appended with " - " + value. 
	 * 
	 * @param value int The value that is subtracted from the total. 
	 */
	public void subtract(int value){
		
		total = total - value;
		history = history + " - " + value;
		
	}
	
	/**
	 * multiply - multiplies total and value. 
	 * 					String history is appended with " * " + value. 
	 * 
	 * @param value int The value that is multiplied to the total. 
	 */
	public void multiply(int value){
			
		total = total * value;
		history = history + " * " + value;
		
	}
	
	/**
	 * divide - divides total and value. If the total or value is 0, then total is set to 0. 
	 * 					String history is appended with " / " + value. 
	 * 
	 * @param value int The value that the total is divided by. 
	 */
	public void divide(int value){
		
		if(value == 0 || total == 0){
			
			total = 0;
			
		}
		
		else{
			
			total = total / value;
			
		}
		
		history = history + " / " + value;
				
	}
	
	/**
	 * getHistory - returns the history of the calculations implemented as a String. 
	 * 
	 * @param none
	 * @return history String  A class variable that is appended in each math function 
	 * 								excluding getTotal(). 
	 */
	public String getHistory(){
		
		return history;
	
	}

}