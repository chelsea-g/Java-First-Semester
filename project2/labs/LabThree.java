/**
 *  @author    Chelsea Greger
 *  @section   Th 5:30 - 9:20
 *  @file      LabThree.java
 *  @use       Holds methods to output greetings
 */
 
 public class LabThree {
	
	/**
	 *  @name   - sayHello
	 *  @param  - name: name of person to greet
	 *  @use    - output a customized greeting
	 */
	public void sayHello(String name) {
		System.out.println("Hello there " + name);
	
	}
	
	/**
	 *  @name   - sayHelloAgain
	 *  @param  - name: name of person to greet
	 *  @param  - loopCount: number of times to output greeting
	 *  @use    - Output a greeting the number of times specified in loopCount
	 */
	public void sayHelloAgain(String name, int loopCount) {
		
		System.out.println();
		for (int i = loopCount; i > 0; i--) {
			System.out.println("Hi " + name);
			
		}
		
	
	}
	
 }
