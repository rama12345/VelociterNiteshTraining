package com.velociter.nitesh.chapter14.exercise1;

import java.util.Scanner;
import java.util.Vector;

public class PrimeNumbersSquareRoot {
//	public static void main(String[] args) {
//
//		// creating and initialize a data member.
//		int startNumber, endNumber, i, j, count = 0, number;
//
//		// creating an object of vector to store prime number.
//
//		// get the value from user start to end number.
//		Scanner scan = new Scanner(System.in);
//		float startTime = System.currentTimeMillis() / 1000;
//		System.out.println("Before Execution in Second : " + startTime);
//		System.out.print("Enter the Range of Number Between Start and End Of Prime.");
//		System.out.print("\nEnter Starting Number : ");
//		startNumber = scan.nextInt();
//		System.out.print("Enter Ending Number : ");
//		endNumber = scan.nextInt();
//
//		// printing prime number between start and end.
//		System.out.print("Prime Numbers Between " + startNumber + " and " + endNumber + " is :\n");
//		// check the condition between start to end.
//		// check the condition between start to end.
//		for (i = startNumber; i <= endNumber; i++) {
//			count = 0;
//			
//			// fetch the condition of prime number. 
//			for (j = 2; j < Math.sqrt(i); j++) {
//			
//				// check if equal and divisible it.
//				if (i % j == 0) {
//					count++;
//					break;
//				}
//			}
//			// check the count if zero.
//			if (count == 0) {
//				// add prime to vector.
//				System.out.print(i+" ");
//			}
//		}
//		float entTime = System.currentTimeMillis() / 1000;
//		System.out.println("\nAfter Execution in Second : " + entTime);
//		System.out.println("Difference Between Execution in Second : " + (entTime - startTime));
//	}
//}

	public static void main(String[] args) {

		int startNumber, endNumber,number,i;
		boolean isPrime = true;
		String primeNumbersFound = "";
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the Range of Number Between Start and End Of Prime.");
		System.out.print("\nEnter Starting Number : ");
		startNumber = input.nextInt();
		System.out.print("Enter Ending Number : ");
		endNumber = input.nextInt();
		// Empty String

		long startTime = System.currentTimeMillis();
		System.out.println("Before Execution in Second : " + startTime);
		// Start loop 2 to maxCheck
		for (i = startNumber; i <= endNumber; i++) {
			isPrime = CheckPrime(i);
			number = (int) Math.sqrt(i);
			if (isPrime) {
				primeNumbersFound = primeNumbersFound + i + " ";
			}
		}
		System.out.print("Prime Numbers Between " + startNumber + " and " + endNumber + " is :\n");
		// Print prime numbers from 1 to maxCheck
		System.out.println(primeNumbersFound);
		long entTime = System.currentTimeMillis();
		System.out.println("\nAfter Execution in Second : " + entTime);
		System.out.println("Difference Between Execution in Second : " + (entTime - startTime) / 1000F+"seconds");
	}

	public static boolean CheckPrime(int numberToCheck) {
		int remainder;
		for (int i = 2; i <= numberToCheck / 2; i++) {
			remainder = numberToCheck % i;
			// if remainder is 0 than numberToCheckber is not prime and break loop. Else
			// continue loop
			if (remainder == 0) {
				return false;
			}
		}
		return true;

	}
}
