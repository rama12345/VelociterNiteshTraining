package com.velociter.nitesh.chapter15;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class EliminateLineNumbers {
	public static void main(String args[]) {
		String textOfString = "1. My dog hasn’t got any nose.\n" + "2. How does your dog smell then?\n"
				+ "3. My dog smells horrible.\n" + "4. How does your dog smell then?\n" + "5. My dog smells horrible.\n"
				+ "6. How does your dog smell then?\n" + "7. My dog smells horrible.\n" + "8. How does your dog smell then?\n"
				+ "9. My dog smells horrible.\n" + "10. How does your dog smell then?\n" + "11. My dog smells horrible.\n"
				+ "12. How does your dog smell then?\n" + "13. My dog smells horrible.\n" + "14. How does your dog smell then?\n"
				+ "15. My dog smells horrible.\n" + "16. How does your dog smell then?\n" + "17. My dog smells horrible.\n";
		String lineOfString = null;
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
				lineOfString = lineOfString.replaceAll("[0123456789.]","");
				// print data from file line by line.
				System.out.println(lineOfString);
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
