package com.velociter.nitesh.chapter6.exercise1;

public class RectangleImpl extends ShapeFactory {
	int weight, height, length;
	float areaOfRectangle, volumneOfRectangle;

	// constructor with three arguments
	public RectangleImpl(int weight, int height, int length) {
		super();
		this.weight = weight;
		this.height = height;
		this.length = length;
	}

	@Override
	public void area() {
		// find the area of rectangle
		areaOfRectangle = weight * height;
	}

	@Override
	public void volume() {
		// find the volume of rectangle
		volumneOfRectangle = length * height * weight;
	}

	@Override
	public void show() {
		System.out.println("Area Of Rectangle : " + areaOfRectangle);
		System.out.println("Volumn of Rectangle : " + volumneOfRectangle);
	}

	@Override
	public String toString() {
		return "Rectangle [weight=" + weight + ", height=" + height + ", length=" + length + ", areaOfRectangle="
				+ areaOfRectangle + ", volumnOfRectangle=" + volumneOfRectangle + "]";
	}

	public static void main(String[] args) {
		// create an object of rectangle and pass argument
		RectangleImpl rectangle = new RectangleImpl(5, 12, 6);
		rectangle.area();
		rectangle.volume();
		rectangle.show();
	}
}
