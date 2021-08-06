package com.velociter.nitesh.chapter4;

import java.util.Scanner;

public class Matrix {

	public static void main(String[] args) {
//		int limit = 100;
//		Scanner input = new Scanner(System.in);
//		System.out.print("\nDisplay Multiplication Table selected:");
//		System.out.print("\nPlease enter the size of the table: ");
//		limit = input.nextInt();
////		int magnitude = Integer.toString(limit).length();
////		String formatStringPad = String.format("%%%ds", magnitude);
////		String formatIntegerPad = String.format("%%%dd", magnitude);
//		input.close();
//
//		// Decision Statement
//		if (limit >= 1 && limit <= 100) {
//
//			// Display Corner of table
////			System.out.printf(formatStringPad + " " + " |", " ");
//
//			// Display table row
//			for (int i = 1; i <= limit; i++) {
//				System.out.printf("%5d", i);
//			}
//			// Display table divider
//			System.out.println(); // add space
//			for (int i = 1; i <= limit; i++) // i is number of rows
//			{
//				System.out.print("-------");
//			}
//
//			// Display Multiplication table
//			System.out.println();
//			for (int i = 1; i <= limit; i++) {
////					System.out.printf(" " + formatIntegerPad + " |", i);
//				// Display jth column of table
//				for (int j = 1; j <= limit; j++) // j is number of columns
//				{
//					System.out.printf("%5d", (i * j));
//				}
//				System.out.println("");
//			} // End outer loop
//		} else {
//			System.out.println("Must enter a number between 0 and 12.");
//		}

		int sizeOfTable;
		Scanner input = new Scanner(System.in);
		System.out.print("\nDisplay Multiplication Table selected:");
		System.out.print("\nPlease enter the size of the table: ");
		sizeOfTable = input.nextInt();

		// sizeOfTable matrix to integer.
		int formatStringLength = Integer.toString(sizeOfTable * sizeOfTable).length();
		
		// formatting of table length.
		int axesFormatStringLength = Integer.toString(sizeOfTable).length();
		
		// formatting table length with digits spaces
		String formatString = String.format("%%%ds", formatStringLength);
		
		// axes formatting table length with digits spaces
		String axesFormatString = String.format("%%%ds", axesFormatStringLength);
		System.out.println("\n");

		// Display table row.
		for (int i = 1; i <= sizeOfTable; i++) {
			System.out.printf(formatString + " ", i);
		}

		System.out.print("\n----");
		// Display the formatting of table with length.
		for (int i = 1; i <= sizeOfTable; i++) {
			System.out.print("----");
		}

		System.out.println();
		for (int i = 2; i <= sizeOfTable; i++) {
			// Display jth column of table
			for (int j = 1; j <= sizeOfTable; j++) {
				// multiplication of column and row
				System.out.printf(formatString + " ", i * j);
			}
			System.out.println();
		}
	}
}