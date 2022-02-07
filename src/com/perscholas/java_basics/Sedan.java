package com.perscholas.java_basics;

public class Sedan extends Car {

	private int length;
	
	public Sedan(int speed, double regularPrice, String color, int length) {
		super(speed, regularPrice, color);
		this.length = length;
	}
	
	public double getSalePrice() {
		if (length > 20)
			return 0.95 * regularPrice;
		else
			return 0.9 * regularPrice;
	}
	
}
