package com.velociter.nitesh.chapter9;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Random;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ReplaceExtensionFiles {
	public static boolean renameFileExtension(String source, String newExtension) {
		String target;
		// get the extension to new created string
		String currentExtension = getFileExtension(source);
		if (currentExtension.equals("")) {

			// check the equality of currentExtension with empty space.
			target = source + "." + newExtension;
		} else {

			// replace the all matches quote and pattern with the extension.
			target = source.replaceFirst(Pattern.quote("." + currentExtension) + "$",
					Matcher.quoteReplacement("." + newExtension));

		}
		return new File(source).renameTo(new File(target));
	}

	// find and get the last index of extension.
	public static String getFileExtension(String fileName) {
		String extension = "";

		// find the last index of file extension.
		int i = fileName.lastIndexOf('.');
		// fetching the last index of substring and store into empty string.
		if (i > 0 && i < fileName.length() - 1) {
			extension = fileName.substring(i + 1);
		}
		return extension;
	}

	public static void main(String[] args) {
		String fileName, result = "";
		int i, lengthOfExtension;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Your fileName : ");
		if (input.hasNext("[A-Za-z.]*")) {
			fileName = input.nextLine();
			lengthOfExtension = getFileExtension(fileName).length();
			// create file class object to store file
			File txtFile = new File(fileName);

			// Place to store the stream reference
			FileOutputStream outputFile = null;

			// check the file existence or not
			if (txtFile.isFile()) {
				lengthOfExtension = getFileExtension(fileName).length();
				for (i = 1; i <= lengthOfExtension; i++) {
					result += i + "";
				}
				System.out.println(result);
				System.out.println(renameFileExtension(fileName, result));
				System.out.println("file already exists.");
			} else {
				// Create the file stream
				try {
					// if file not exist it will create.
					// Create the stream opened to append data
					outputFile = new FileOutputStream(txtFile);
					System.out.println("file output stream created");
				} catch (FileNotFoundException e) {
					e.printStackTrace(System.err);
				}
			}
		} else {
			System.out.println("Please Enter Valid FileName.");
		}
	}
}
