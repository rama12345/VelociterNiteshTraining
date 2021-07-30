package com.velociter.nitesh.chapter7;

class IteratedArithmeticException {
	int divisor = 0;
	int result = 0;
	int iteratedCount = 0;

	public void iteratedExceptionOccures() throws Exception {

		// get the string into array from the end of length
		for (int iteration = 0;; iteration++) {

			// generate the divisor random value of 100 multiple
			divisor = (int) (100 * Math.random());

			// find out the digit extraction and iteration count
			result = 1000 / divisor;
			iteratedCount++;
			System.out.println("Iteration count:" + iteratedCount);
		}
	}
}

public class ArithmeticExceptions {
	public static void main(String args[]) {

		// creating the object of Iterated Arithmetic Exception
		IteratedArithmeticException iteratedArithmeticException = new IteratedArithmeticException();
		try {
			// find out the exception of Iterated Arithmetic Exception
			iteratedArithmeticException.iteratedExceptionOccures();
		} catch (Exception e) {
			System.out.println("ArithmeticException Exception Occures:" + e.getMessage());
		}
	}
}