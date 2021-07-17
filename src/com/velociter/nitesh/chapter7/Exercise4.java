package com.velociter.nitesh.chapter7;

class ArithmeticExceptionExample {
	int divisor = 0;
	int result = 0;
	int iteratedCount = 0;

	public void iteratedExceptionOccures() throws ArithmeticException {
		for (int iteration = 0;; iteration++) {
			divisor = (int) (100 * Math.random());
			result = 1000 / divisor;
			iteratedCount++;
		}
	}
}

public class Exercise4 {
	public static void main(String args[]) {
		ArithmeticExceptionExample iae = new ArithmeticExceptionExample();
		try {
			iae.iteratedExceptionOccures();
		} catch (ArithmeticException e) {
			System.out.println("ArithmeticException Exception Occures:" + e.getMessage());
		} finally {
			System.out.println("Iteration count:" + iae.iteratedCount);
		}
	}
}