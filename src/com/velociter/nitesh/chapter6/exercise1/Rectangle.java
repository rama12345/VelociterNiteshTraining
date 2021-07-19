package com.velociter.nitesh.chapter6.exercise1;

public class Rectangle extends Shape{
	int weight,height,length;
	float areaOfRectangle,volumnOfRectangle;
	 public Rectangle(int weight, int height,int length) {
		super();
		this.weight = weight;
		this.height = height;
		this.length = length;
	}
	 @Override
	 public void area() {
	 	areaOfRectangle =weight*height;
	 }
	 @Override
	 public void volume() {
		 volumnOfRectangle=length*height*weight;
	 }
	@Override
	public void show() {
		System.out.println("Area Of Rectangle : "+areaOfRectangle);
		System.out.println("Volumn of Rectangle : "+volumnOfRectangle);
	}
	@Override
	public String toString() {
		return "Rectangle [weight=" + weight + ", height=" + height + ", length=" + length + ", areaOfRectangle="
				+ areaOfRectangle + ", volumnOfRectangle=" + volumnOfRectangle + "]";
	}
	public static void main(String[]args) {
		Rectangle rc = new Rectangle(5, 12, 6);
		rc.area();
		rc.volume();
		rc.show();
	}
}
