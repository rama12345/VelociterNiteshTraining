package com.velociter.nitesh.chapter14.exercise4;

import java.util.Scanner;

public class TryPhoneBook {
	public static void main(String[] args) {
		// create and object of phone book.
		PhoneBook phoneBook = new PhoneBook(); // The phone book
		Scanner input = new Scanner(System.in);
		Person someone;
		
		// iterate user entry with infinite loop.
		for (;;) {
			System.out.println("Enter 1 to enter a new phone book entry\n" + "Enter 2 to find the number for a name\n"
					+ "Enter 9 to quit.");
			int choice = 0; // Stores input selection
			try {
				choice = input.nextInt();
			} catch (Exception e) {
				System.out.println(e.getMessage() + "\nTry again.");
				continue;
			}
		
			// switch case start pass the number to iterate.
			switch (choice) {
				case 1:
					// add the user entry.
					phoneBook.addEntry(BookEntry.readEntry());
					System.out.println("Your Entry Has Been Done.......");
					break;
				case 2:
					// get the user entry.
					someone = Person.readPerson();
					BookEntry entry = phoneBook.getEntry(someone);
					if (entry == null) {
						System.out.println("The number for " + someone + " was not found. ");
					} else {
						System.out.println("The number for " + someone + " is " + entry.getNumber());
					}
					break;
				case 9:
					System.out.println("Ending program.");
					return;
				default:
					System.out.println("Invalid selection, try again.");
					break;
			}
		}
	}
}
