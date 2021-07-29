package com.velociter.nitesh.chapter8;

import java.util.Random;

public class Exercise3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double minValue = -50.0, maxValue = +50.0;
		// create the object of generating random number
		Random random = new Random();
		double randomValue = 0.0;
		for (int i = 1; i <= 20; i++) {
			// Checking for a valid range in between min-max without infinite ends.
			if (Double.valueOf(maxValue - minValue).isInfinite() == false)
				// generate random value of range min-max
				randomValue = minValue + (maxValue - minValue) * random.nextDouble();
			System.out.printf(i + ")" + "%.2f\n", randomValue);
		}
	}
}
