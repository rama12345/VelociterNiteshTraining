package com.velociter.nitesh.chapter14.exercise4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Serializable;

class PhoneNumber implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String areacode;
	private String number;

	// constructor with parameter
	public PhoneNumber(String areacode, String number) {
		this.areacode = areacode;
		this.number = number;
	}

	public String toString() {
		return areacode + " " + number;
	}

	// Read a phone number from the keyboard
	public static PhoneNumber readNumber() {
		String area = null; // Stores the area code
		String localcode = null; // Stores the local code
		try {
			// get the area code and local code, number name from user.
			System.out.print("Enter area code: ");
			area = keyboard.readLine().trim();
			System.out.print("Enter local code: ");
			localcode = keyboard.readLine().trim();
			System.out.print("Enter the number: ");
			localcode += " " + keyboard.readLine().trim();
		} catch (IOException e) {
			System.err.println("Error reading a phone number.");
			e.printStackTrace();
			System.exit(1);
		}
		return new PhoneNumber(area, localcode);
	}

	// store user input to buffer.
	private static BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));
}