package com.velociter.nitesh.chapter5.exercise1;

public class Point {
	private double x;
	private double y;

	public Point(double x, double y) {
		this.x = x;
		this.y = y;
	}

	public Point(Point p) {
		x = p.x;
		y = p.y;
	}

	double getX() {
		return x;
	}

	double getY() {
		return y;
	}

	public String toString() {
		return x + "," + y;
	}
}