package com.perscholas.java_basics;

public class MyOwnAutoShop {

	public static void main(String[] args) {
		
		Car sedan = new Sedan(100, 20000.0, "Red", 25);
		Car ford1 = new Ford(80, 30000.0, "Black", 2020, 1000);
		Car ford2 = new Ford(90, 40000.0, "Gray", 2021, 2000);
		Car car = new Car(120, 25000.0, "White");
		System.out.println("Sedan Sale Price: $" + sedan.getSalePrice());
		System.out.println("Ford 1 Sale Price: $" + ford1.getSalePrice());
		System.out.println("Ford 2 Sale Price: $" + ford2.getSalePrice());
		System.out.println("Car Sale Price: $" + car.getSalePrice());
		
	}

}
