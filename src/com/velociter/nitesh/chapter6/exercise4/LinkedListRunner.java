package com.velociter.nitesh.chapter6.exercise4;

import java.util.Scanner;

public class LinkedListRunner {
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		Scanner input = new Scanner(System.in);
	    System.out.println("Enter the size of linklist");
	    int numberOfInput = input.nextInt();
	    System.out.println("Enter the integer data in linklist");
	    int InputOfNodes = input.nextInt();
	    Node head = new Node(InputOfNodes);
	    list.addToTheLast(head);// add head to linkedlist
	    for (int i = 1; i < numberOfInput; i++) {  //add remaining nodes
	      int ValuesOfNodes = input.nextInt();
	      list.addToTheLast(new Node(ValuesOfNodes));
	    }
	    System.out.println("Before reversing"); 
	    list.printlist(head);
	    Node head2 = null;
	    System.out.println("After reversing");
	    head2 = list.reverse(head);
	    list.printlist(head2);


	}
}
