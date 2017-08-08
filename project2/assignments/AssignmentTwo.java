/**
 *  @author    Chelsea Greger
 *  @section   Th 5:30 - 9:20
 *  @file      AssignmentTwo.java
 *  @use       Output the sum of all fruitCounts
 */
 
 public class AssignmentTwo {
	
	//Declare instance variables
	private FruitCount[] fruits;
	private int fruitCountTotal;
	
	public void run() {
		
		//Initialize FruitCount array to hold 5 values
		fruits = new FruitCount[5];
		
		for(int i = 0; i < fruits.length; i++) {
			
			fruits[i] = new FruitCount();
		
		}
		
		//Create 5 fruit objects
		fruits[0].setFruitName("Banana");
		fruits[0].setFruitCount(6);
		
		fruits[1].setFruitName("Apple");
		fruits[1].setFruitCount(9);
		
		fruits[2].setFruitName("Grape");
		fruits[2].setFruitCount(50);
		
		fruits[3].setFruitName("Tomato");
		fruits[3].setFruitCount(4);
		
		fruits[4].setFruitName("Pear");
		fruits[4].setFruitCount(3);
		
		//Add all fruit counts together
		for (FruitCount fruit : fruits) {
			fruitCountTotal += fruit.getFruitCount();
			
		}
		
		//Output fruitCountTotal
		System.out.println("Total Fruits: " + fruitCountTotal);
	}
	
 }