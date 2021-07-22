package com.velociter.nitesh.chapter11;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Exercise6 {
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		// initialize all the fields with null.
		String lineOfString = null, firstName = null, secondName=null, address = null;
		int count = 0;
		String fileName = "D:/index.txt";
		BufferedWriter bufferWriter = null;
		BufferedReader bufferReader = null;
		try {
			// create the Object of FileWriter to write the data into file.
			FileWriter fileWriter = new FileWriter(fileName, true);
			// create the Object of BufferedWriter store writer file.
			bufferWriter = new BufferedWriter(fileWriter);
			// taking the input from user.
			Scanner input = new Scanner(System.in);
			// get the first name from user.
			System.out.println("Enter Your Name : ");
			firstName = input.next();
			// get the second name from user.
			System.out.println("Enter Your Second Name : ");
			secondName = input.next();
			// store first name and second name into file.
			fileWriter.write(" Your Name is : " + firstName + " " + secondName + "\n");
			// get the address from user.
			System.out.println("Enter Address : ");
			address = input.next();
			// store address into file.
			fileWriter.write(" Your Address is : " + address + "\n");
			System.out.println("Successfully Write to File.......\n");
			// close the writing operation.
			bufferWriter.close();
			// printing the resulting input from user.
			System.out.println("Resulting Name and Address from File : ");
			// create the Object of FileReader to read the data from file.
			FileReader fileReader = new FileReader(fileName);
			// create the Object of BufferedReader store reader file.
			bufferReader = new BufferedReader(fileReader);
			// check the condition if file get it end.
			while ((lineOfString = bufferReader.readLine()) != null) {
				count++;
				// print data from file line by line.
				System.out.println(count+". "+lineOfString);
			}
			System.out.println();
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
