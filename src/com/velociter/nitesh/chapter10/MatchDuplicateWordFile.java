package com.velociter.nitesh.chapter10;

import java.io.FileWriter;
import java.io.IOException;

public class MatchDuplicateWordFile {
	public static void main(String args[]) throws IOException {
		String textOfString = "the fact cat ", word = "";
		String arrayOfString[] = new String[14];
		char character = ' ';

		// initialize number of count to 0.
		int i, numberOfWords = 0;

		// fetch the character with the length of string.
		for (i = 0; i < textOfString.length(); i++) {

			// finding a one by one character from string using charAt()
			character = textOfString.charAt(i);

			// check the space or not
			if (character != ' ') {

				// adding a character in word
				word = word + character;
			} else {

				// store number of words into the array of string.
				arrayOfString[numberOfWords++] = word;
				word = "";
			}
		}
		int length = 2;

		// fetch the end of length it.
		for (int e = 0; e <= length - 1; e++) {

			// check the condition if number less it and apply sorting it.
			if (e <= e + 1) {
				String storeString = arrayOfString[e];
				arrayOfString[e] = arrayOfString[e + 1];
				arrayOfString[e + 1] = storeString;
			}
		}
		// create an object of fileWriter to write data into file.
		FileWriter fileWriter = new FileWriter("D:/Arrayindex.txt");
		for (i = 0; i <= length; i++) {
			// written the content into the file
			fileWriter.write(arrayOfString[i] + " ");
		}
		fileWriter.close();
		System.out.println("write successfully");

	}

}
