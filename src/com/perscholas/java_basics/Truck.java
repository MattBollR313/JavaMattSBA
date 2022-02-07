package com.perscholas.java_basics;

public class Truck extends Car {
	
	private int weight;
	
	public Truck(int speed, double regularPrice, String color, int weight) {
		super(speed, regularPrice, color);
		this.weight = weight;
	}
	
	public double getSalePrice() {
		if (weight > 2000)
			return 0.9 * regularPrice;
		else
			return 0.8 * regularPrice;
	}
	
}
