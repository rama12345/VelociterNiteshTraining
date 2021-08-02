package com.velociter.nitesh.chapter10;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileSeperations {
	public static void main(String args[]) throws IOException {
		// Accept a string
		// String textOfstring = "Hand/ling /n Java /" + " FileWriter / FileReader";
		String textOfString;

		// take input from user.
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a Sentence with Delimitter : ");

		// check the validation of input.
		if (input.hasNext("[A-Za-z/]*")) {
			textOfString = input.nextLine();

			// Split method matches the given delimiter and split the string based on it.
			String[] output = textOfString.split("/");

			String filePath = "D:/myFile.txt";
			try {
				FileWriter fileWriter = new FileWriter(filePath);

				// apply for each loop for iteration.
				for (String splitString : output) {
					System.out.println(splitString);

					// write word of string to file.
					fileWriter.write(splitString + "\n");
				}
				System.out.println("Writing successful....");
				fileWriter.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		} else {
			System.out.println("Please Enter Valid Sentence.");
		}
	}
}
