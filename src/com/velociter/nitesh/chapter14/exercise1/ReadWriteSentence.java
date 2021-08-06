package com.velociter.nitesh.chapter14.exercise1;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ReadWriteSentence {
	public static void main(String[] args) throws IOException {

//		String fileName = "D:/File1.pdf";
		String fileName, textOfString;
		BufferedWriter bufferedWriter = null;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Your FileName To Write Your Sentence : ");
		fileName = input.nextLine();
		File file = new File(fileName);
		System.out.println("How Many Sentence Do You Want to Write.");
		System.out.print("Enter Your Sentence : ");
		textOfString = input.nextLine();
		
		// before completion time in millisecond.
		long startTime = System.currentTimeMillis();
		System.out.println("Before Execution Time in Second : " + startTime);
		
		// check if file exist or not.
		if (file.isFile()) {
			System.out.println("your file already exists.");
			System.out.println("Successfully Write.....");
		} else {
			try {
				// create an object of file writer to write into file.
				FileWriter fileWriter = new FileWriter(fileName,true);
				// store file write to buffer.
				bufferedWriter = new BufferedWriter(fileWriter);
				// write data into file.
				bufferedWriter.write(textOfString);
				bufferedWriter.close();
				System.out.println("Successfully Write.....");
			} catch (IOException e) {
				System.out.println("Error writing to file'" + fileName + "'");
			} finally {
				try {
					if (bufferedWriter != null) {
						// close the write operation.
						bufferedWriter.close();
					}
				} catch (IOException e) {
				}
			}
		}
		
		// after completion time in millisecond.
		long endTime = System.currentTimeMillis();
		System.out.println("\nAfter Execution Time in Second : " + endTime);
		
		// difference completion time in millisecond.
		System.out.println("Difference in Execution Time is : " + (endTime - startTime) / 1000F + "s");
	}
}
