package com.velociter.nitesh.chapter8;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Exercise2 {

	public static void main(String[] args) {
//		String textOfString,arrayOfString[] = new String[50];
//		int x=0,i;
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("Enter the Sentences : ");
//		textOfString = scanner.nextLine();
//		StringTokenizer stringTokens = new StringTokenizer(textOfString, ",/:");
//		while (stringTokens.hasMoreTokens()) {
////			System.out.println(stringTokens.nextToken());
//			arrayOfString[x] = stringTokens.nextElement().toString();
//			x++;
//		}
//		for(i=0;i<x;i++) {
//			System.out.println("Resulting String are :"+arrayOfString[i]+" ");
//		}
		
		String s,w="",arraOfString[] = new String[50];
		int i,l,nw=0;
		char ch;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Sentence : ");
		s = sc.nextLine();
		s = s + " ";
		l = s.length();
		for(i=0;i<l;i++) {
			ch = s.charAt(i);
			if(ch!=' ') {
				w = w+ch;
			}else{
				arraOfString[nw++] = w + ":" ;
				w="";
			}
		}
		for(i=0;i<nw;i++)
			System.out.print(arraOfString[i]+"");
	}
}
