package com.velociter.nitesh.chapter2;

public class Exercise2 {
	public static void main(String[] args) {
		double doubleNumber = 1234.5678;
		short shortNumber = (short) doubleNumber;
		System.out.println(shortNumber);
		long longNumber = (long) (doubleNumber % 1.0 * 10000);
		System.out.println(longNumber);
	}
}
