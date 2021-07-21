package com.velociter.nitesh.chapter5.exercise2;

public class mcmLength {
	  public static final int CentimiterPerMetter = 100;
	  public static final int MillimetterPerCentimiter = 10;
	  public static final int MillimetterPerMetter = MillimetterPerCentimiter*CentimiterPerMetter;
	 
	  // Private member variables:
	  private int meters = 0;
	  private int centimeters = 0;
	  private int millimeters = 0;
	 
	  // Constructors:
	  public mcmLength(double centimetter) {
	    this((int)Math.round(centimetter*MillimetterPerCentimiter));
	  }
	 
	  public mcmLength(int millimetter) {
	    meters = millimetter/MillimetterPerCentimiter;
	    centimeters = (millimetter - meters*MillimetterPerCentimiter)/MillimetterPerCentimiter;
	    millimeters = millimetter - meters*MillimetterPerCentimiter - centimeters*MillimetterPerCentimiter;
	  }
	 
	  // If we were to just store the argument values, we could
	  // end up with invalid mm and cm values in the object if the
	  // values passed as arguments are not valid.
	  // With the approach here we guarantee all values are valid
	  // in the object that is created.
	  public mcmLength(int metter, int centimetter, int millimetter) {
	    this(metter*MillimetterPerCentimiter + centimetter*MillimetterPerCentimiter + millimetter);
	  }
	 
	  public mcmLength(){}
	 
	  // Methods
	  // Replaces the default toString method in Object:
	  public String toString() {
	    return Integer.toString(meters) + "m " + centimeters + "cm " + millimeters + "mm";
	  }
	 
	  public int toMilliMetter() {
	    return meters*MillimetterPerCentimiter + centimeters*MillimetterPerCentimiter + millimeters;
	  }
	 
	 
	  public double toMeters() {
	    return meters + ((double)(centimeters))/CentimiterPerMetter + ((double)(millimeters))/MillimetterPerCentimiter;
	  }
	 
	  // All of the following methods use the toMM():
	  public mcmLength add(mcmLength length)
	  {
	    return new mcmLength(toMilliMetter()+length.toMilliMetter());
	  }
	 
	  public mcmLength subtract(mcmLength length)
	  {
	    return new mcmLength(toMilliMetter()-length.toMilliMetter());
	  }
	 
	  public mcmLength multiply(int n)
	  {
	    return new mcmLength(n*toMilliMetter());
	  }
	 
	  public mcmLength divide(int y)
	  {
	    return new mcmLength(toMilliMetter()/y);
	  }
	 
	  //Calculate area in square mm
	  public long area(mcmLength length) {
	    return (toMilliMetter()*length.toMilliMetter());
	  }
	 
	  // Compare two lengths
	  // Return value is 1 if current greater than arg
	  //                 0 if current equal to arg
	  //                -1 if current less than arg
	  public int compare(mcmLength length) {
	    return greaterThan(length) ? 1 : (equals(length) ? 0 : -1);
	  }
	 
	  public boolean equals(mcmLength length) {
	   return toMilliMetter() == length.toMilliMetter();
	  }
	 
	  public boolean lessThan(mcmLength length) {
	   return toMilliMetter() < length.toMilliMetter();
	  }
	 
	  public boolean greaterThan(mcmLength length) {
	   return toMilliMetter() > length.toMilliMetter();
	  }
}
