package com.velociter.nitesh.chapter13.exercise2;

public class StackListImpl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*------------------- Integer Stack--------------------------*/
		// Creating an object of Stack class
		// Declaring objects of Integer type
		StackList<Integer> stackList1 = new StackList<Integer>(4);
		// Pushing elements to integer stack - stackList1
		stackList1.push(10);
		stackList1.push(20);
		stackList1.push(30);		
		stackList1.push(40);
		// Print the stack elements after pushing the
		System.out.println("stackList after pushing 10, 20, 30 and 40 of integer :\n" + stackList1);
		// Now, pop from stack stackList1
		stackList1.pop();
		// Print the stack elements after poping few
		System.out.println("stackList after pop of integer :\n" + stackList1);
		
		/*------------------- String Stack--------------------------*/
		// Creating an object of Stack class
		// Declaring objects of Integer type
		StackList<String> stackList2 = new StackList<String>(4);
		// Pushing elements to string stack - stackList2
		stackList2.push("hello");
		stackList2.push("world");
		stackList2.push("java");	
		stackList2.push("python");
		// Print string stack after pushing above string
		System.out.println("\nstackList after pushing 3 elements of string :\n" + stackList2);
		
		System.out.println("\n");
		System.out.println("-------------List Of All Elements------------");
		System.out.print("List of All Integers : ");
		// show the all list of integer
		stackList1.listAll(stackList1);
		System.out.print("\nList of All Strings : ");
		// show the all list of string
		stackList2.listAll(stackList2);
	}

}
