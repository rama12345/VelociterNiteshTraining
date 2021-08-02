package com.velociter.nitesh.chapter11;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.LongBuffer;
import java.nio.channels.FileChannel;
import java.util.Scanner;

// change the formatting of the class.
public class ReadPrimeNumbers {	
	public static void main(String[] args) throws IOException {
		// create object of File to store files
		File txtPrimesFile = new File("D:/primes.txt");
		// read file using FileInputStream
		FileInputStream inputFile = null;
		// try condition if that possible.
		try {
			// store input stream file
			inputFile = new FileInputStream(txtPrimesFile);
		} catch (FileNotFoundException e) {
			e.printStackTrace(System.err);
			System.exit(1);
		}
		// fetch and reading data via input file channel.
		FileChannel inChannel = inputFile.getChannel();
		// store number of Prime in PRIMECOUNT and start it.
		Scanner input = new Scanner(System.in);
		System.out.println("How many prime number your want between 1 to Your choice.");
		System.out.println("Enter Your Choice : ");
		int primeStart = 1;
		// store data into the buffer at the time 48 byte.
		ByteBuffer byteBuffer = ByteBuffer.allocate(8 * 1024);
		// set the hight value at the end of prime.
		int primeEnd = input.nextInt();
		try {
			// check the condition if channel of reding data is not end.
			while (inChannel.read(byteBuffer) != -1) {
				while (primeStart < primeEnd) {
					boolean flag = false;
					// condition if the end of PrimeCounting 
					for (int i = 2; i <= primeStart / 2; ++i) {
						// condition for nonprime number
						if (primeStart % i == 0) {
							// set it flag true to get non prime and break it. 
							flag = true;
							break;
						}
					}
					// check the end of the condition will get prime between 15-30.  
					if (!flag && primeStart != 0 && primeStart != 1)
						System.out.print(primeStart + " ");
					// incrementing the prime count from 15 to end of 30.
					++primeStart;
				}
				// at the end of the prime file.
				System.out.println("\nEOF reached.");
				// Close the file and the channel
				inputFile.close();
			}
		} catch (IOException e) {
			System.out.println("Exception is : "+e.getMessage());
			System.exit(1);
		}
		System.exit(0);
	}
	
}
