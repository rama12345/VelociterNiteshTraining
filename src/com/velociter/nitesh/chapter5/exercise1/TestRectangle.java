package com.velociter.nitesh.chapter5.exercise1;

public class TestRectangle {
	  public static void main(String args[]) {
	    Rectangle[] rects = new Rectangle[4];
	    Rectangle enclosing;
	 
	    for(int i = 0 ; i < rects.length ; ++i) {
	      rects[i] = new Rectangle(Math.random()*100, Math.random()*100, Math.random()*100, Math.random()*100);
	      System.out.print("Coords of rectangle " + i + " are: ");
	      System.out.println(rects[i]);
	    }
	 
	    enclosing = rects[0];
	 
	    for(Rectangle rect : rects)  {
	      enclosing = enclosing.encloses(rect);
	    }
	 
	    System.out.println("\nCoords of Enclosing rectangle are ");
	    System.out.println(enclosing);
	  }
	}