package com.velociter.nitesh.chapter6.exercise1;

public class Circle extends Shape {
	double areaOfCircle,radius;
	//create constructor Of Circle
	public Circle(double areaOfCircle, double radius) {
		super();
		this.areaOfCircle = areaOfCircle;
		this.radius = radius;
	}
	
	@Override
	public void area() {
		// TODO Auto-generated method stub
		areaOfCircle=(22*radius*radius)/7;
	}

	@Override
	public void volume() {
		// TODO Auto-generated method stub
	}

	@Override
	public String toString() {
		return "Circle [areaOfCircle=" + areaOfCircle + ", radius=" + radius + "]";
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		// show the result of area
		System.out.println("Area Of Circle : "+areaOfCircle);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle cir = new Circle(15,5);
		cir.area();
		cir.show();
	}

}
