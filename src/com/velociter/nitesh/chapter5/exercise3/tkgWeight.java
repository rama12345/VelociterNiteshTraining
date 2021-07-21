package com.velociter.nitesh.chapter5.exercise3;

public class tkgWeight {
	public static final double TonPerKilogram = 0.00098421;
	public static final int GramPerTon = 1016;
	public static final int TonPerGram = 1000;

	// Private member variables:
	private int ton = 0;
	private int kilograme = 0;
	private int gram = 0;

	// Constructors:
	public tkgWeight(double kilogram) {
		this((int) Math.round(kilogram * GramPerTon));
	}

	// If we were to just store the argument values, we could
	// end up with invalid tn and gm values in the object if the
	// values passed as arguments are not valid.
	// With the approach here we guarantee all values are valid
	// in the object that is created.
	public tkgWeight(int gram) {
		ton = gram / TonPerGram;
		kilograme = (gram - ton * TonPerGram) / GramPerTon;
		gram = gram - ton * TonPerGram - kilograme * GramPerTon;
	}

	public tkgWeight(int ton, int kilogram, int gram) {
		this(ton * TonPerGram + kilogram * GramPerTon + gram);
	}

	public tkgWeight() {
	}

	// Methods
	// Replaces the default toString method in Object:
	public String toString() {
		return Integer.toString(ton) + "ton " + kilograme + "kilogram " + gram + "gram";
	}

	public int toGram() {
		return ton * TonPerGram + kilograme * GramPerTon + gram;
	}

	public double toTons() {
		return ton + ((double) (kilograme)) / TonPerKilogram + ((double) (gram)) / TonPerGram;
	}

	// All of the following methods use the toMM():
	public tkgWeight add(tkgWeight length) {
		return new tkgWeight(toGram() + length.toGram());
	}

	public tkgWeight subtract(tkgWeight length) {
		return new tkgWeight(toGram() - length.toGram());
	}

	public tkgWeight multiply(int n) {
		return new tkgWeight(n * toGram());
	}

	public tkgWeight divide(int y) {
		return new tkgWeight(toGram() / y);
	}

	// Calculate area in square gm
	public long area(tkgWeight length) {
		return (toGram() * length.toGram());
	}

	// Compare two lengths
	// Return value is 1 if current greater than arg
	// 0 if current equal to arg
	// -1 if current less than arg
	public int compare(tkgWeight length) {
		return greaterThan(length) ? 1 : (equals(length) ? 0 : -1);
	}

	public boolean equals(tkgWeight length) {
		return toGram() == length.toGram();
	}

	public boolean lessThan(tkgWeight length) {
		return toGram() < length.toGram();
	}

	public boolean greaterThan(tkgWeight length) {
		return toGram() > length.toGram();
	}
}
