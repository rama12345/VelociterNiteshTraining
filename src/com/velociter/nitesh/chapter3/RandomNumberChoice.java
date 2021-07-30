package com.velociter.nitesh.chapter3;

public class RandomNumberChoice {
	public static void main(String[] args) {
		int myChoice = 0;

		// get the random value of choice
		myChoice = (int) (6.0 * Math.random());

		// switch condition will start
		switch (myChoice) {
			case 0:
				System.out.println("Breakfast choice is scrambled eggs");
				break;
			case 1:
				System.out.println("Breakfast choice is waffles");
				break;
			case 2:
				System.out.println("Breakfast choice is fruit");
				break;
			case 3:
				System.out.println("Breakfast choice is cereal");
				break;
			case 4:
				System.out.println("Breakfast choice is toast");
				break;
			case 5:
				System.out.println("Breakfast choice is yogurt");
				break;
		}
	}
}