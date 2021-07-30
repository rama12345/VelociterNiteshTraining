package com.velociter.nitesh.chapter13.exercise2;

import java.util.ArrayList;

//user defined class for generic stack
class StackList<T> {
	// Empty array list
	ArrayList<T> arrayList;
	
	// Default value of top variable when stack is empty
	int top = -1;
	
	// Variable to store size of array
	int size;

	// Constructor of this class
	// To initialize stack
	StackList(int size) {
		// Storing the value of size into global variable
		this.size = size;
	
		// Creating array of Size = size
		this.arrayList = new ArrayList<T>(size);
	}

	// Method 1
	// To push generic element into stack
	void push(T X) {
		// Checking if array is full
		if (top + 1 == size) {

			// Display message when array is full
			System.out.println("Stack Overflow");
		} else {
			// Increment top to go to next position
			top = top + 1;
			// Over-writing existing element
			if (arrayList.size() > top)
				arrayList.set(top, X);
			else
				// Creating new element
				arrayList.add(X);
		}
	}

	// Method 2
	// To return topmost element of stack
	T top() {
		// If stack is empty
		if (top == -1) {
			// Display message when there are no elements in
			// the stack
			System.out.println("Stack Underflow");
			return null;
		}
		// else elements are present so
		// return the topmost element
		else
			return arrayList.get(top);
	}

	// Method 3
	// To delete last element of stack
	void pop() {
		// If stack is empty
		if (top == -1) {
			// Display message when there are no elements in
			// the stack
			System.out.println("Stack Underflow");
		} else
			// Delete the last element
			// by decrementing the top
			top--;
	}

	// Method 4
	// To check if stack is empty or not
	boolean empty() {
		return top == -1;
	}
	
	// Method 5
	// to find out the list of all elements.
	public void listAll(StackList<T> list) {
		// to iterate at the end of list size.
		for(int i=0;i<arrayList.size();i++) {
			// get the value from array.
			System.out.print(" "+String.valueOf(arrayList.get(i)));
		}
	}

	// Method 5
	// To print the stack
	// @Override
	public String toString() {
		String Ans = "";
		for (int i = 0; i < top; i++) {
			Ans += String.valueOf(arrayList.get(i)) + "->";
		}
		Ans += String.valueOf(arrayList.get(top));
		return Ans;
	}
}