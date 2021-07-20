package com.velociter.nitesh.chapter9;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Exercise1 {
	public static void main(String[] args) {
		if (null != args[0] && args[0].length() > 5 && args[0].endsWith(".txt")) {
			File aFile = new File(args[0]);
			FileOutputStream outputFile = null; 
			if (aFile.isFile()) {
				System.out.println("file.txt already exists.");
			} else {
				try {
					outputFile = new FileOutputStream(aFile);
					System.out.println("file.txt output stream created");
				} catch (FileNotFoundException e) {
					e.printStackTrace(System.err);
				}
			}
		}
	}
}
