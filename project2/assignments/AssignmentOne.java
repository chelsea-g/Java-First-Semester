/**
 *  @author    Chelsea Greger
 *  @section   Th 5:30 - 9:20
 *  @file      AssignmentOne.java
 *  @use       Outputs the product of loopCounter * addValue
 */
 
 public class AssignmentOne {
	
	
	int loopCounter = 10;
	double addValue = 12.76;
	double totalCalcAmt;
	
	/**
	 *  @name   - runLoop
	 *  @use    - increment totalCalcAmt by the addValue loopCounter 
	 *  		  number of times
	 */
	public void runLoop() {
		totalCalcAmt = 0;
		while(loopCounter != 0) {
			totalCalcAmt += addValue;
			loopCounter--;
		}
		System.out.println("The total is: " + totalCalcAmt);
	}
 
 }