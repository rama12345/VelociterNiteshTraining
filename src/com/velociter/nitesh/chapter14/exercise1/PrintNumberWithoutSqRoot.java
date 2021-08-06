package com.velociter.nitesh.chapter14.exercise1;

import java.util.Scanner;

public class PrintNumberWithoutSqRoot {
	public static void main(String args[]) {
		int start, end, i, j, count = 0;
		Scanner scan = new Scanner(System.in);

		System.out.print("How Many Prime Number from Start to End You Want.\n");

		System.out.print("Enter Starting Number : ");
		start = scan.nextInt();
		System.out.print("Enter Ending Number : ");
		end = scan.nextInt();

		// before completion time in millisecond.
		System.out.print("Prime Numbers Between " + start + " and " + end + " is :\n");
		long startTime = System.currentTimeMillis();
		System.out.println("Before Execution in Second : " + startTime);

		// iterate with start to end number.
		for (i = start; i <= end; i++) {
			count = 0;
			// check if its not prime.
			for (j = 2; j < i; j++) {
				if (i % j == 0) {
					count++;
					break;
				}
			}
			if (count == 0) {
				System.out.print(i + " ");
			}
		}
		
		// after completion time in millisecond.
		long entTime = System.currentTimeMillis();
		System.out.println("\nAfter Execution in Second : " + entTime);
		
		// difference completion time in second.
		System.out.println("Difference Between Execution in Second : " + (entTime - startTime) / 1000F + "seconds");
	}
}