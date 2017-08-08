/**
 *  @author    Chelsea Greger
 *  @section   Th 5:30 - 9:20
 *  @file      LabSix.java
 *  @use       Demonstrates int and double calculations
 */
 
public class LabSix {
	
	public void run() {
	
		//Declare and initialize local variables
		int num1 = 5;
		int num2 = 10;
		int num3 = 3;
		int num4 = 25;
		
		int resultsInt = 0;
		double resultsDouble = 0.0;
		
		//Add all values together
		resultsInt = num1 + num2 + num3 + num4;
		
		//Output int results
		System.out.println("int result: " + resultsInt);
		
		//Multiply 3 of the variables and divide by the variable that equals 3
		//(num3)
		resultsDouble = (num1 * num2 * num4) / (double)num3;
		
		//Output double results
		System.out.println("double result: " + resultsDouble);
		
	}
	
	

}