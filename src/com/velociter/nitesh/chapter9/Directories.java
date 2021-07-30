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
		boolean fileOK = false;
		if (name != null || extension != null) {
			fileOK &= filename.startsWith(name);
			fileOK &= filename.endsWith('.' + extension);
			return fileOK = true;
		}
		return fileOK;
	}
}

public class Directories {
	public static void main(String args[]) {
		
		// fetch the root directory of file
		File[] roots = File.listRoots();
		
		// for each loop of root files
		for (File root : roots) {
		
			// System.out.println(root);
			// Create an object that is a directory
			File myDirectory = new File("D:\\VelocitersChapters\\VelociterNiteshTraining\\src\\com\\velociter\\nitesh");
			
			// filtering the files from root folder
			FilenameFilter fileFilter = new FileListFilter("D:/","D:\\VelocitersChapters\\VelociterNiteshTraining\\src\\com\\velociter\\nitesh");
			
			// pass filed file from root
			File[] contents = myDirectory.listFiles(fileFilter);
			
			// check the condition of felted file into list of files
			if (contents != null) {
				System.out.println("\nThe " + contents.length + " matching items in the directory, "
											+ myDirectory.getName() + ", are:");
				for (File file : contents) {
					System.out.println(file + " is a " + (file.isDirectory() ? "directory" : "file")
											+ " last modified on\n" + new Date(file.lastModified()));
				}
			} else {
				System.out.println(myDirectory.getName() + " is not a directory");
			}
			return;
		}
	}
}