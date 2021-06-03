package com.bridgelabz.addressbook;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBook {
	

	private ArrayList<ModelContactDetails> modelContactList;  			// Declearing Arraylist with Model Class  
	
	public AddressBook()
	{
		modelContactList = new ArrayList<ModelContactDetails>();  		// Initaillizing Arraylist 
	}

	public void addContact(ModelContactDetails createPerson)
	{
		System.out.println("Adding a New Contact for " + createPerson.firstName);      // Creating a Method and Adding object in a Arraylist 
		modelContactList.add(createPerson);
	}
	
	public ModelContactDetails getContactInput()							// Getting a Input from User
	{
		
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First Name:");
		String fName = sc.nextLine();
		System.out.println("Enter Last Name:");
		String lName = sc.nextLine();
		System.out.println("Enter the Address:");
		String address = sc.nextLine();
		System.out.println("Enter the City:");
		String city = sc.nextLine();
		System.out.println("Enter the State:");
		String state = sc.nextLine();
		System.out.println("Enter the Zip:");
		long zip = sc.nextLong();
		System.out.println("Enter the Phone No:");
		long phoneNo = sc.nextLong();
		sc.nextLine();
		System.out.println("Enter the Email:");
		String email = sc.nextLine();
		
		ModelContactDetails contact = new ModelContactDetails(fName, lName, address, city, state, email, zip, phoneNo);
		return contact;
	}
	
	public static void main(String[] args) 
	{
		
		System.out.println("Welcome to the Address Book System");
		int ch = 0;
		Scanner sc = new Scanner(System.in);
		AddressBook AD = new AddressBook(); 					// Creating a Object of Main Class
		while(true)												// Checking a Choice with Switch Statement
		{
			System.out.println("1.Adding Contact \n2.Exit");
			System.out.println("Enter a Your Choice :");
			ch = sc.nextInt();

			switch(ch) 
			{
				case 1: 
						ModelContactDetails modelContactDetails = AD.getContactInput();
						AD.addContact(modelContactDetails);
	
						System.out.println("Contact Added Successfully");
						break;
						 
				case 2: 
						System.out.println("Thank You We are Exiting");
						return;
						
				default: 
						System.out.println("Sorry You are Type Wrong Choice");
				
			}
		}
		
	}
	
}
