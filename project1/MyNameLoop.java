/**
 *  @author    Chelsea Greger
 *  @section   Th 5:30 - 9:20
 *  @file      MyNameLoop.java
 *  @use       The MyNameLoop Class
 */
 
 public class MyNameLoop {

	String fullName = "Chelsea Greger";
	int counter = 10;
	
	/**
	 *  @name - loopName
	 *  @use  - Print fullName on a new line for each iteration of the loop.
	 *  
	 */
	public void loopName() {
	
		while (counter > 0) {
			System.out.println(fullName);
			counter--;
		}
	
	}
	
 }