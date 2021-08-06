package com.velociter.nitesh.chapter14.exercise1;

import java.util.Scanner;

class SquareRootPrime {

	// Function to print all the
	// prime numbers till N
	static void prime_Number(int startNumber, int endNumber) {
		// Declaring the variables
		int x, y, flag;

		// Printing display message
		System.out.println("All the Prime numbers within "+startNumber+" and " + endNumber + " are:");

		// Using for loop for traversing all
		// the numbers from 1 to N
//		endNumber = (int)Math.sqrt(endNumber);
		for (x = startNumber; x <= endNumber; x++) {			
			// Using flag variable to check
			// if x is prime or not
			flag = 1;

			for (y = 2; y * y <= x; y++) {
				if (x % y == 0) {
					flag = 0;
					break;
				}
			}

			// If flag is 1 then x is prime but
			// if flag is 0 then x is not prime
			if (flag == 1)
				System.out.print(x + " ");
		}
	}

	// The Driver code
	public static void main(String[] args) {
		int startNumber,endNumber,sq;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter Start Number : ");
		startNumber = input.nextInt();
		
		System.out.println("Enter End Number to Reach the Prime : ");
		endNumber = input.nextInt();
		long startTime = System.currentTimeMillis();
		System.out.println("Before Execution in Second : " + startTime);
//		sq =(int) Math.sqrt(N);
		prime_Number(startNumber, endNumber);
		long entTime = System.currentTimeMillis();
		System.out.println("\nAfter Execution in Second : " + entTime);
		System.out.println("Difference Between Execution Second : " + (entTime - startTime) / 1000F+"seconds");
	}
}