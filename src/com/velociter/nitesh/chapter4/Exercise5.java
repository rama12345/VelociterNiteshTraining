package com.velociter.nitesh.chapter4;

public class Exercise5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text = "To be or not to be.";
		String reversetext = "";
		char characterOfString = ' ';
		int substr = 0;
		int i = 0, j = 0, indexOfString = 0;
		System.out.println("Text before reversing    :    " + text);
		for (i = 0; i < text.length();) {
			indexOfString = text.indexOf(characterOfString, substr);
			for (j = indexOfString - 1; j >= substr; j--) {
				reversetext += text.charAt(j);
			}
			if (indexOfString != -1) {
				substr = indexOfString + 1;
				i = substr;
				reversetext += " ";
			} else
				break;
		}
		for (int n = text.length() - 2; n >= substr; n--)
			reversetext += text.charAt(n);
		System.out.println("Text after reversing    :    " + reversetext + ".");
	}
}
