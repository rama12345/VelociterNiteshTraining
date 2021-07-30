package com.velociter.nitesh.chapter2;

public class CalculateVolumeRatio {

	public static void main(String[] args) {
		double sunRadius = 865000.0 / 2.0; // Sun radius in miles is half the diameter
		double earthRadius = 7600.0 / 2.0; // Earth radius likewise
		double sunVolume = 0;
		double earthVolume = 0;
		double ratioVolume = 0;
		
		// Find the volumes of earth and sun:
		earthVolume = (4.0 / 3.0) * Math.PI * Math.pow(earthRadius, 3);
		sunVolume = (4.0 / 3.0) * Math.PI * Math.pow(sunRadius, 3);
		
		// Find the ratio of their volumes:
		ratioVolume = sunVolume / earthVolume;
		
		// Output the results:
		System.out.println("Volume of the earth is " + earthVolume + " cubic miles");
		System.out.println("Volume of the sun is " + sunVolume + " cubic miles");
		System.out.println("The sun's volume is " + ratioVolume + " times greater than the earth's.");
	}
}
