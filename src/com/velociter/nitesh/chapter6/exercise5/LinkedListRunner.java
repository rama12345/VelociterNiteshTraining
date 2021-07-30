package com.velociter.nitesh.chapter6.exercise5;

public class LinkedListRunner {
	public static void main(String[] args) {
		
		// creating the object of linkedList
		LinkedList lit = new LinkedList();
		
		// insert the value to list and there position
		lit.insert(10);
		lit.insert(20);
		lit.insert(30);
		lit.insert(40);
		lit.show();
		lit.insertAt(4, 88);
		lit.insertAtStart(8);
		lit.show();
	}
}
