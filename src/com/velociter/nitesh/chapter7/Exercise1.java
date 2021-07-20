package com.velociter.nitesh.chapter7;

public class Exercise1 {
	public static void main(String args[]) {
		String nameOfString = null;
		// take the four digit into array
		int[] array = { 1, 2, 3, 4 };
		try {
			// check the condition Null Pointer Exception will occur
			if (nameOfString.equals("Java")) {
				System.err.println("Welcome to Java");
			}

		} catch (NullPointerException e) {
			System.out.println("The Exception occuers" + e.getMessage());
			System.out.println("The contents of the stack trace are:\n");
			e.printStackTrace();
		}
		try {
			// check the condition Negative Array Size Exception will occur
			int[] array2 = new int[-10];

		} catch (NegativeArraySizeException e1) {

			System.out.println("The Eexception Occurs:" + e1.getMessage());
			System.out.println("The contents of the stack trace are:\n");
			e1.printStackTrace();
		}
		try {
			// check the condition Array IndexOut Of Bounds Exception will occur
			for (int i = 0; i <= array.length; i++) {
				System.out.println(array[i]);
			}
		} catch (ArrayIndexOutOfBoundsException e2) {

			System.out.println("The Exception occurs:" + e2.getMessage());
			System.out.println("The contents of the stack trace are:\n");
			e2.printStackTrace();
		}
	}
}
