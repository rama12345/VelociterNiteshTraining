package com.velociter.nitesh.chapter10;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileDateFormates {
	public static void main(String args[]) throws IOException {
		try {
			takeInputFromUser();
		} catch (Exception e) {
			System.out.println("you Enterd wrong input..");
			takeInputFromUser();
		}
	}

	public static void takeInputFromUser() throws IOException {

		int day = 0, month = 0, year = 0, yearLength = 0;
		System.out.println("Enter the day:");
		Scanner scanner = new Scanner(System.in);

		try {

			day = scanner.nextInt();
			// take input from user
			System.out.println("Enter the  Month:");
			month = scanner.nextInt();

			System.out.println("Enter the  year:");
			year = scanner.nextInt();

			// finding year of length
			yearLength = Integer.toString(year).length();

			// checking user input
			if (day > 31 || month > 12 || yearLength > 4 || yearLength < 4) {

				System.out.println("you Enterd wrong input..");
				while (true) {
					System.out.println("press 1 for continue");
					System.out.println("press 2 for Exit");
					int myChoice = scanner.nextInt();

					switch (myChoice) {
					case 1:
						takeInputFromUser();
						break;
					case 2:
						System.out.println("Thank You For Using!!!");
						System.exit(0);
						break;

					}

				}

			} else {
				dateFormatFun(day, month, year);
			}
		} catch (Exception e) {

			System.out.println("You Enter Wrong input..");
			takeInputFromUser();
		}
	}

	public static void dateFormatFun(int day, int month, int year) throws IOException {
		String[] monthNames = { "January", "February", "March", "April", "May", "June", "July", "August", "September",
				"October", "November", "December" };

		String first = null, monthString = null;

		// checking the day of number
		if (day == 1) {
			first = "st";
		}
		if (day == 2) {
			first = "nd";

		}
		if (day == 3) {
			first = "rd";

		}
		if (day > 3) {
			first = "th";
		}
		// convert the month number to month name
		for (int i = month - 1; i < monthNames.length; i++) { // i for iteration
			monthString = monthNames[i];
			break;

		}
		// creating a file
		String fileName = "D:/Date.txt";
		FileWriter filewriter = new FileWriter(fileName, true);

		String date = day + first + " " + monthString + " " + year;
		// putting a data into the file
		for (int j = 0; j < date.length(); j++) {
			filewriter.write(date.charAt(j));
		}
		filewriter.write("\n");
		filewriter.close();
		System.out.println("Write sucessfully");
	}
}
