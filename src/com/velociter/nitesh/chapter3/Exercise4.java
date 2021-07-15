package com.velociter.nitesh.chapter3;

public class Exercise4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char characterInAlphabate = ' ', sequenceOfCharacter;
		for (sequenceOfCharacter = 'A'; sequenceOfCharacter <= 'Z'; sequenceOfCharacter++) {
			if (sequenceOfCharacter != 'A' || sequenceOfCharacter != 'E' || sequenceOfCharacter != 'I' || sequenceOfCharacter != 'O' || sequenceOfCharacter != 'U')
				break;
		}
		characterInAlphabate = (char) (26 * Math.random() + sequenceOfCharacter);
		System.out.println(characterInAlphabate);
	}
}
