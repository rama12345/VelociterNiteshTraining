package com.velociter.nitesh.chapter5.exercise3;

public class tkgWeight {
	  public static final double TN_PER_KG = 0.00098421;
	  public static final int GM_PER_TN = 1016;
	  public static final int TN_PER_GM = 1000;
	 
	  private int ton = 0;
	  private int kilograme = 0;
	  private int gram = 0;
	 
	  public tkgWeight(double km) {
	    this((int)Math.round(km*GM_PER_TN));
	  }
	 
	  public tkgWeight(int gm) {
	    ton = gm/TN_PER_GM;
	    kilograme = (gm - ton*TN_PER_GM)/GM_PER_TN;
	    gram = gm - ton*TN_PER_GM - kilograme*GM_PER_TN;
	  }
	  
	  public tkgWeight(int tn, int kg, int gm) {
	    this(tn*TN_PER_GM + kg*GM_PER_TN + gm);
	  }
	 
	  public tkgWeight(){}
	 
	  public String toString() {
	    return Integer.toString(ton) + "tn " + kilograme + "km " + gram + "gm";
	  }
	 
	  public int toGM() {
	    return ton*TN_PER_GM + kilograme*GM_PER_TN + gram;
	  }
	 
	 
	  public double toTons() {
	    return ton + ((double)(kilograme))/TN_PER_KG + ((double)(gram))/TN_PER_GM;
	  }
	 
	  public tkgWeight add(tkgWeight length)
	  {
	    return new tkgWeight(toGM()+length.toGM());
	  }
	 
	  public tkgWeight subtract(tkgWeight length)
	  {
	    return new tkgWeight(toGM()-length.toGM());
	  }
	 
	  public tkgWeight multiply(int n)
	  {
	    return new tkgWeight(n*toGM());
	  }
	 
	  public tkgWeight divide(int y)
	  {
	    return new tkgWeight(toGM()/y);
	  }
	 
	  public long area(tkgWeight length) {
	    return (toGM()*length.toGM());
	  }
	 
	  public int compare(tkgWeight length) {
	    return greaterThan(length) ? 1 : (equals(length) ? 0 : -1);
	  }
	 
	  public boolean equals(tkgWeight length) {
	   return toGM() == length.toGM();
	  }
	 
	  public boolean lessThan(tkgWeight length) {
	   return toGM() < length.toGM();
	  }
	 
	  public boolean greaterThan(tkgWeight length) {
	   return toGM() > length.toGM();
	  }
}
