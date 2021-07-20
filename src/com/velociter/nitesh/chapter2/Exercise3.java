package com.velociter.nitesh.chapter2;

public class Exercise3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double income = 10000.00;
	    double taxRate = 0.35; // 35%  corresponds to 0.35
	    double tax = income*taxRate;
	    int taxDollars = (int)tax;
	    // find the randon number of taxCents
	    int taxCents = (int)Math.round((tax - taxDollars));
	    // Overall gross income in doller
	    System.out.println("Gross income is $" + (int)income +"." + (int)Math.round((income - (int)income)));
	    // final resulting tax pay in doller and taxCents in cents
	    System.out.println("Tax to pay is " + taxDollars + " dollars and " + taxCents + " cents.");
	}

}
