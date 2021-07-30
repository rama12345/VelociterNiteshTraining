package com.velociter.nitesh.chapter14.exercise4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Serializable;

public class Person implements Comparable<Person>, Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String firstName; // First name of person
	private String surname; // Second name of person

	// constructor with parameter
	public Person(String firstName, String surname) {
		this.firstName = firstName;
		this.surname = surname;
	}

	// Read a person from the keyboard
	public static Person readPerson() {
		String firstName = null;
		String surname = null;
		try {
			// get the first and second name from user.
			System.out.print("Enter first name: ");
			firstName = keyboard.readLine().trim();
			System.out.print("Enter surname: ");
			surname = keyboard.readLine().trim();
		} catch (IOException e) {
			System.err.println("Error reading a name.");
			e.printStackTrace();
			System.exit(1);
		}
		return new Person(firstName, surname);
	}

	// Compare Person objects
	public int compareTo(Person person) {
		int result = surname.compareTo(person.surname);
		return result == 0 ? firstName.compareTo(((Person) person).firstName) : result;
	}

	public String toString() {
		return firstName + " " + surname;
	}

	// store user input to buffer.
	private static BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));
}
