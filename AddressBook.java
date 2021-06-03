package com.bridgelabz.addressbook;

import java.util.Scanner;

public class AddressBook {
	
	public static void main(String[] args) 
	{

		System.out.println("Welcome to the Address Book System");
		
		ModelContactDetails contact = new ModelContactDetails("Pratik","Hajare","Meera Nagar","Shahada", "Maharastra", "pratikhajare09@gmail.com",425409,985000907);
		
		System.out.println("Contact is Created for : " + contact.firstName + " "+ contact.lastName);
		
	}
	
}
