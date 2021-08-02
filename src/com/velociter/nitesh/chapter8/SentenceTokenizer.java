package com.velociter.nitesh.chapter8;

import java.util.Scanner;
import java.util.StringTokenizer;

public class SentenceTokenizer {

	public static void main(String[] args) {
		String textOfString;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the Sentence : ");
		if (input.hasNext("[A-Za-z]*")) {
			// take the input from user
			textOfString = input.nextLine();

			// separation of string from , using string tokenizer
			StringTokenizer stringTokens = new StringTokenizer(textOfString, " ");
			while (stringTokens.hasMoreTokens()) {
				System.out.println(stringTokens.nextToken());
			}
		} else {
			System.out.println("Please Enter a Valid Sentence.");
		}
	}

}
