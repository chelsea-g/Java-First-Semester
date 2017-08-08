/**
 *  @author    Chelsea Greger
 *  @section   Th 5:30 - 9:20
 *  @file      TestDogs.java
 *  @use       Demonstrates references pointing to the same object
 */
 
 public class TestDogs {
	
	public static void main(String[] args) {
		
		//Create two DogLabTwo objects
		DogLabTwo dog1 = new DogLabTwo();
		DogLabTwo dog2 = new DogLabTwo();
		
		//Name the first dog Fido and the second dog Spot
		dog1.name = "Fido";
		dog2.name = "Spot";
		
		//Make both dogs bark
		dog1.bark();
		dog2.bark();
		
		//Assign dog1 to dog2
		dog1 = dog2;
		
		//Make both dogs bark again
		dog1.bark();
		dog2.bark();
	
	}
 
 }