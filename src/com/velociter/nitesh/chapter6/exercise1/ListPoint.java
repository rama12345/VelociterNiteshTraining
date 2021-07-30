package com.velociter.nitesh.chapter6.exercise1;

public class ListPoint {
	
	// Constructor Of ListPoint with argument
	public ListPoint(Point point) {
		this.point = point;
		next = null;
	}
	
	// set the value of point
	public void setNext(ListPoint next) {
		this.next = next;
	}
	
	// get the value of point
	public ListPoint getNext() {
		return next;
	}

	public String toString() {
		return "(" + point + ")";
	}
	
	// declaring of two point which is list or point.
	private ListPoint next;
	private Point point;
}
