package com.velociter.nitesh.chapter2;

import java.util.Scanner;

public class CalculateIncomeTax {

	public static void main(String[] args) {
		double income;
		System.out.println("Enter a double value : ");
		Scanner input = new Scanner(System.in);
		if (input.hasNextDouble()) {
			income = input.nextDouble();
			double taxRate = 0.35; // 35% corresponds to 0.35
			double taxAmount = income * taxRate;
			int taxDollars = (int) taxAmount;

			// find the random number of taxCents
			int taxCents = (int) Math.round((taxAmount - taxDollars));

			// Overall gross income in dollar
			System.out.println("Gross income is $" + (int) income + "." + (int) Math.round((income - (int) income)));

			// final resulting tax pay in dollar and taxCents in cents
			System.out.println("Tax to pay is " + taxDollars + " dollars and " + taxCents + " cents.");
		} else {
			System.out.println("Please Enter a Valid Value");
		}
	}
}
