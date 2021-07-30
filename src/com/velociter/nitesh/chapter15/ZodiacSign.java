package com.velociter.nitesh.chapter15;

import java.util.Scanner;

public class ZodiacSign {

	public static void main(String[] agrs) {
		int month, day;

		// get the month and day from user.
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your birth month(1-12) : \n");
		month = input.nextInt();
		System.out.println("Enter your birth day : \n");
		day = input.nextInt();

		// call the function to find the Zodiac Sign pass month and day from user.
		zodiac_sign(month, day);
	}

	// method for check Zodiac Sign for Given Date of Birth
	static void zodiac_sign(int month, int day) {

		// check the condition if month or day.
		if ((month == 12 && day >= 22) || (month == 1 && day <= 19)) {
			System.out.println("Your Zodiac Sign based on your Birth date is Capricorn");
		} else if ((month == 1 && day >= 20) || (month == 2 && day <= 17)) {
			System.out.println("Your Zodiac Sign based on your Birth date is Aquarius");
		} else if ((month == 2 && day >= 18) || (month == 3 && day <= 19)) {
			System.out.println("Your Zodiac Sign based on your Birth date is Pisces");
		} else if ((month == 3 && day >= 20) || (month == 4 && day <= 19)) {
			System.out.println("Your Zodiac Sign based on your Birth date is Aries");
		} else if ((month == 4 && day >= 20) || (month == 5 && day <= 20)) {
			System.out.println("Your Zodiac Sign based on your Birth date is Taurus");
		} else if ((month == 5 && day >= 21) || (month == 6 && day <= 20)) {
			System.out.println("Your Zodiac Sign based on your Birth date is Gemini");
		} else if ((month == 6 && day >= 21) || (month == 7 && day <= 22)) {
			System.out.println("Your Zodiac Sign based on your Birth date is Cancer");
		} else if ((month == 7 && day >= 23) || (month == 8 && day <= 22)) {
			System.out.println("Your Zodiac Sign based on your Birth date is Leo");
		} else if ((month == 8 && day >= 23) || (month == 9 && day <= 22)) {
			System.out.println("Your Zodiac Sign based on your Birth date is Virgo");
		} else if ((month == 9 && day >= 23) || (month == 10 && day <= 22)) {
			System.out.println("Your Zodiac Sign based on your Birth date is Libra");
		} else if ((month == 10 && day >= 23) || (month == 11 && day <= 21)) {
			System.out.println("Your Zodiac Sign based on your Birth date is Scorpio");
		} else if ((month == 11 && day >= 22) || (month == 12 && day <= 21)) {
			System.out.println("Your Zodiac Sign based on your Birth date is Sagittarius");
		} else {
			System.out.println("Invalid Birth date entered");
		}
	}
}
