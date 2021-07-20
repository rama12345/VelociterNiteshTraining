package com.velociter.nitesh.chapter6.exercise6;

public class LinkedListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// create the object1 of LinkedList 
		LinkedList lit = new LinkedList();
		// insert the value in object1
		lit.insert(10);
		lit.insert(20);
		lit.insert(30);
		lit.insert(40);
		lit.show();
		// create the object2 of LinkedList 
		LinkedList lit1 = new LinkedList();
		// insert the value in object2
		lit1.insert(10);
		lit1.insert(20);
		lit1.insert(30);
		lit1.insert(40);
		lit1.show();
		//check the condition of equality is true false
		System.out.println(lit.equals(lit1));
		//check the condition of equality with another object is true false
		LinkedList lit2 = lit;
		System.out.println(lit.equals(lit2));
	}

}
