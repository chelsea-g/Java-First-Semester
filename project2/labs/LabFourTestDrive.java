/**
 *  @author    Chelsea Greger
 *  @section   Th 5:30 - 9:20
 *  @file      LabFourTestDrive.java
 *  @use       Main method for LabFour class
 */
 
 public class LabFourTestDrive {
 
	public static void main(String[] args) {
	
		//Instantiate three LabFour class objects
		LabFour person1 = new LabFour();
		LabFour person2 = new LabFour();
		LabFour person3 = new LabFour();
		
		//Assign data to the objects instance variables
		person1.setFirstName("Bat");
		person1.setLastName("Man");
		person1.setCount(3);
		person1.setSalary(1000000.50);
		
		person2.setFirstName("Cat");
		person2.setLastName("Woman");
		person2.setCount(9);
		person2.setSalary(1000100.99);
		
		person3.setFirstName("Finn");
		person3.setLastName("Thehuman");
		person3.setCount(9001);
		person3.setSalary(5000.95);
		
		//Call display() method on each object
		person1.display();
		person2.display();
		person3.display();
		
	}
 
 }
 
 
 