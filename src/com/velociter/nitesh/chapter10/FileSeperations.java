package com.velociter.nitesh.chapter10;

import java.io.FileWriter;
import java.io.IOException;

public class FileSeperations {
	public static void main(String args[]) {
		try {
			// Accept a string
			String textOfstring = "Hand/ling /n Java /" + " FileWriter / FileReader";
			char characterOfString;

			// attach a file to FileWriter
			FileWriter fileWriter = new FileWriter("D:/myFile.txt");

			// read character wise from string and write into FileWriter
			for (int i = 0; i < textOfstring.length(); i++) {
				characterOfString = textOfstring.charAt(i);
				if (characterOfString == '/') {
					// do nothing
				} else {
					fileWriter.write(textOfstring.charAt(i));
				}
			}
			System.out.println("Writing successful");
			fileWriter.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
