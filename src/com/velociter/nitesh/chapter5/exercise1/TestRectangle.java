package com.velociter.nitesh.chapter5.exercise1;

public class TestRectangle {
	public static void main(String args[]) {
		Rectangle[] rectangles = new Rectangle[4];
		Rectangle enclosing;

		// Initialize the rectangles as arbitrary sizes and at arbitrary positions:
		for (int i = 0; i < rectangles.length; ++i) {
			rectangles[i] = new Rectangle(Math.random() * 100, Math.random() * 100, Math.random() * 100,
					Math.random() * 100);
			System.out.print("Coords of rectangle " + i + " are: ");
			System.out.println(rectangles[i]);
		}

		// Initialize the enclosing rectangle to be first rectangle
		enclosing = rectangles[0];

		// Combine it with each the other rectangles in turn.
		// This will result in the rectangle that encloses them all.
		for (Rectangle rect : rectangles) {
			enclosing = enclosing.encloses(rect);
		}

		System.out.println("\nCoords of Enclosing rectangle are ");
		System.out.println(enclosing);
	}
}