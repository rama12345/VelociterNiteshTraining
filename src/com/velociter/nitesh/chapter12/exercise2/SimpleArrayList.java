package com.velociter.nitesh.chapter12.exercise2;

import java.util.ArrayList;
import java.util.Scanner;

public class SimpleArrayList {
	public static void main(String args[]) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Put in a set: ");
		String input = scn.nextLine();
//		System.out.println(input);
		Scanner tokenizer = new Scanner(input);
		tokenizer.useDelimiter(" ");
		ArrayList<Object> arr = new ArrayList<Object>();
		while (tokenizer.hasNext()) {
			arr.add(tokenizer.next());
//			System.out.println(arr.get(arr.size() - 1));
		}
		System.out.println(arr);

	}
}
