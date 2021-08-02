package com.velociter.nitesh.chapter11;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class ReadFiles {
	public static void main(String[] args) {
		String filePath = "D:/myFile.txt";
		// create the object of file to store
		File txtFile = new File(filePath);
		
		// create the object of FileInputStream to read data from file.
		FileInputStream inputFile = null;
		
		// try condition if that possible.
		try {
			inputFile = new FileInputStream(txtFile);
		} catch (FileNotFoundException exception) {
			exception.printStackTrace(System.err);
			System.exit(1);
		}
		
		// fetch and reading data via input file channel.
		FileChannel inputChannel = inputFile.getChannel();
		
		// store data into the buffer at the time 48 byte.
		ByteBuffer bufferStream = ByteBuffer.allocate(1024);
		try {
			// check if data into the file not to empty.
			while (inputChannel.read(bufferStream) != -1) {
		
				// print all the character which it will store.
				System.out.println("Resulting String : " + ((ByteBuffer) (bufferStream.flip())).asCharBuffer().toString());
				
				// Clear the buffer for the next read
				bufferStream.clear(); 
			}
			System.out.println("EOF reached. ");
			
			// Close the file and the channel
			inputFile.close(); 
		} catch (IOException exception) {
			exception.printStackTrace(System.err);
			System.exit(1);
		}
		System.exit(0);
	}
}