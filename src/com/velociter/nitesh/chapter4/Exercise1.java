package com.velociter.nitesh.chapter4;


public class Exercise1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// store 12 months in array of string
		String[] months = { "January", "Febuary", "March", "April", "May", "June", "July", "August", "september",
				"October", "November", "December" };
		int i;
		double sumOfNumber = 0;
		double numbers[] = new double[12];
		System.out.println("Random number");
		for (i = 0; i < 12; i++) {
			// generate random value from 100 of multiple
			numbers[i] = ((100.00 * Math.random()) + 1);
		}
		for (i = 0; i < 12; i++) {
			System.out.print(+numbers[i] + ".");
			System.out.println(months[i]);
			sumOfNumber = sumOfNumber + numbers[i];
		}
		System.out.println("Sum of 12 number : " + sumOfNumber);
		// find out and print the average number from months
		System.out.println("Average : " + (sumOfNumber / 12));
	}
}
