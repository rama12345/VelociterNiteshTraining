package com.velociter.nitesh.chapter12.exercise2;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

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
		List<String> list1 = new ArrayList<String>();
		list1.add("Jhone");
		list1.add("Jim");
		List<String> list2 = new ArrayList<String>();
		list2.add("USA");
		list2.add("CA");
		// using addAll( ) method to concatenate the lists
		List<String> concatenated_list = new ArrayList<String>();
		concatenated_list.addAll(list1);
		concatenated_list.addAll(list2);
		System.out.println("Name : " + list1 + " Address : " + list2);
	}

	// display the name and address from user.
	public String showDetails() {
		return "Person Name is : " + name + "\n" + "Person Address is : " + address;
	}
}
