package com.perscholas.java_basics;

public class Ford extends Car {

	private int year, manufacturerDiscount;
	
	public Ford(int speed, double regularPrice, String color, int year, int manufacturerDiscount) {
		super(speed, regularPrice, color);
		this.year = year;
		this.manufacturerDiscount = manufacturerDiscount;
	}
	
	public double getSalePrice() {
		return regularPrice - manufacturerDiscount;
	}
	
}
