package com.velociter.nitesh.chapter13.exercise3;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TrySerializableStackList {

	public static void main(String[] args) {
		StackList<String> strings = new StackList<String>(10);
		// list of strings to be push to file.
		strings.push("hello");
		strings.push("world");
		strings.push("java");	
		strings.push("python");
		strings.push("C++");
		strings.push("Ruby");
		strings.push("DevOpps");
		strings.push("AngularJS");
		strings.push("ReactJS");
		strings.push("MongoDB");
		System.out.println("\nstring list contains:");
		strings.listAll(strings); // List contents of numbers
		// Now serialize the list to a file
		String filename = "D:/Strings.bin";
		try {
			// create an object of object output stream to write object into file.
			ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(filename));
			// write object into file.
			objectOutputStream.writeObject(strings);
			// close the write operation to file.
			objectOutputStream.close();
		} catch (IOException e) {
			e.printStackTrace();
			System.exit(1);
		}
		StackList<String> values = null; // Variable to store list from the file
		// Deserialize the list from the file
		try {
			// create an object of object input stream to read object from file.
			ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(filename));
			// read the value from file.
			values = (StackList<String>) (objectInputStream.readObject());
			// close the read operation to file.
			objectInputStream.close();
		} catch (IOException e) {
			e.printStackTrace();
			System.exit(1);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			System.exit(1);
		}
		System.out.println("\nvalues list contains:");
		// List contents of values
		strings.listAll(values); 
	}
}
