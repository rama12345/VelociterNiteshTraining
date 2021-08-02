package com.velociter.nitesh.chapter8;

import java.util.Random;
import java.util.Scanner;

public class FormateRandomNumber {

	public static void main(String[] args) {
		// double minValue = -50.0, maxValue = +50.0;
		double minValue, maxValue;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter MinValue and MaxValue of Number :  ");
		// add validation for only enter number.
		if (input.hasNextDouble()) {
			minValue = input.nextDouble();
			maxValue = input.nextDouble();
			// create the object of generating random number
			Random random = new Random();
			double randomValue = 0.0;
			for (int i = 1; i <= 20; i++) {

				// Checking for a valid range in between min-max without infinite ends.
				if (Double.valueOf(maxValue - minValue).isInfinite() == false)

					// generate random value of range min-max
					randomValue = minValue + (maxValue - minValue) * random.nextDouble();
				System.out.print(i + ") " +String.format("%.2f\n", randomValue));
			}
		} else {
			System.out.println("Please Enter a Valid Number.");
		}
	}
}
