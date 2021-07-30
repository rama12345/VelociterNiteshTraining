package com.velociter.nitesh.chapter6.exercise1;

public class LineImpl extends ShapeFactory{
	public static String randXYPoint(){
	    
		//For x and y, the maximum point is 1 and Minimum point is -1
	    //maximum number
	    int min = 0;
	    
	    //minimum number
	    int max = 100;

	    // generates x values
	    double xValue = min + Math.random() * (max - min);
	    
	    // generates y values
	    double yValue = min + Math.random() * (max - min);
	    
	    //returns and converts points to string 
	    return  String.valueOf(xValue)+ ", "+ String.valueOf(yValue);
	}
	
	@Override
	public void area() {
		
	}

	@Override
	public void volume() {
		
	}

	@Override
	public void show() {
		
	}
	
	public static void main(String[]args) {
		System.out.println(randXYPoint());
	}
	
}
