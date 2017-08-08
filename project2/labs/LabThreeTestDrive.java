/**
 *  @author    Chelsea Greger
 *  @section   Th 5:30 - 9:20
 *  @file      LabThreeTestDrive.java
 *  @use       Main method to output greetings in LabThree
 */
 
 public class LabThreeTestDrive {
 
	public static void main(String[] args) {
		
		//Create LabThree object
		LabThree greet = new LabThree();
		
		//say hello
		greet.sayHello("Chelsea");
		greet.sayHello("Jacob");
		greet.sayHello("Adam");
		greet.sayHello("Erin");
	
		//say hi again
		greet.sayHelloAgain("Fred", 5);
	}
 }