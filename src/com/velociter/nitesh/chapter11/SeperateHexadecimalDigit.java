package com.velociter.nitesh.chapter11;

import java.io.BufferedReader;
import java.io.FileReader;

public class SeperateHexadecimalDigit {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		String lineOfString = null, wordsOfString = "", newWords;
		char characterOfString, charactersOfArray[] = new char[50];
		int i, lengthOfString, j;
		String fileName = "D:/test.txt";
		// create an Object of StringBuffer to store hexadecimal number. 
		StringBuffer stringBuffer = new StringBuffer();
		// create the Object of FileReader to read the data from file.
		FileReader fileReader = new FileReader(fileName);
		// create the Object of BufferedReader store reader file.
		BufferedReader bufferReader = new BufferedReader(fileReader);
		// check the condition if file get it end.
		while ((lineOfString = bufferReader.readLine()) != null) {
			lengthOfString = lineOfString.length();
			for (i = 0; i < lengthOfString; i++) {
				// store the character from string.
				characterOfString = lineOfString.charAt(i);
				// check the condition if space or not.
				if (characterOfString != ' ') {
					wordsOfString += characterOfString;
				} else {
					newWords = " " + wordsOfString;
					// check the length of words equals to 8.
					if (newWords.length() == 8) {
						// print the word of length 8
						System.out.println(newWords);
						// Converting string to character array
						charactersOfArray = newWords.toCharArray();
						// enhancing the loop of character of array length
						for (j = 0; j < charactersOfArray.length; j++) {
							// convert character to hexadecimal and store into string.
							String hexadecimalString = Integer.toHexString(charactersOfArray[j]);
							// add the hexadecimal number to buffer.
							stringBuffer.append(hexadecimalString);
						}
						// convert hexadecimal number to resulting string.
						String resultingString = stringBuffer.toString();
						System.out.println(resultingString);
					}
					// set the word to empty at the end.
					wordsOfString = "";
				}
			}
		}
	}
}
