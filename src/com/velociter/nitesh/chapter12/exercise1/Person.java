package com.velociter.nitesh.chapter12.exercise1;

import java.io.Serializable;
import java.util.Scanner;

public class Person implements Serializable {// implements serializable to write an object to file.
	private String name;
	private String address;
	
	// create function to get the name and address from user.
	public void setDetails() {
		Scanner input = new Scanner(System.in);
		// get the name from user.
		System.out.println("Enter the name : ");
		name = input.nextLine();
		// get the address from user.
		System.out.println("Enter the address : ");
		address = input.nextLine();
	}
	
	// display the name and address from user.
	public String showDetails() {
		return "Person Name is : " + name + "\n"
				+ "Person Address is : " + address;
	}
}
