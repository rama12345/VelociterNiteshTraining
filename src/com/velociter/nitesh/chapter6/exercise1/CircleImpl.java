package com.velociter.nitesh.chapter6.exercise1;

public class CircleImpl extends ShapeFactory {
	double areaOfCircle,radius;
	
	//create constructor Of Circle
	public CircleImpl(double areaOfCircle, double radius) {
		super();
		this.areaOfCircle = areaOfCircle;
		this.radius = radius;
	}
	
	@Override
	public void area() {
		areaOfCircle=(22*radius*radius)/7;
	}

	@Override
	public void volume() {
	}

	@Override
	public String toString() {
		return "Circle [areaOfCircle=" + areaOfCircle + ", radius=" + radius + "]";
	}

	@Override
	public void show() {
		// show the result of area
		System.out.println("Area Of Circle : "+areaOfCircle);
	}
	
	public static void main(String[] args) {
		CircleImpl circle = new CircleImpl(15,5);
		circle.area();
		circle.show();
	}

}
