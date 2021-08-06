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
		long startTime = System.currentTimeMillis();
		System.out.println("Before Execution Time in Second : " + startTime);
		if (file.isFile()) {
			System.out.println("your file already exists.");
//			bufferedWriter.write(textOfString);
			System.out.println("Successfully Write.....");
		} else {
			try {
				FileWriter fileWriter = new FileWriter(fileName);
				bufferedWriter = new BufferedWriter(fileWriter);
				bufferedWriter.write(textOfString);
				bufferedWriter.close();
				System.out.println("Successfully Write.....");
			} catch (IOException e) {
				System.out.println("Error writing to file'" + fileName + "'");
			} finally {
				try {
					if (bufferedWriter != null) {
						bufferedWriter.close();
					}
				} catch (IOException e) {
				}
			}
		}
		long endTime = System.currentTimeMillis();
		System.out.println("\nAfter Execution Time in Second : " + endTime);
		System.out.println("Difference in Execution Time is : " + (endTime - startTime) / 1000F + "s");
	}
}
