package com.velociter.nitesh.chapter6.exercise2;

public class ShapeList {
	// Default constructor – creates an empty list
	public ShapeList() {
	}

	// Constructor to create a list containing one object
	public ShapeList(Object item) {
		if (item != null) {
			current = end = start = new ShapeItem(item); // item is the start and end
		}
	}

	// Construct a shape list from an array of objects
	public ShapeList(Object[] items) {
		if (items != null) {
			// Add the items to the list
			for (int i = 0; i < items.length; i++) {
				addItem(items[i]);
			}
			current = start;
		}
	}

	// Add an item object to the list
	public void addItem(Object item) {
		ShapeItem newEnd = new ShapeItem(item); // Create a new ListItem
		if (start == null) { // Is the list empty?
			start = end = newEnd; // Yes, so new element is start and end
		} else { // No, so append new element
			end.next = newEnd; // Set next variable for old end
			end = newEnd; // Store new item as end
		}
	}

	// Get the first object in the list
	public Object getFirst() {
		current = start;
		return start == null ? null : start.item;
	}

	// Get the next object in the list
	public Object getNext() {
		if (current != null) {
			current = current.next; // Get the reference to the next item
		}
		return current == null ? null : current.item;
	}

	private ShapeItem start = null; // First ListItem in the list
	private ShapeItem end = null; // Last ListItem in the list
	private ShapeItem current = null; // The current item for iterating

	private class ShapeItem {
		public ShapeItem(Object item) {
			this.item = item;
			next = null;
		}

		public String toString() {
			return "ListItem " + item;
		}

		ShapeItem next;
		Object item;
	}
}
