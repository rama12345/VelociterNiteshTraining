package com.velociter.nitesh.chapter10;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class DateFormateFiles {
	public static void main(String args[]) throws IOException {
		
		// store the years into the string of array.
		String[] monthNames = { "January", "February", "March", "April", "May", "June", "July", "August", "September",
								"October", "November", "December" };
		
		// set first with null.
		String first = null;
		
		// set monthString with null.
		String monthOfString = null;
		
		// taking the input form user day,month,year
		int day = 0, month = 0, year = 0, j;
		Scanner input = new Scanner(System.in);
		
		// get the value of day, month, year from user.
		System.out.println("Enter the day:");
		day = input.nextInt();
		System.out.println("Enter the Month:");
		month = input.nextInt();
		System.out.println("Enter the year:");
		year = input.nextInt();
		
		// check the condition of the day number pair.
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
			monthOfString = monthNames[i];
			break;

		}
		
		// create the object of fileWriter to store data to file.
		FileWriter filewriter = new FileWriter("D:/Date1.txt");
		
		// add the resulting day, month, year.
		String firstFileDate = day + first + " " + monthOfString + " " + year;
		System.out.println("first file date is:" + firstFileDate);
		
		// put the data into first file
		for (j = 0; j < firstFileDate.length(); j++) { // j variable for iteration
			filewriter.write(firstFileDate.charAt(j));
		}
		filewriter.close();
		System.out.println("Written in first file  sucessfully");
		
		// creating a second file
		FileWriter filewriterObject = new FileWriter("D:/Date2.txt");
		int convertedmonthStringIntoMonthNumber = 0;
		for (int i = 0; i < monthNames.length; i++) // i for iteration
		{
			if (monthOfString == monthNames[i]) {
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
