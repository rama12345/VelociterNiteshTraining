package com.velociter.nitesh.chapter4;

public class DateFormate {

	public static void main(String args[]) {
		String[] dates = new String[10];
		String[] monthNames = {"January", "February", "March", "April","May", "June", "July", "August", "September","October", "November", "December"};
		int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		String ending = "th";
		String dayStr = null;
		String monthStr = null;
		String yearStr = null;
		char separator = '/';
		int day = 0;
		int month = 0;
		int year = 0;
		int daysIncrement = 0;
		// condition of generating the random year and month of multiple 100 and 12
		for(int i=0 ; i<dates.length ; i++) {
		year = (int)(100.0*Math.random()); 
		month = (int)(12.0*Math.random()) + 1; 
		// check the leap year
		daysIncrement = (((year % 4 == 0) && !(year % 100 == 0)) || (year % 400 == 0)) && (month == 2) ? 1 : 0 ;
		// storing the random month of increasing it.
		day = (int)(Math.random()*(daysInMonth[month-1]+daysIncrement))+1;
		dates[i] = "" + day + separator + month + separator + (year<10 ? "0" :"") + year;
		System.out.println("Day is " + dates[i]);
		}
		// initial start and end will 0.
		int start = 0; 
		int end = 0; 

		System.out.println();
		// for each loop date comparision
		for(String date : dates) {
		start = 0;
		// separation the index of date from start to end
		end = date.indexOf(separator,start);
		// get the substring from start to end
		dayStr = date.substring(start, end);
		start = end+1;
		end = date.indexOf(separator,start);
		monthStr = date.substring(start, end);
		start = end+1;
		yearStr = date.substring(start);
		// find out the year and month from string
		if(dayStr.length() == 1)
			switch(dayStr.charAt(0)) {
				case '1':
					ending = "st";
					break;
				case '2':
					ending = "nd";
					break;
				case '3':
					ending = "rd";
					break;
				default:
					ending = "th";
				}
				else if(dayStr.charAt(0) == '1')
					ending = "th";
				else
					switch(dayStr.charAt(1)) {
						case '1':
							ending = "st";
							break;
						case '2':
							ending = "nd";
							break;
						case '3':
							ending = "rd";
							break;
						default:
							ending = "th";
		}

		System.out.println(dayStr + ending + " " +
		monthNames[monthStr.length() == 1 ? monthStr.charAt(0) - '1': 9 + monthStr.charAt(1) - '0'] +
		" " + "19" + yearStr);
		
		}
	}
}
