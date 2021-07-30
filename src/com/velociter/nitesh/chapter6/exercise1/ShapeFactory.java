package com.velociter.nitesh.chapter6.exercise1;

public abstract class ShapeFactory {
	protected int x;
	protected int y;
	
	// area and volume find out from shape
	abstract public void area();
	abstract public void volume();
	
	// get the result from show
	abstract public void show();
}
