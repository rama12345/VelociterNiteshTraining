package com.velociter.nitesh.chapter6.exercise2;

public class PolyLine {
	
	// Construct a polyline from an array of coordinate pairs
	public PolyLine(double[][] coordinates) {
		Point[] points = new Point[coordinates.length]; // Array to hold points
	
		// Create points from the coordinates
		for (int i = 0; i < coordinates.length; i++) {
			points[i] = new Point(coordinates[i][0], coordinates[i][1]);
		}
		
		// Create the polyline from the array of points
		polyline = new ShapeList(points);
	}

	// Construct a polyline from an array of points
	public PolyLine(Point[] points) {
		polyline = new ShapeList(points); // Create the polyline
	}

	// Add a Point object to the list
	public void addPoint(Point point) {
		polyline.addItem(point); // Add the point to the list
	}

	// Add a point from a coordinate pair to the list
	public void addPoint(double x, double y) {
		polyline.addItem(new Point(x, y)); // Add the point to the list
	}

	// String representation of a polyline
	public String toString() {
		StringBuffer str = new StringBuffer("Polyline:");
		Point point = (Point) polyline.getFirst();
		// Set the 1st point as start
		while (point != null) {
			str.append("(" + point + ")"); // Append the current point
			point = (Point) polyline.getNext(); // Make the next point current
		}
		return str.toString();
	}

	private ShapeList polyline; // The linked list of points
}
