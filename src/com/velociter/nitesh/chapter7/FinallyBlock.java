package com.velociter.nitesh.chapter7;

class ArithmeticExceptionExample {
	int divisor = 0;
	int result = 0;
	int iteratedCount = 0;

	public void iteratedExceptionOccures() throws ArithmeticException {
		// get the string into array from the end of length
		for (int iteration = 0;; iteration++) {
			// generate the divisor random value of 100 multiple
			divisor = (int) (100 * Math.random());
			// find out the digit extraction and iteration count
			result = 1000 / divisor;
			iteratedCount++;
		}
	}
}

public class Exercise4 {
	public static void main(String args[]) {
		// creating the object of Arithmetic Exception Example
		ArithmeticExceptionExample arithmeticExceptionExample = new ArithmeticExceptionExample();
		try {
			// find out the exception of Arithmetic Exception
			arithmeticExceptionExample.iteratedExceptionOccures();
		} catch (ArithmeticException e) {
			System.out.println("ArithmeticException Exception Occures:" + e.getMessage());
		} finally {
			System.out.println("Iteration count:" + arithmeticExceptionExample.iteratedCount);
		}
	}
}