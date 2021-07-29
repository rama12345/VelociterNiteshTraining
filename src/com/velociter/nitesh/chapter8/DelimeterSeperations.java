package com.velociter.nitesh.chapter8;

import java.util.Scanner;
import java.util.StringTokenizer;

public class DelimeterSeperations {

	public static void main(String[] args) {
		String textOfString, words = "", arraOfString[] = new String[50];
		int i, lenghtOfString, numberOfWords = 0;
		char ch;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the Sentence : ");
		// take the input from user
		textOfString = input.nextLine();
		// empty string with last space
		textOfString = textOfString + " ";
		// get the length of string
		lenghtOfString = textOfString.length();
		// loop for string traverse with the end of length
		for (i = 0; i < lenghtOfString; i++) {
			// get the character of string
			ch = textOfString.charAt(i);
			// check the condition of string of word with space
			if (ch != ' ') {
				// add the character word by word
				words = words + ch;
			} else {
				// change the end space of word with /:,
				arraOfString[numberOfWords++] = words + ":";
				words = "";
			}
		}
		// store the string into array of string
		for (i = 0; i < numberOfWords; i++)
			System.out.print(arraOfString[i] + " ");
	}
}
