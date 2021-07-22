package com.velociter.nitesh.chapter12.exercise1;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class PersonObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// default object of person class 
		Person object1 = new Person();
		Person object2 = new Person();
		Person object3 = new Person();
		ObjectOutputStream objectOutputStream = null;
		try {
			// Create the object output stream
			objectOutputStream = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream("D:/PersonObjects.bin")));
			// set the value to an object from user.
			object1.setDetails();
			object2.setDetails();
			object3.setDetails();
			// Write three objects to the file
			objectOutputStream.writeObject(object1); // Write object
			objectOutputStream.writeObject(object2); // Write object
			objectOutputStream.writeObject(object3); // Write object
			System.out.println("\n\nobject1:\n" + object1 + "\n\nobject2:\n" + object3 + "\n\nobject1:\n" + object3);
		} catch (IOException e) {
			e.printStackTrace(System.err);
			System.exit(1);
		}
		// Close the stream
		try {
			// Close the output stream
			objectOutputStream.close(); 
		} catch (IOException e) {
			e.printStackTrace(System.err);
			System.exit(1);
		}
	}

}
