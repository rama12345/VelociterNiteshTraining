package com.velociter.nitesh.chapter7;

class IndexOutOfBoundsException {

	public void divide() {
		String[] arrayOfString = { "Rohit", "Shikar", "Virat", "Dhoni" };

		for (int i = 0; i <= arrayOfString.length; i++) {
			System.out.println(arrayOfString[i]);
		}
	}
}

public class Exercise2 {
	public static void main(String args[]) {
		IndexOutOfBoundsException object = new IndexOutOfBoundsException();
		try {
			object.divide();
		} catch (Exception e) {
			System.out.println("Exception is:" + e.getMessage());
		}
	}
}