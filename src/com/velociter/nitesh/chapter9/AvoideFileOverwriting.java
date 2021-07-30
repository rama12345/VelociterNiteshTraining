package com.velociter.nitesh.chapter9;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class AvoideFileOverwriting {
	public static void main(String[] args) {

		// get the name of file from command line argument
		if (null != args[0] && args[0].length() > 5 && args[0].endsWith(".txt")) {

			// store file name into Object of File
			File txtFile = new File(args[0]);

			// create and writing data of file.
			FileOutputStream outputFile = null;

			// check the condition of file is exist or not
			if (txtFile.isFile()) {
				System.out.println("file.txt already exists.");
			} else {
				try {
					// create a file by command line argument
					outputFile = new FileOutputStream(txtFile);
					System.out.println("file.txt output stream created");
				} catch (FileNotFoundException e) {
					e.printStackTrace(System.err);
				}
			}
		}
	}
}
