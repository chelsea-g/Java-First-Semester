/**
 *  @author    Chelsea Greger
 *  @section   Th 5:30 - 9:20
 *  @file      ContactsTestDrive.java
 *  @use       Creates contact data, and outputs it to terminal
 */
 
 public class ContactsTestDrive {
	
	public static void main(String[] args) {
		
		//Instantiate a Contacts object
		Contacts bestFriend = new Contacts();
		
		//Set all data within Contacts object (bestFriend)
		bestFriend.firstName = "Erin";
		bestFriend.lastName = "Larson";
		bestFriend.address = "123 Dorn Drive";
		bestFriend.phone = "608-323-3232";
		bestFriend.email = "erindance@yahoo.com";
		
		//Display data within Contacts object (bestFrind)
		bestFriend.display();
		
		//Instantiate a second Contacts object
		Contacts mom = new Contacts();
		
		
		//Set all data within Contacts object (mom)
		mom.firstName = "Susan";
		mom.lastName = "Greger";
		mom.address = "72 Kessel Court";
		mom.phone = "608-633-6565";
		mom.email = "suegr@gmail.com";
		
		//Display data within Contacts object (mom)
		mom.display();
		
	}
 
 }