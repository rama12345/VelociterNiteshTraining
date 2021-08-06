package com.velociter.nitesh.chapter14.exercise1;

import java.util.Scanner;

public class PrimeSquareRootNumber {

	public static void main(String[] args) {
//		int status = 1;
//		int num = 3;
//		Scanner input = new Scanner(System.in);
//		System.out.println("Enter the number : ");
//		if(input.hasNext("[0-9]*")) {
//			int n = input.nextInt();
//			long startTime = System.currentTimeMillis();
//			System.out.println("Before Execution in Second : " + startTime);
//			for (int i = 2; i <= n;) {
//				for (int j = 2; j <= Math.sqrt(num); j++) {
//					if (num % j == 0) {
//						status = 0;
//						break;
//					}
//				}
//				if (status != 0) {
//					System.out.print(num+" ");
//					i++;
//				}
//				status = 1;
//				num++;
//			}
//			long entTime = System.currentTimeMillis();
//			System.out.println("\nAfter Execution in Second : " + entTime);
//			System.out.println("Difference Between Execution Second : " + (entTime - startTime) / 1000F+"seconds");
//		}else {
//			System.out.println("Please Enter Valid Input.");
//		}

		int N; 
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the value of n:");
		N = scanner.nextInt();
		long startTime = System.currentTimeMillis();
		System.out.println("Before Execution Time is : " + startTime);
		if (N >= 1) {
			System.out.println(" prime numbers are:");
		}

		for (int j = 2; j <= N; j++) {
			int flag = 0;
			for (int i = 2; i <= j; i++) {
				if (j % i == 0) {
					flag = flag + 1;
				}
			}
			if (flag == 0) {
				System.out.println(j + " ");
			}

		}
		long endTime = System.currentTimeMillis();
		System.out.println("\nAfter Execution Time is :" + endTime);
		System.out.println("Difference in Execution Time is : " + (endTime - startTime) / 1000F + "s");

	}
}
