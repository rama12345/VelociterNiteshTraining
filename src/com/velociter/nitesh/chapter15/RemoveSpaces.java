package com.velociter.nitesh.chapter15;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RemoveSpaces {
	public static void main(String args[]) {
//		String textOfString = "My dog hasn’t got any nose.\n" + "How does your dog smell then?\n"
//								+ "My dog smells horrible.\n";
		
		String textOfString,lineOfString = null, regEx = " ";
		String fileName = "D:/regulerEx.txt";
		BufferedWriter bufferWriter = null;
		BufferedReader bufferReader = null;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the Sentence : ");
		textOfString = input.nextLine();
		try {
			// create the Object of FileWriter to write the data into file.
			FileWriter fileWriter = new FileWriter(fileName);

			// create the Object of BufferedWriter store writer file.
			bufferWriter = new BufferedWriter(fileWriter);
			fileWriter.write(textOfString);
			System.out.println("Successfully Write to File.......\n");

			// close the writing operation.
			bufferWriter.close();
			System.out.println("----------------Resulting String from File-----------");

			// create the Object of FileReader to read the data from file.
			FileReader fileReader = new FileReader(fileName);

			// create the Object of BufferedReader store reader file.
			bufferReader = new BufferedReader(fileReader);

			// check the condition if file get it end.
			while ((lineOfString = bufferReader.readLine()) != null) {
				// print data from file line by line.
				System.out.println(lineOfString);
			}

			System.out.println("\n\n----------------After Removing Spaces Resulting String are -----------");

			// find the space of string matches and remove it.
			Pattern patternOfSpace = Pattern.compile(regEx);

			// store matches string of space in matcher.
			Matcher matcherSpace = patternOfSpace.matcher(textOfString);

			// create an object of string to store string of Object.
			StringBuffer stringBuffer = new StringBuffer();

			// find out the matches.
			while (matcherSpace.find()) {
				// change space to blank it.
				matcherSpace.appendReplacement(stringBuffer, "");
			}
			matcherSpace.appendTail(stringBuffer);
			System.out.println(stringBuffer.toString());

			// close the reading operation.
			bufferReader.close();
		} catch (IOException e) {
			System.out.println("Error writing to file'" + fileName + "'");
			// finally block start
		} finally {
			// try catch block
			try {
				// check the condition of reader and writer buffer is close or not.
				if (bufferWriter != null && bufferReader != null) {
					bufferWriter.close();
					bufferReader.close();
				}
			} catch (IOException e) {
			}
		}

	}
}
