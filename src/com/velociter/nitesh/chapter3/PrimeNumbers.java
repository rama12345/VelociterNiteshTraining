package com.velociter.nitesh.chapter3;

public class PrimeNumbers {

	public static void main(String[] args) {
		// generate 100 multiple of random value
		int number = (int) (100 * Math.random() + 1);
		System.out.println("random number is : " + number);
		// check the condition of prime number
		if (number % 2 != 0) {
			number = (int) Math.sqrt(number);
			System.out.println("prime number Of square root is : " + number);
		} else {
			System.out.println("its Not not prime No.square root : " + number);
		}
	}
}
