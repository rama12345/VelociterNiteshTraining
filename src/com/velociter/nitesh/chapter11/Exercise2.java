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
		File txtPrimesFile = new File("D:/primes.txt");
		FileInputStream inputFile = null;
		try {
			inputFile = new FileInputStream(txtPrimesFile);
		} catch (FileNotFoundException e) {
			e.printStackTrace(System.err);
			System.exit(1);
		}
		FileChannel inChannel = inputFile.getChannel();
		Scanner input = new Scanner(System.in);
		System.out.println("How many prime number you want to enter : ");
		final int PRIMECOUNT = input.nextInt();
		ByteBuffer byteBuffer  = ByteBuffer.allocate(8 * PRIMECOUNT);
		long[] primes = new long[PRIMECOUNT];
		try {
			int primesRead = 0;
			while (inChannel.read(byteBuffer) != -1) {
				try {
					((ByteBuffer) (byteBuffer.flip())).asLongBuffer().get(primes);
					primesRead = primes.length;
				} catch (BufferUnderflowException e) {
					LongBuffer longBuffer = byteBuffer.asLongBuffer();
					primesRead = longBuffer.remaining();
					longBuffer.get(primes, 0, primesRead);
				}
				// List the primes read on the same line
				System.out.println();
				for (int i = 0; i < primesRead; i++) {
					System.out.printf("%10d", primes[i]);
				}
				byteBuffer.clear(); // Clear the buffer for the next read
			}
			System.out.println("\nEOF reached.");
			inputFile.close(); // Close the file and the channel
		} catch (IOException e) {
			e.printStackTrace(System.err);
			System.exit(1);
		}
		System.exit(0);
	}
}
