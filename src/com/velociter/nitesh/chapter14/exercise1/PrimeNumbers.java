package com.velociter.nitesh.chapter14.exercise1;

import java.util.Scanner;
import java.util.Vector;

public class PrimeNumbers {
	public static void main(String[] args) {

		// creating and initialize a data member.
		int startNumber, endNumber, i, j, count = 0;

		// creating an object of vector to store prime number.
		Vector<Integer> v = new Vector<Integer>();

		// get the value from user start to end number.
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the Range of Number Between Start and End Of Prime.");
		System.out.print("\nEnter Starting Number : ");
		startNumber = scan.nextInt();
		System.out.print("Enter Ending Number : ");
		endNumber = scan.nextInt();

		// printing prime number between start and end.
		System.out.print("Prime Numbers Between " + startNumber + " and " + endNumber + " is :\n");
		long startTime = System.currentTimeMillis();
		System.out.println("Before Execution in Second : " + startTime);
		// check the condition between start to end.
		for (i = startNumber; i <= endNumber; i++) {
			count = 0;

			// fetch the condition of prime number.
			for (j = 2; j < i; j++) {

				// check if equal and divisible it.
				if (i % j == 0) {
					count++;
					break;
				}
			}
			// check the count if zero.
			if (count == 0) {
				// add prime to vector.
				v.add(i);
			}
		}
		System.out.print(v + " ");
		long entTime = System.currentTimeMillis();
		System.out.println("\nAfter Execution in Second : " + entTime);
		System.out.println("Difference Between Execution in Second : " + (entTime - startTime) / 1000F+"seconds");
	}
}