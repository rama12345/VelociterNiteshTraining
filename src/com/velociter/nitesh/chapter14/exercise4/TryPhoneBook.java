package com.velociter.nitesh.chapter14.exercise4;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TryPhoneBook {
	static String filePath = "D:/Addresses.txt";
	private static Scanner in = new Scanner(System.in);
	
	// create an object of file to store all details of person to file.
	private static File file = new File(filePath);
	
	// create list of person to extract list of person details.
	static List<Person> people = new ArrayList<>();

	public static void main(String[] args) throws IOException {
		readPeopleFromFile();
		showMainMenu();
	}

	// method-1 for find person details with your choice.
	private static void findPerson() throws IOException {
		System.out.println("1. Find with name");
		System.out.println("2. Find with surname");

		String choice;
		do {
			choice = in.nextLine();
			switch (choice) {
			case "1":
				findByName();
				break;
			case "2":
				findBySurname();
				break;
			default:
				System.out.print("Choose 1 or 2: ");
			}
		} while (!choice.equals("1") && !choice.equals("2"));
		System.out.println();
		showMainMenu();
	}

	// method-2 for find person details with surname.
	private static void findBySurname() {
		System.out.print("Enter surname: ");
		String surnameToFind = in.nextLine();
		int matches = 0;
		for (Person person : people) {
			if (person.getSurname().equals(surnameToFind)) {
				System.out.println(person);
				matches++;
			}
		}
		if (matches <= 0) {
			System.out.println("There is no person with this surname");
		}
	}

	// method-3 for find person details with name.
	private static void findByName() {
		System.out.print("Enter name: ");
		String nameToFind = in.nextLine();
		int matches = 0;
		for (Person person : people) {
			if (person.getName().equals(nameToFind)) {
				System.out.println(person);
				matches++;
			}
		}
		if (matches <= 0) {
			System.out.println("There is no person with this name ");
		}
	}

	// method-4 for add person details.
	private static void addPerson() throws IOException {

		System.out.println("Enter Name: ");
		String name = in.nextLine();
		System.out.println("Enter Surname: ");
		String surname = in.nextLine();
		System.out.println("Enter Phone Number: ");
		String phoneNumber = in.nextLine();
		System.out.println("Enter Email: ");
		String email = in.nextLine();
		System.out.println("Enter Address: ");
		String address = in.nextLine();

		Person person = new Person(name, surname, phoneNumber, email, address);
		addToFile(person);
		people.add(person);
		System.out.println("Added person number: " + person);
		System.out.println();
		showMainMenu();
	}

	// method-4 for add person details to file.
	private static void addToFile(Person person) {
		try (BufferedWriter writer = new BufferedWriter(new FileWriter(file, true))) {
			writer.write(person.getName() + "\r\n" + person.getSurname() + "\r\n" + person.getPhoneNumber() + "\r\n"
					+ person.getEmail() + "\r\n" + person.getAddress() + "\r\n\r\n");
		} catch (IOException e) {
			System.out.println(e);
		}
	}

	// method-5 for read person details from file.
	private static boolean readPeopleFromFile() throws IOException {
		try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
			String name = null;
			while ((name = reader.readLine()) != null) {
				Person person = new Person(name, reader.readLine(), reader.readLine(), reader.readLine(),
						reader.readLine());
				people.add(person); // adds person to the list
				reader.readLine();
			}
			return true;
		} catch (IOException e) {
			System.out.println(e);
		}
		return false;
	}

	// method-4 for main menu for user interface to there choice.
	private static void showMainMenu() throws IOException {
		System.out.println("----------PHONE BOOK DIRECTORY----------");
		System.out.println("1. Add person");
		System.out.println("2. Find person");
		System.out.println("3. Show all contacts");
		System.out.println("4. Close program");

		String choice;
		do {
			choice = in.nextLine();
			switch (choice) {
			case "1":
				addPerson();
				break;
			case "2":
				findPerson();
				break;
			case "3":
				System.out.println(people);
				System.out.println();
				showMainMenu();
				break;
			case "4":
				System.out.println("Thank Your For Using!!!!");
				System.exit(0);
				break;
			default:
				System.out.println("Enter number from 1 to 4");
			}
		} while (!choice.equals("4"));
	}
}