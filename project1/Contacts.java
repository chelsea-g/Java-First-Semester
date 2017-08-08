/**
 *  @author    Chelsea Greger
 *  @section   Th 5:30 - 9:20
 *  @file      Contacts.java
 *  @use       The Contacts Class
 */
 
 public class Contacts {
	
	String firstName;
	String lastName;
	String address;
	String phone;
	String email;
	
	/**
	 *  @name - display
	 *  @use  - display current contact information
	 */
	public void display() {
		System.out.println("First Name: " + firstName);
		System.out.println("Last Name: " + lastName);
		System.out.println("Address: " + address);
		System.out.println("Phone: " + phone);
		System.out.println("Email: " + email + "\n");
		
	}
 
 }