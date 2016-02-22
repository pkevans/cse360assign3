package cse360assign3;

/**
 * Class to implement calculator functions: add, subtract, total, multiply, divide, and history. 
 * Second version. getHistory method left empty. 
 * 
 * @author Patricia Evans PIN: 308 for CSE360 Spring 2016
 * @version February 21, 2016
 * 
 */
public class Calculator {
	
	private int total;
	
	/**
	 * Total is zero 
	 * 
	 * @param none
	 */
	public Calculator(){
	
		total = 0;  
	
	}
	
	/**
	 * getTotal - returns the total calculated. 
	 * 
	 * @param none
	 * @return int 0
	 */
	public int getTotal(){
		
		return total;
		
	}
	
	/**
	 * add - adds total and value. 
	 * 
	 * @param value int 
	 */
	public void add(int value){
		
		total = total + value;
	}
	
	/**
	 * subtract - subtracts value from total. 
	 * 
	 * @param value int 
	 */
	public void subtract(int value){
		
		total = total - value;
		
	}
	
	/**
	 * multiply - multiplies total and value. 
	 * 
	 * @param value int 
	 */
	public void multiply(int value){
			
		total = total * value;
		
	}
	
	/**
	 * divide - divides total and value. 
	 * 
	 * @param value int 
	 */
	public void divide(int value){
		
		if(value == 0 || total == 0){
			
			total = 0;
			
		}
		
		else{
			
			total = total / value;
			
		}
				
	}
	
	/**
	 * getHistory - to remain empty for commit
	 * 
	 * @param none
	 * @return String - empty string. 
	 */
	public String getHistory(){
		
		return "";
	
	}

}
