package com.velociter.nitesh.chapter14.exercise4;

import java.io.Serializable;

class BookEntry implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Person person;
	private PhoneNumber number;

	// constructor with parameter
	public BookEntry(Person person, PhoneNumber number) {
		this.person = person;
		this.number = number;
	}

	// get the value of person
	public Person getPerson() {
		return person;
	}

	public PhoneNumber getNumber() {
		return number;
	}

	public String toString() {
		return person.toString() + '\n' + number.toString();
	}

	// Read an entry from the keyboard
	public static BookEntry readEntry() {
		return new BookEntry(Person.readPerson(), PhoneNumber.readNumber());
	}

}