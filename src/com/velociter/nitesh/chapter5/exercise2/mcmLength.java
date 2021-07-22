package com.velociter.nitesh.chapter5.exercise2;

public class mcmLength {
	  public static final int CentimeterPerMeter = 100;
	  public static final int MillimeterPerCentimeter = 10;
	  public static final int MillimeterPerMeter = MillimeterPerCentimeter*CentimeterPerMeter;
	 
	  // Private member variables:
	  private int meters = 0;
	  private int centimeters = 0;
	  private int millimeters = 0;
	 
	  // Constructors:
	  public mcmLength(double centimeter) {
	    this((int)Math.round(centimeter*MillimeterPerCentimeter));
	  }
	 
	  public mcmLength(int millimeter) {
	    meters = millimeter/MillimeterPerCentimeter;
	    centimeters = (millimeter - meters*MillimeterPerCentimeter)/MillimeterPerCentimeter;
	    millimeters = millimeter - meters*MillimeterPerCentimeter - centimeters*MillimeterPerCentimeter;
	  }
	 
	  // If we were to just store the argument values, we could
	  // end up with invalid mm and cm values in the object if the
	  // values passed as arguments are not valid.
	  // With the approach here we guarantee all values are valid
	  // in the object that is created.
	  public mcmLength(int meter, int centimeter, int millimeter) {
	    this(meter*MillimeterPerCentimeter + centimeter*MillimeterPerCentimeter + millimeter);
	  }
	 
	  public mcmLength(){}
	 
	  // Methods
	  // Replaces the default toString method in Object:
	  public String toString() {
	    return Integer.toString(meters) + "m " + centimeters + "cm " + millimeters + "mm";
	  }
	 
	  public int toMilliMeter() {
	    return meters*MillimeterPerCentimeter + centimeters*MillimeterPerCentimeter + millimeters;
	  }
	 
	 
	  public double toMeters() {
	    return meters + ((double)(centimeters))/CentimeterPerMeter + ((double)(millimeters))/MillimeterPerCentimeter;
	  }
	 
	  // All of the following methods use the toMM():
	  public mcmLength add(mcmLength length)
	  {
	    return new mcmLength(toMilliMeter()+length.toMilliMeter());
	  }
	 
	  public mcmLength subtract(mcmLength length)
	  {
	    return new mcmLength(toMilliMeter()-length.toMilliMeter());
	  }
	 
	  public mcmLength multiply(int n)
	  {
	    return new mcmLength(n*toMilliMeter());
	  }
	 
	  public mcmLength divide(int y)
	  {
	    return new mcmLength(toMilliMeter()/y);
	  }
	 
	  //Calculate area in square mm
	  public long area(mcmLength length) {
	    return (toMilliMeter()*length.toMilliMeter());
	  }
	 
	  // Compare two lengths
	  // Return value is 1 if current greater than arg
	  //                 0 if current equal to arg
	  //                -1 if current less than arg
	  public int compare(mcmLength length) {
	    return greaterThan(length) ? 1 : (equals(length) ? 0 : -1);
	  }
	 
	  public boolean equals(mcmLength length) {
	   return toMilliMeter() == length.toMilliMeter();
	  }
	 
	  public boolean lessThan(mcmLength length) {
	   return toMilliMeter() < length.toMilliMeter();
	  }
	 
	  public boolean greaterThan(mcmLength length) {
	   return toMilliMeter() > length.toMilliMeter();
	  }
}
