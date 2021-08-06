package com.velociter.nitesh.chapter14.exercise1;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class ReadWritePrime {

	public static void main(String[] args) throws IOException {

//		String fileName = "D:/File1.pdf";
		String fileName;
		int start, end, i, j, count = 0;
		BufferedWriter bufferedWriter = null;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Your FileName To Write Your PrimeNumber You Want : ");
		fileName = input.nextLine();
		System.out.print("How Many Range Do You Want.\n");
		System.out.print("Enter Starting Number : ");
		start = input.nextInt();
		System.out.print("Enter Ending Number : ");
		end = input.nextInt();
		System.out.print("Prime Numbers Between " + start + " and " + end + " is :\n");
		long startTime = System.currentTimeMillis();
		System.out.println("Before Execution Time in Second : " + startTime);
		File file = new File(fileName);
		try {
//			FileWriter fileWriter = new FileWriter(fileName,true);
//			bufferedWriter = new BufferedWriter(fileWriter);
			FileOutputStream fos = new FileOutputStream(file);
            OutputStreamWriter osw = new OutputStreamWriter(fos, StandardCharsets.UTF_8);
            bufferedWriter = new BufferedWriter(osw);

			for (i = start; i <= end; i++) {
				count = 0;
				for (j = 2; j < i; j++) {
					if (i % j == 0) {
						count++;
						break;
					}
				}
				if (count == 0) {
					System.out.print(i + " ");
					bufferedWriter.write(i + " ");
//					bufferedWriter.write("\n");
				}
			}
			bufferedWriter.close();
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
		long endTime = System.currentTimeMillis();
		System.out.println("\nAfter Execution Time in Second : " + endTime);
		System.out.println("Difference in Execution Time is : " + (endTime - startTime) / 1000F + "s");
	}
}