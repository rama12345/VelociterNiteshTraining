package com.velociter.nitesh.chapter4;

import java.util.Scanner;

public class Matrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int limit = 100;
		Scanner input = new Scanner(System.in);
		System.out.print("\nDisplay Multiplication Table selected:");
		System.out.print("\nPlease enter the size of the table: ");
		limit = input.nextInt();
//		int magnitude = Integer.toString(limit).length();
//		String formatStringPad = String.format("%%%ds", magnitude);
//		String formatIntegerPad = String.format("%%%dd", magnitude);
		input.close();

		// Decision Statement
		if (limit >= 1 && limit <= 100) {

			// Display Corner of table
//			System.out.printf(formatStringPad + " " + " |", " ");

			// Display table row
			for (int i = 1; i <= limit; i++) {
				System.out.printf("%5d", i);
			}
			// Display table divider
			System.out.println(); // add space
			for (int i = 1; i <= limit; i++) // i is number of rows
			{
				System.out.print("-------");
			}

			// Display Multiplication table
			System.out.println();
			for (int i = 1; i <= limit; i++) {
//					System.out.printf(" " + formatIntegerPad + " |", i);
				// Display jth column of table
				for (int j = 1; j <= limit; j++) // j is number of columns
				{
					System.out.printf("%5d", (i * j));
				}
				System.out.println("");
			} // End outer loop
		} else {
			System.out.println("Must enter a number between 0 and 12.");
		}
	}
}