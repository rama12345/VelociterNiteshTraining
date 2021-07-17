package com.velociter.nitesh.chapter5.exercise4.measures;

public class CalculateMeasure {
	public static void main(String args[]) {
		double totalTwoHundredCarpetsWeight, totalSixtyCarpetWeight;
		int meter = 2, carpetInMeter = 57;
		int carpets = 200, noOfCarpets = 60;
		int size = 4, carpetSize = 3;
		int centimeter = 9, carpetINcentimeter = 5;
		double weight = Math.sqrt(1.25) / 100;
		double convertIntoCentimeter = meter / 100;
		double calculateWeight = (double) (centimeter + weight + convertIntoCentimeter) * size;
		System.out.println("calculate Weight is:" + calculateWeight);
		totalTwoHundredCarpetsWeight = calculateWeight * carpets;
		System.out.println("Total 200 carpet weight is:" + totalTwoHundredCarpetsWeight);
		double carpetWeight = Math.sqrt(1.05) / 100;
		double meterconvertIntoCentimeter = carpetInMeter / 100;
		double calculateTotalWeight = (double) (carpetINcentimeter + carpetWeight + meterconvertIntoCentimeter) * size;
		System.out.println("calculate Another carpet Weight is:" + calculateTotalWeight);
		totalSixtyCarpetWeight = calculateTotalWeight * noOfCarpets;
		System.out.println("Total 60 carpet weight is:" + totalSixtyCarpetWeight);

	}
}
