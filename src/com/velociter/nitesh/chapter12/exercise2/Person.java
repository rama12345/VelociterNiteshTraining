package com.velociter.nitesh.chapter12.exercise2;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// implements the serializable to write an object to file.
public class Person implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String name;
	private String address;

	// create function to get the name and address from user.
	public void setDetails() {
		Scanner input = new Scanner(System.in);
		
//		List<String> list1 = new ArrayList<String>();
//		list1.add("Jhone");
//		list1.add("Jim");
		
//		List<String> list2 = new ArrayList<String>();
//		list2.add("USA");
//		list2.add("CA");

		System.out.println("Enter Names : ");
		String names = input.nextLine();
		Scanner tokenizer = new Scanner(names);
		tokenizer.useDelimiter(" ");
		ArrayList<String> arr = new ArrayList<String>();
		while (tokenizer.hasNext()) {
			arr.add(tokenizer.next());
//			System.out.println(arr.get(arr.size() - 1));
		}
		System.out.println(arr);
		
		System.out.println("Enter Names : ");
		String address = input.nextLine();
		Scanner tokenizerAdd = new Scanner(names);
		tokenizer.useDelimiter(" ");
		ArrayList<String> arr1 = new ArrayList<String>();
		while (tokenizerAdd.hasNext()) {
			arr1.add(tokenizerAdd.next());
//			System.out.println(arr.get(arr.size() - 1));
		}
		System.out.println(arr1);
		
		
		// using addAll( ) method to concatenate the lists
		List<String> concatenated_list = new ArrayList<String>();
		concatenated_list.addAll(arr);
		concatenated_list.addAll(arr1);
		System.out.println("Name : " + arr + " Address : " + arr1);
	}

	// display the name and address from user.
	public String showDetails() {
		return "Person Name is : " + name + "\n" + "Person Address is : " + address;
	}
}
