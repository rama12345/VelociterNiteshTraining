package com.velociter.nitesh.chapter2;
public class Exercise2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		double d = 1234.5678;
//	    String bob = Double.toString(d);
//	    String[] convert = bob.split("\\.");
//	    short a = Short.parseShort(convert[0]);
//	    long b = Long.parseLong(convert[1]);
//	    System.out.println("Short Value is: "+a); 
//	    System.out.println("Long Value is: "+b); 
	    
		double doubleNumber = 1234.5678;
		short shortNumber = (short)doubleNumber;
		System.out.println(shortNumber);
		long longNumber = (long) (doubleNumber%1.0 * 10000);		
		System.out.println(longNumber);
	    
//	    double number = 1234.5678; // you have this
//	    long decimal = (int) number; // you have 12345
//	    short fractional = (short)(int)Math.round((number - decimal) * 1000); // you have 0.6789
//	    System.out.println(decimal);
//	    System.out.println(fractional);
		
//		double number = 1234.5678;
//		String numberStr = Double.toString(number);
//		String fractionalStr = numberStr.substring(numberStr.indexOf('.')+1);
//		Integer fractional = Integer.valueOf(fractionalStr); 
//		System.out.println(numberStr);
//	    System.out.println(fractional);
	}
}
