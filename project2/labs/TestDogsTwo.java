/**
 *  @author    Chelsea Greger
 *  @section   Th 5:30 - 9:20
 *  @file      TestDogsTwo.java
 *  @use       Demonstrate Null Pointer Exceptions
 */
 
 public class TestDogsTwo {
	
	public static void main(String[] args) {
		
		//Create two DogLabTwo objects
		DogLabTwo dog1 = new DogLabTwo();
		DogLabTwo dog2 = new DogLabTwo();
		
		//Add a third DogLabTwo object
		DogLabTwo dog3 = new DogLabTwo();
		
		//Name the first dog Fido and the second dog Spot
		dog1.name = "Fido";
		dog2.name = "Spot";
		
		//Name third dog
		dog3.name = "Bear";
		
		//Make both dogs bark
		dog1.bark();
		dog2.bark();
		
		//Make third dog bark
		dog3.bark();
		
		//Delete third dog refference by assigning "null"
		dog3 = null;
		
		//Assign dog1 to dog2
		dog1 = dog2;
		
		//Make both dogs bark again
		dog1.bark();
		dog2.bark();
	    
		//Try to make third dog bark (wont work: Null Pointer Exception)
		dog3.bark();
	
	}
 
 }