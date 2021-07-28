package com.velociter.nitesh.chapter2;

public class CalculateIncomeTax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double income = 10000.00;
	    double taxRate = 0.35; // 35%  corresponds to 0.35
	    double taxAmount = income*taxRate;
	    int taxDollars = (int)taxAmount;
	    // find the randon number of taxCents
	    int taxCents = (int)Math.round((taxAmount - taxDollars));
	    // Overall gross income in doller
	    System.out.println("Gross income is $" + (int)income +"." + (int)Math.round((income - (int)income)));
	    // final resulting tax pay in doller and taxCents in cents
	    System.out.println("Tax to pay is " + taxDollars + " dollars and " + taxCents + " cents.");
	}

}
