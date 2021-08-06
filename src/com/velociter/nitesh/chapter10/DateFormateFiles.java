package com.velociter.nitesh.chapter10;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class DateFormateFiles {
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
		System.out.println("Enter the day in Number:");
		Scanner scanner = new Scanner(System.in);

		try {
			// take input from user
			day = scanner.nextInt();

			System.out.println("Enter the Month in Number:");
			month = scanner.nextInt();

			System.out.println("Enter the  year in Number:");
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
//checking the day number 
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
		for (int i = month - 1; i <= monthNames.length; i++) {
			monthString = monthNames[i];
			break;

		}
		// creating a file
		FileWriter filewriter = new FileWriter("D:/Date1.txt");

		String firstFileDate = day + first + " " + monthString + " " + year;
		System.out.println("first file date is:" + firstFileDate);

		// put the data into first file
		for (int j = 0; j < firstFileDate.length(); j++) { // j variable for iteration
			filewriter.write(firstFileDate.charAt(j));
		}
		filewriter.close();
		System.out.println("Written in first file  sucessfully");
		// creating a second file
		FileWriter filewriterObject = new FileWriter("D:/Date2.txt", true);
		int convertedmonthStringIntoMonthNumber = 0;
		for (int i = 0; i < monthNames.length; i++) // i for iteration
		{
			if (monthString == monthNames[i]) {
				convertedmonthStringIntoMonthNumber = i + 1;
			}
		}
		String secondFileDate = day + "/" + convertedmonthStringIntoMonthNumber + "/" + year;

		// put the data into second file
		for (int i = 0; i < secondFileDate.length(); i++) {
			filewriterObject.write(secondFileDate.charAt(i));
		}
		System.out.println("Seond file date is:" + secondFileDate);
		System.out.println("Written  in the second file succesfully");
		filewriterObject.close();

	}
}
