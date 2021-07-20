package com.velociter.nitesh.chapter6.exercise3;

interface Shape {
	// abstract method
	void draw();

	double area();
}

class Rectangle implements Shape {
	int length, width;

	// constructor
	Rectangle(int length, int width) {
		this.length = length;
		this.width = width;
	}

	public void draw() {
		// draw rectangle
		System.out.println("Rectangle has been drawn ");
	}

	public double area() {
		// calculate the area of rectangle - length*width
		return (double) (length * width);
	}
}

class Circle implements Shape {

	double pi = 3.14;
	int radius;

	// constructor
	Circle(int radius) {
		this.radius = radius;
	}

	public void draw() {
		// draw circle
		System.out.println("Circle has been drawn ");
	}

	public double area() {
		// calculate the area of circle - 3.14*r*r/2
		return (double) ((pi * radius * radius) / 2);
	}
}

class ShapeExample {
	public static void main(String[] args) {

		// creating the Object of Rectangle class
		// and using shape interface reference.
		Shape rect = new Rectangle(2, 3);
		System.out.println("Area of rectangle: " + rect.area());

		// creating the Objects of circle class
		Shape circle = new Circle(2);
		System.out.println("Area of circle: " + circle.area());
	}
}
