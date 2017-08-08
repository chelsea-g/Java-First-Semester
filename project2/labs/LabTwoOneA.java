/**
 *  @author    Chelsea Greger
 *  @section   Th 5:30 - 9:20
 *  @file      LabTwoOneA.java
 *  @use       Variable types demonstration.
 */
 
public class LabTwoOneA {

	int intType = 5;
	long longType = 78;
	double doubleType = 2.7;
	
	
	/**
	 *  @name   - calculateProduct
	 *  @use    - outputs the product of multiple numbers
	 */
	public void calculateProduct() {
		System.out.println(intType * longType * doubleType);
		
	}
	
	/**
	 *  @name   - calculateQuotient
	 *  @use    - outputs the quotient of 2 numbers
	 */
	public void calculateQuotient() {
		//Cast intType to get correct answer
		System.out.println(longType / (float)intType);
		
	}

}