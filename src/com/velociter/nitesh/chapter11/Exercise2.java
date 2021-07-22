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

public class Exercise2 {
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
		// get the n number of prime given by user
		Scanner input = new Scanner(System.in);
		System.out.println("How many prime number you want to enter : ");
		// store number of Prim in PRIMECOUNT
		int PRIMECOUNT = input.nextInt();
		// store data into the buffer at the time 48 byte.
		ByteBuffer byteBuffer  = ByteBuffer.allocate(8 * PRIMECOUNT);
		long[] primes = new long[PRIMECOUNT];
		try {
			int primesRead = 0;
			// check  the condition if channel of reding data is not end.
			while (inChannel.read(byteBuffer) != -1) {
				try {
					// converting and storing into the long buffer
					((ByteBuffer) (byteBuffer.flip())).asLongBuffer().get(primes);
					// find out the length of file to be read.
					primesRead = primes.length;
				} catch (BufferUnderflowException e) {
					// storing into the long buffer in buffer byte
					LongBuffer longBuffer = byteBuffer.asLongBuffer();
					// read the remaining prime 
					primesRead = longBuffer.remaining();
					// get the specific prime number
					longBuffer.get(primes, 0, primesRead);
				}
				// List the primes read on the same line
				System.out.println();
				// looping for print the specific prime numbers
				for (int i = 0; i < primesRead; i++) {
					System.out.printf("%10d", primes[i]);
				}
				// Clear the buffer for the next read
				byteBuffer.clear(); 
			}
			System.out.println("\nEOF reached.");
			// Close the file and the channel
			inputFile.close(); 
		} catch (IOException e) {
			e.printStackTrace(System.err);
			System.exit(1);
		}
		System.exit(0);
	}
}
