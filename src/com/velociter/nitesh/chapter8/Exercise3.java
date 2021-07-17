package com.velociter.nitesh.chapter8;

import java.util.Random;

public class Exercise3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double minValue = -50.0, maxValue = +50.0;
		Random theRandom = new Random();
		double theRandomValue = 0.0;
		for (int i = 1; i <= 20; i++) {
			// Checking for a valid range-
			if (Double.valueOf(maxValue - minValue).isInfinite() == false)
				theRandomValue = minValue + (maxValue - minValue) * theRandom.nextDouble();
			System.out.printf(i+")"+"%.2f\n", theRandomValue);
		}
	}
}
