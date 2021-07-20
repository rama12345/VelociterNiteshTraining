package com.velociter.nitesh.chapter6.exercise2;

import com.velociter.nitesh.chapter6.exercise1.Point;
import com.velociter.nitesh.chapter6.exercise1.PolyLine;

public class TryPolyLine {
	public static void main(String[] args) {
		// Create an array of coordinate pairs
		double[][] coordinates = { { 1., 1. }, { 1., 2. }, { 2., 3. }, { -3., 5. }, { -5., 1. }, { 0., 0. } };
		// Create a polyline from the coordinates and display it
		PolyLine polygon = new PolyLine(coordinates);
		System.out.println(polygon);
		// Add a point and display the polyline again
		polygon.addPoint(10., 10.);
		System.out.println(polygon);
		// Create Point objects from the coordinate array
		Point[] points = new Point[coordinates.length];
		for (int i = 0; i < points.length; i++)
			points[i] = new Point(coordinates[i][0], coordinates[i][1]);
		// Use the points to create a new polyline and display it
		PolyLine newPoly = new PolyLine(points);
		System.out.println(newPoly);
	}
}
