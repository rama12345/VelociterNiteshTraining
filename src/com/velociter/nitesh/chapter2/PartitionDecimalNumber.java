package com.velociter.nitesh.chapter2;

import java.util.Scanner;

public class PartitionDecimalNumber {
	public static void main(String[] args) {
		// double doubleNumber = 1234.5678;
		double doubleNumber;
		System.out.println("Enter a double value : ");
		Scanner input = new Scanner(System.in);
		if (input.hasNextDouble()) {
			doubleNumber = input.nextDouble();
			// convert decimal to short
			short shortNumber = (short) doubleNumber;
			System.out.println("Number is  : " + doubleNumber);
			System.out.println("Intregral Part : " + shortNumber);

			// store decimal fraction to long
			long longNumber = (long) (doubleNumber % 1.0 * 100000);
			System.out.println("Decimal Part : " + longNumber);
		} else {
			System.out.println("Please Enter a Valid Value");
		}
	}
}
