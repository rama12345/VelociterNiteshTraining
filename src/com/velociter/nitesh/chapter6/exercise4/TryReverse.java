package com.velociter.nitesh.chapter6.exercise4;

import java.util.Iterator;
import java.util.ListIterator;

public class TryReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[][] coords = { { 1., 1. }, { 1., 2. }, { 2., 3. }, { -3., 5. }, { -5., 1. }, { 0., 0. } };
		LinkedList lt = new LinkedList(coords);
		lt.addItem(coords);
		System.out.println(lt.getFirst());
		
		
		
		
		
//		LinkedList lt = new LinkedList();
//		Node n = new Node("One");
//		Node n1 = new Node("Two");
//		Node n2 = new Node("Three");
//		Node n3 = new Node("Four");
//		lt.add(n);
//		lt.add(n1);
//		lt.add(n2);
//		lt.add(n3);
//		System.out.println(lt.peekBack(3));
//		lt.print();
	}
}
