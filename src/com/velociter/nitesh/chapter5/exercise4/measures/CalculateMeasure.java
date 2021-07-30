package com.velociter.nitesh.chapter5.exercise4.measures;

public class CalculateMeasure {
	public static void main(String args[]) {
		double totalTwoHundredCarpetsWeight, totalSixtyCarpetWeight;
		int meter = 2, carpetInMeter = 57;
		int carpets = 200, noOfCarpets = 60;
		int size = 4;
		int centimeter = 9, carpetINcentimeter = 5;
		
		// find out the square root the weight
		double weight = Math.sqrt(1.25) / 100;
		
		// converting meter in centimeter
		double convertIntoCentimeter = meter / 100;
		
		// find out the average of weight
		double calculateWeight = (double) (centimeter + weight + convertIntoCentimeter) * size;
		System.out.println("calculate Weight is:" + calculateWeight);
		totalTwoHundredCarpetsWeight = calculateWeight * carpets;
		System.out.println("Total 200 carpet weight is:" + totalTwoHundredCarpetsWeight);
		
		// find out the square root the carpet weight
		double carpetWeight = Math.sqrt(1.05) / 100;
		
		// converting meter in centimeter
		double meterconvertIntoCentimeter = carpetInMeter / 100;
		
		// find out the average of weight
		double calculateTotalWeight = (double) (carpetINcentimeter + carpetWeight + meterconvertIntoCentimeter) * size;
		System.out.println("calculate Another carpet Weight is:" + calculateTotalWeight);
		totalSixtyCarpetWeight = calculateTotalWeight * noOfCarpets;
		System.out.println("Total 60 carpet weight is:" + totalSixtyCarpetWeight);

	}
}
