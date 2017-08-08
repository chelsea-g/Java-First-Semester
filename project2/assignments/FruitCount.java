/**
 *  @author    Chelsea Greger
 *  @section   Th 5:30 - 9:20
 *  @file      FruitCount.java
 *  @use       Getter and Setters for FruitCount app
 */
 
 public class FruitCount {
	
	//Declare instance variables
	private String fruitName;
	private int fruitCount;
	
	//Getter and Setter methods
	public void setFruitName(String fruitName) {
		this.fruitName = fruitName;
	
	}
	
	public String getFruitName() {
		return fruitName;
	
	}
	
	public void setFruitCount(int fruitCount) {
		this.fruitCount = fruitCount;
	
	}
	
	public int getFruitCount() {
		return fruitCount;
	
	}
	
 }