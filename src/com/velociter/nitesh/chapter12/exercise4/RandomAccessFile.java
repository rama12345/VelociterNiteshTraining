package com.velociter.nitesh.chapter12.exercise4;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

class Person implements java.io.Serializable {
	public int index;
	public String name;
	public String address;

	// Default constructor
	public Person(int index, String name, String address) {
		this.index = index;
		this.name = name;
		this.address = address;
	}

}

class RandomAccessFile

{
	public static void main(String[] args) {
		String filename = "index.txt";
		Scanner scanner = new Scanner(System.in); // taking a input from user
		System.out.println("Enter the input size :");
		int inputSize = scanner.nextInt();

		int index[] = new int[inputSize];
		String name[] = new String[inputSize];
		String address[] = new String[inputSize];

		try {
			FileOutputStream file = new FileOutputStream(filename); // created a file
			ObjectOutputStream outputStreamObj = new ObjectOutputStream(file);

			for (int i = 0; i < inputSize; i++) {

				System.out.println("Enter the index");
				index[i] = scanner.nextInt();

				scanner.nextLine();

				System.out.println("Enter the Name:");
				name[i] = scanner.nextLine();

				System.out.println("Enter the Address:");
				address[i] = scanner.nextLine();

				// creating an object of person class and passing the arguments in constructor
				Person personObject = new Person(index[i], name[i], address[i]);
				// Method for serialization of object
				outputStreamObj.writeObject(personObject);
				personObject = null;

			}
			file.close();
			outputStreamObj.close();
			System.out.println("Written SuccessFully");
		} catch (IOException ex) {
			System.out.println("IOException is caught");

		}
		// doing deserializing
		Person personObject1 = null;
		try {
			FileInputStream file = new FileInputStream(filename);
			ObjectInputStream inputStreamObj = new ObjectInputStream(file);
			for (int i = 0; i < inputSize; i++) {
				// Method for deserialization of object
				personObject1 = (Person) inputStreamObj.readObject();

				System.out.println("Object has been deserialized ");
				System.out.println("Index = " + personObject1.index);
				System.out.println("Name = " + personObject1.name);
				System.out.println("Address = " + personObject1.address);
			}
			inputStreamObj.close();
			file.close(); // closing the file
		} catch (IOException ex) {
			System.out.println("IOException is caught");
		} catch (ClassNotFoundException ex) {
			System.out.println("ClassNotFoundException is caught");
		}

		System.out.println("Enter the index for search ");
		int indexSearch = scanner.nextInt();
		for (int i = 0; i < inputSize; i++) // doing checked the index is exist or not
		{
			if (indexSearch == index[i]) {
				System.out.println("Index Found..");
				System.out.println("index :" + index[i]);
				System.out.println("Name  :" + name[i]);
				System.out.println("Adress :" + address[i]);
				break;
			} else {
				System.out.println("you Enter a wrong index");
			}
		}

	}
}
