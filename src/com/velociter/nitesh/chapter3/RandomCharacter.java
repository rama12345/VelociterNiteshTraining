package com.velociter.nitesh.chapter3;

public class Exercise4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char characterInAlphabate = ' ', sequenceOfCharacter;
		// loop is going to start from A-Z
		for (sequenceOfCharacter = 'A'; sequenceOfCharacter <= 'Z'; sequenceOfCharacter++) {
			// chack comparision and equality of vowels
			if (sequenceOfCharacter != 'A' || sequenceOfCharacter != 'E' || sequenceOfCharacter != 'I' || sequenceOfCharacter != 'O' || sequenceOfCharacter != 'U')
				break;
		}
		// generate random character from A-Z
		characterInAlphabate = (char) (26 * Math.random() + sequenceOfCharacter);
		System.out.println(characterInAlphabate);
	}
}
