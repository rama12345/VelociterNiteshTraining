package com.velociter.nitesh.chapter9;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Date;

class FileListFilter implements FilenameFilter {
	private String name;
	private String extension;

	// constructor with arguments
	public FileListFilter(String name, String extension) {
		this.name = name;
		this.extension = extension;
	}

	// create function of check directory will exist or not
	public boolean accept(File directory, String filename) {
		boolean fileOK = true;

		if (name != null) {
			fileOK &= filename.startsWith(name);
		}

		if (extension != null) {
			fileOK &= filename.endsWith('.' + extension);
		}
		return fileOK;
	}
}

public class Exercise3 {
	public static void main(String args[]) {
		// fetch the root directory of file
		File[] roots = File.listRoots();
		// for each loop of root files
		for (File root : roots) {
			System.out.println(root);
			// Create an object that is a directory
			File myDir = new File("C:/jdk1.5.0/src/java");
			// filtering the files from root folder
			FilenameFilter select = new FileListFilter("F", "java");
			// pass filted file from root
			File[] contents = myDir.listFiles(select);
			// check the condition of filted file into list of files
			if (contents != null) {
				System.out.println(
						"\nThe " + contents.length + " matching items in the directory, " + myDir.getName() + ", are:");
				for (File file : contents) {
					System.out.println(file + " is a " + (file.isDirectory() ? "directory" : "file")
							+ " last modified on\n" + new Date(file.lastModified()));
				}
			} else {
				System.out.println(myDir.getName() + " is not a directory");
			}
			return;
		}
	}
}