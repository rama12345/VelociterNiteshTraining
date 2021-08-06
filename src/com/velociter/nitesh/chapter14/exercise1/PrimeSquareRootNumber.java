package com.velociter.nitesh.chapter14.exercise1;

import java.util.Scanner;

public class PrimeSquareRootNumber {

	public static void main(String[] args) {
		int number; 
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Value of Numbers :");
		number = scanner.nextInt();
		long startTime = System.currentTimeMillis();
		System.out.println("Before Execution Time is : " + startTime);
		if (number >= 1) {
			System.out.println("Prime Numbers Are : ");
		}
		
		// iteration of loop with N
		for (int j = 2; j <= number; j++) {
			int flag = 0;
			// check if its not prime
			for (int i = 2; i <= j; i++) {
				// check the condition of complete divisible 
				if (j % i == 0) {
					flag = flag + 1;
				}
			}
			if (flag == 0) {
				System.out.println(j + " ");
			}

		}
		long endTime = System.currentTimeMillis();
		System.out.println("\nAfter Execution Time is :" + endTime);
		System.out.println("Difference in Execution Time is : " + (endTime - startTime) / 1000F + "s");

	}
}
