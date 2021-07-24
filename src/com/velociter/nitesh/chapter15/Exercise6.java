package com.velociter.nitesh.chapter15;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Exercise6 {
	public static void main(String args[]) {
		String textOfString = "My dog hasn’t got any nose.\n" + "How does your dog smell then?\n"
				+ "My dog smells horrible.\n" + "How does your dog smell then?\n" + "My dog smells horrible.\n"
				+ "How does your dog smell then?\n" + "My dog smells horrible.\n" + "How does your dog smell then?\n"
				+ "My dog smells horrible.\n" + "How does your dog smell then?\n" + "My dog smells horrible.\n"
				+ "How does your dog smell then?\n" + "My dog smells horrible.\n" + "How does your dog smell then?\n"
				+ "My dog smells horrible.\n" + "How does your dog smell then?\n" + "My dog smells horrible.\n";
		String lineOfString = null;
		int count = 000;
		String fileName = "D:/regulerEx1.txt";
		BufferedWriter bufferWriter = null;
		BufferedReader bufferReader = null;
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
				count++;
				// print data from file line by line.
				System.out.println("00" + count + " " + lineOfString);
			}
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
