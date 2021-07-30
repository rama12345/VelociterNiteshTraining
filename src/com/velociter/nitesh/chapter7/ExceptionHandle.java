package com.velociter.nitesh.chapter7;

class IndexOutOfBoundsException {

	public void divide() {
		String[] arrayOfString = { "Rohit", "Shikar", "Virat", "Dhoni" };
		
		// get the string into array from the end of length
		for (int i = 0; i <= arrayOfString.length; i++) {
			System.out.println(arrayOfString[i]);
		}
	}
}

public class ExceptionHandle {
	public static void main(String args[]) {
		
		// creating the object of Index Out of Bounds Exception
		IndexOutOfBoundsException indexOutOfBoundsException = new IndexOutOfBoundsException();
		try {
			// find out the exception of array Index Out of Bounds Exception
			indexOutOfBoundsException.divide();
		} catch (Exception e) {
			System.out.println("Exception is:" + e.getMessage());
		}
	}
}