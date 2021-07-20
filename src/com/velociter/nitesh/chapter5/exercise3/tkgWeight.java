package com.velociter.nitesh.chapter5.exercise3;

public class tkgWeight {
	public static final double TN_PER_KG = 0.00098421;
	public static final int GM_PER_TN = 1016;
	public static final int TN_PER_GM = 1000;

	// Private member variables:
	private int ton = 0;
	private int kilograme = 0;
	private int gram = 0;

	// Constructors:
	public tkgWeight(double km) {
		this((int) Math.round(km * GM_PER_TN));
	}

	// If we were to just store the argument values, we could
	// end up with invalid tn and gm values in the object if the
	// values passed as arguments are not valid.
	// With the approach here we guarantee all values are valid
	// in the object that is created.
	public tkgWeight(int gm) {
		ton = gm / TN_PER_GM;
		kilograme = (gm - ton * TN_PER_GM) / GM_PER_TN;
		gram = gm - ton * TN_PER_GM - kilograme * GM_PER_TN;
	}

	public tkgWeight(int tn, int kg, int gm) {
		this(tn * TN_PER_GM + kg * GM_PER_TN + gm);
	}

	public tkgWeight() {
	}

	// Methods
	// Replaces the default toString method in Object:
	public String toString() {
		return Integer.toString(ton) + "tn " + kilograme + "km " + gram + "gm";
	}

	public int toGM() {
		return ton * TN_PER_GM + kilograme * GM_PER_TN + gram;
	}

	public double toTons() {
		return ton + ((double) (kilograme)) / TN_PER_KG + ((double) (gram)) / TN_PER_GM;
	}

	// All of the following methods use the toMM():
	public tkgWeight add(tkgWeight length) {
		return new tkgWeight(toGM() + length.toGM());
	}

	public tkgWeight subtract(tkgWeight length) {
		return new tkgWeight(toGM() - length.toGM());
	}

	public tkgWeight multiply(int n) {
		return new tkgWeight(n * toGM());
	}

	public tkgWeight divide(int y) {
		return new tkgWeight(toGM() / y);
	}

	// Calculate area in square gm
	public long area(tkgWeight length) {
		return (toGM() * length.toGM());
	}

	// Compare two lengths
	// Return value is 1 if current greater than arg
	// 0 if current equal to arg
	// -1 if current less than arg
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
