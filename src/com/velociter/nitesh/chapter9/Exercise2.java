package com.velociter.nitesh.chapter9;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Exercise2 {
	public static boolean renameFileExtension(String source, String newExtension) {
		String target;
		// get the extension to new created string
		String currentExtension = getFileExtension(source);
		if (currentExtension.equals("")) {
			// check the equality of currentExtension with empty space.
			target = source + "." + newExtension;
		} else {
			// replace the all matches quote and pattern with the extension.
			target = source.replaceFirst(Pattern.quote("." + currentExtension) + "$", Matcher.quoteReplacement("." + newExtension));

		}
		return new File(source).renameTo(new File(target));
	}
	
	// find and get the last index of extension.
	public static String getFileExtension(String f) {
		String extension = "";
		// find the last index of file extension.
		int i = f.lastIndexOf('.');
		// fetching the last index of substring and store into empty string. 
		if (i > 0 && i < f.length() - 1) {
			extension = f.substring(i + 1);
		}
		return extension;
	}

	public static void main(String args[]) throws Exception {
		// create string to store filename
		String filename = "D:/myFile.txt";
		// create file class object to store file
		File txtFile = new File(filename);
		FileOutputStream outputFile = null; // Place to store the stream reference
		// check the file existence or not
		if (txtFile.isFile()) {
			// check the extension and rename it.
			System.out.println(renameFileExtension(filename, "123"));
			System.out.println("myFile.txt already exists.");
		} else {
			// Create the file stream
			try {
				// if file not exist it will create.
				// Create the stream opened to append data
				outputFile = new FileOutputStream(txtFile);
				// check the extension and rename it.
				System.out.println(renameFileExtension(filename, "123"));
				System.out.println("myFile.txt output stream created");
			} catch (FileNotFoundException e) {
				e.printStackTrace(System.err);
			}
		}
	}
}
