package com.velociter.nitesh.chapter8;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Exercise2 {

	public static void main(String[] args) {		
		String textOfString,words="",arraOfString[] = new String[50];
		int i,lenghtOfString,numberOfWords=0;
		char ch;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the Sentence : ");
		textOfString = input.nextLine();
		textOfString = textOfString + " ";
		lenghtOfString = textOfString.length();
		for(i=0;i<lenghtOfString;i++) {
			ch = textOfString.charAt(i);
			if(ch!=' ') {
				words = words+ch;
			}else{
				arraOfString[numberOfWords++] = words + ":" ;
				words="";
			}
		}
		for(i=0;i<numberOfWords;i++)
			System.out.print(arraOfString[i]+"");
	}
}
