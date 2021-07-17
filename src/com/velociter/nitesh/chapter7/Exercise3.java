package com.velociter.nitesh.chapter7;

class IteratedArithmeticException {
	int divisor = 0;
	int result = 0;
	int iteratedCount = 0;

	public void iteratedExceptionOccures() throws ArithmeticException {
		for (int iteration = 0;; iteration++) {
			divisor = (int) (100 * Math.random());
			result = 1000 / divisor;
			iteratedCount++;
			System.out.println("Iteration count:" + iteratedCount);
		}
	}
}

public class Exercise3 {
	public static void main(String args[]) {
		IteratedArithmeticException iae = new IteratedArithmeticException();
		try {
			iae.iteratedExceptionOccures();
		} catch (ArithmeticException e) {
			System.out.println("ArithmeticException Exception Occures:" + e.getMessage());
		}
	}
}