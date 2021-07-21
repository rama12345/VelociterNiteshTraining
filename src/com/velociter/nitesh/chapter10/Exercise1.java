package com.velociter.nitesh.chapter10;

import java.io.FileWriter;
import java.io.IOException;

public class Exercise1 {
	public static void main(String args[]) {
		String dataStore;
		try {
			// Accept a string
			String str = "Hand/ling /n Java /" + " FileWriter / FileReader";
			char ch;
			// attach a file to FileWriter
			FileWriter fw = new FileWriter("D:/myFile.txt");
			// read character wise from string and write
			// into FileWriter
			for (int i = 0; i < str.length(); i++) {
				ch = str.charAt(i);
				if (ch == '/') {
					// do nothing
				} else {
					fw.write(str.charAt(i));
				}
			}
			System.out.println("Writing successful");
			// close the file
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
