package com.velociter.nitesh.chapter3;

import java.util.Scanner;

public class PrimeNumbers {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		float startTime = System.currentTimeMillis() / 1000;
		System.out.println("Before Execution in Second : " + startTime);
		System.out.println("Enter a Number :  ");
		// add validation for only enter number.
		
		if (sc.hasNext("[0-9]*")) {
			int number = sc.nextInt();
			// generate 100 multiple of random value
			number = (int) (100 * Math.random() + 1);
			System.out.println("random number is : " + number);

			// check the condition of prime number
			if (number % 2 != 0) {

				// find out the square root of number
				number = (int) Math.sqrt(number);
				System.out.println("prime number Of square root is : " + number);
			} else {
				System.out.println("its Not not prime No.square root : " + number);
			}
		} else {
			System.out.println("Please Enter Invalid Number.");
		}
		
		float entTime = System.currentTimeMillis() / 1000;
		System.out.println("\nAfter Execution in Second : " + entTime);
		System.out.println("Difference Between Execution Second : " + (entTime - startTime));
	}
}
