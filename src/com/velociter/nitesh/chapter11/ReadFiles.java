package com.velociter.nitesh.chapter11;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class ReadFiles {
	public static void main(String[] args) {
		String line = null;
		
		String fileName = "D:/myFile.txt";
		
		// create fileReader to read file.
		FileReader fileReader = null;
		// create bufferReader to read file input.
		BufferedReader bufferedReader;
		try {
			
			// create and object of fileReader to read file input.
			fileReader = new FileReader(fileName);
			
			// create an object of bufferReader to store fileReader input. 
			bufferedReader=new BufferedReader(fileReader);
			
			// check the condition if not the end of file.
			while((line=bufferedReader.readLine())!=null)
			{
				System.out.println(line);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}