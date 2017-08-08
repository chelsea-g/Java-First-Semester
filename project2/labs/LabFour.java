/**
 *  @author    Chelsea Greger
 *  @section   Th 5:30 - 9:20
 *  @file      LabFour.java
 *  @use       Demonstrate getters and setters
 */
 
 public class LabFour {
 
	//Declare instance variables
	private String firstName;
	private String lastName;
	private int count;
	private double salary;
	
	//Setter Methods
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;	
	
	}
	
	public void setCount(int count) {
		this.count = count;	
		
	}
	
	public void setSalary(double salary) {
		this.salary = salary;	
		
	}
	
	//Getter Methods
	public String getFirstName() {
		return firstName;
		
	}
	
	public String getLastName() {
		return lastName;
		
	}
	
	public int getCount() {
		return count;
		
	}
	
	public double getSalary() {
		return salary;
	
	}
	
	/**
	 *  @name   - display
	 *  @use    - Formats and outputs person's information
	 *  		  using LabFour's getter methods.
	 */
	public void display() {
		System.out.println("First Name: " + getFirstName()
			+ "\nLastName: " + getLastName() 
			+ "\nCount: " + getCount()
			+ "\nSalary: " + getSalary()
			+ "\n");
	
	}
	
 }
