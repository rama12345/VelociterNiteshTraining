package com.velociter.nitesh.chapter10;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

public class MatchDuplicateWordFile {
	public static void main(String args[]) throws IOException {
		String string, word = "", storeString = ""; // "the fact cat "
		String arrayOfString[] = new String[15];
		char character;
		int lengthOfString, i, numberOfWords = 0; // i variable for iteration
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the Sentence : ");

		if (input.hasNext("[A-Za-z]*")) {
			string = input.nextLine();
			// add the empty word string of last word.
			string = string + " ";
			lengthOfString = string.length();
			for (i = 0; i < lengthOfString; i++) {
				// finding a one by one character from string using charAt()
				character = string.charAt(i);
				if (character != ' ') {
					// adding a character in word
					word = word + character;
				} else {
					// add the word into array of string and count it.
					arrayOfString[numberOfWords] = word;
					numberOfWords++;
					// set as empty word
					word = "";
				}
			}

			String filePath = "D:/Arrayindex.txt";
			FileWriter fileWriter = new FileWriter(filePath);

			int length = numberOfWords - 1;
			System.out.println("Resulting Possible Permutation of Word : ");
			for (int j = 0; j < factorial(numberOfWords) / 2; j++) { // iteration for permuting word of there fraction
				for (int e = 0; e <= length - 1; e++) { // e variable for the iteration
					// fetching and iterating the word of possible permutation
					if (e <= e + 1) {
						storeString = arrayOfString[e];
						arrayOfString[e] = arrayOfString[e + 1];
						arrayOfString[e + 1] = storeString;
					}
					for (i = 0; i <= length; i++) {
						// written the content into the file
						System.out.print(arrayOfString[i] + " ");
						fileWriter.write(arrayOfString[i] + " ");
					}
					System.out.println();
					fileWriter.write(" \n");
				}
			}
			fileWriter.close();
			System.out.println("Successfully Write..........");
		} else {
			System.out.println("Please Enter a Valid Sentence.");
		}
	}

	// method for find factorial of number.
	public static int factorial(int number) {
		int i = 1, factorial = 1;
		while (i <= number) {
			factorial *= i;
			i++;
		}
		return factorial;
	}
}