package com.velociter.nitesh.chapter6.exercise4;

public class LinkedList {
	Node head;

	// function to insert the data
	public void insert(int data) {
		Node node = new Node();
		node.data = data;
		node.next = null;
		if (head == null) {
			head = node;
		} else {
			Node n = head;
			while (n.next != null) {
				n = n.next;
			}
			n.next = node;
		}
	}

	// to delete the data from list
	public void delete(int index) {
		if (index == 0) {
			head = head.next;
		} else {
			Node n = head;
			Node n1 = null;
			for (int i = 0; i < index - 1; i++) {
				n = n.next;
			}
			n1 = n.next;
			n.next = n1.next;
			System.out.println("Deleted Item is : " + n1.data);
		}
	}

	// print the list of data
	public void show() {
		Node node = head;
		while (node.next != null) {
			System.out.print(node.data + "-> ");
			node = node.next;
		}
		System.out.println(node.data);
	}

	// insert the value at the start
	public void insertAtStart(int data) {
		Node node = new Node();
		node.data = data;
		node.next = head;
		head = node;
	}

	// insert the value
	public void insertAt(int index, int data) {
		Node node = new Node();
		node.data = data;
		node.next = head;
		Node n = head;
		for (int i = 0; i < index - 1; i++) {
			n = n.next;
		}
		node.next = n.next;
		n.next = node;
	}

	// function to print the LinkedList
	public void printlist(Node head) {
		Node temp = head;
		System.out.print("Head-> ");
		while (temp != null) {
			System.out.print(temp.data + "-> ");
			temp = temp.next;
		}
		System.out.println("NULL");
	}

	// add new node at the end of the LinkedList
	public void addToTheLast(Node node) {
		if (head == null)
			head = node;
		else {
			Node temp = head;
			while (temp.next != null) {
				temp = temp.next;
			}
			temp.next = node;
		}
	}

	// reverse function
	Node reverse(Node head) {
		Node temp = head, prev = null, n = head.next;
		while (n != null) {
			temp.next = prev; // changing link of node
			prev = temp;
			temp = n;
			n = n.next;
		}
		temp.next = prev;
		head = temp;
		return head;
	}

}