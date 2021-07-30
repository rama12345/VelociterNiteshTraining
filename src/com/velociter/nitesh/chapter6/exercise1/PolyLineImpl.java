package com.velociter.nitesh.chapter6.exercise1;

public class PolyLineImpl extends ShapeFactory{

	// Construct a polyline from an array of points
	public PolyLineImpl(Point[] points) {
		if (points != null) { // Make sure there is an array
			for (Point p : points) {
				addPoint(p);
			}
		}
	}

	// Add a Point object to the list
	public void addPoint(Point point) {
		ListPoint newEnd = new ListPoint(point); // Create a new ListPoint
		if (start == null) {
			start = newEnd; // Start is same as end
		} else {
			end.setNext(newEnd); // Set next variable for old end as new end
		}
		end = newEnd; // Store new point as end
	}

	// String representation of a polyline
	public String toString() {
		StringBuffer str = new StringBuffer("Polyline: ");
		ListPoint nextPoint = start; // Set the 1st point as start
		while (nextPoint != null) {
			str.append(" " + nextPoint); // Output the current point
			nextPoint = nextPoint.getNext(); // Make the next point current
		}
		return str.toString();
	}

	// Construct a polyline from an array of coordinates
	public PolyLineImpl(double[][] coordinates) {
		if (coordinates != null) {
			for (int i = 0; i < coordinates.length; i++) {
				addPoint(coordinates[i][0], coordinates[i][1]);
			}
		}
	}

	// Add a point defined by a coordinate pair to the list
	public void addPoint(double x, double y) {
		addPoint(new Point(x, y));
	}

	private ListPoint start; // First ListPoint in the list
	private ListPoint end; // Last ListPoint in the list
	
	@Override
	public void area() {
		
	}

	@Override
	public void volume() {
		
	}

	@Override
	public void show() {
		
	}
}
