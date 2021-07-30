package com.velociter.nitesh.chapter10;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileDateFormates {
	public static void main(String args[]) throws IOException {
		
		// store the years into the string of array.
		String[] monthNames = { "January", "February", "March", "April", "May", "June", "July", "August", "September",
								"October", "November", "December" };
		
		// set first with null.
		String first = null;
		
		// set monthString with null.
		String monthString = null;
		
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

		//convert the month number to month name 
		for (int i = month - 1; i < monthNames.length; i++) { // i for iteration
			monthString = monthNames[i];
			break;

		}
		
		// create the object of fileWriter to store data to file.
		FileWriter filewriter = new FileWriter("D:/Date.txt");
		
		// add the resulting day, month, year.
		String date = day + first + " " + monthString + " " + year;
		
		// put the data into a file
		for (j = 0; j < date.length(); j++) {
			filewriter.write(date.charAt(j));
		}
		filewriter.close();
		System.out.println("Write sucessfully");
	}
}
