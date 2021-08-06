package com.velociter.nitesh.chapter14.exercise4;

public class Person {
	
	// data member of person.
	static int id = TryPhoneBook.people.size();
	private String name;
	private String surname;
	private String phoneNumber;
	private String email;
	private String address;

	// constructor with arguments.
	Person(String name, String surname, String phoneNumber, String email, String address) {
		this.name = name;
		this.surname = surname;
		this.phoneNumber = phoneNumber;
		this.email = email;
		this.address = address;
		id++;
	}

	// create getters. 
	String getName() {
		return name;
	}

	String getSurname() {
		return surname;
	}

	String getPhoneNumber() {
		return phoneNumber;
	}

	String getEmail() {
		return email;
	}

	String getAddress() {
		return address;
	}

	@Override
	public String toString() {
		return "\n\nName: " + getName() + "\nSurname: " + getSurname() + "\nPhone number: " + getPhoneNumber()
				+ "\nEmail: " + getEmail() + "\nAddress: " + getAddress();
	}
}
