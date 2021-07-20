package com.velociter.nitesh.chapter9;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Date;

class FileListFilter implements FilenameFilter {
	private String name;
	private String extension;

	public FileListFilter(String name, String extension) {
		this.name = name;
		this.extension = extension;
	}

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

		File[] roots = File.listRoots();
		for(File root : roots) {
	System.out.println(root);
		// Create an object that is a directory
		File myDir = new File("C:/jdk1.5.0/src/java");
	
		FilenameFilter select = new FileListFilter("F", "java");

	    File[] contents = myDir.listFiles(select);

	    if (contents != null) {
	      System.out.println("\nThe " + contents.length
	          + " matching items in the directory, " + myDir.getName()
	          + ", are:");
	      for (File file : contents) {
	        System.out.println(file + " is a "
	                + (file.isDirectory() ? "directory" : "file")
	                + " last modified on\n"
	                + new Date(file.lastModified()));
	      }
	    } else {
	      System.out.println(myDir.getName() + " is not a directory");
	    }
	    return;
	  }
	}
}