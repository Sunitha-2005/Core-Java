package com.javafundamentals.constructors;

class Product{
	String model;
	String brand;
	String color;
	double price;
	 
	public Product() {
		System.out.println("no arg constructor called from product!!..");
		
	}
	public static void main(String[] args) {
		System.out.println("Main method started from product!!");
	}
}
public class Laptop extends Product {
	public Laptop() {
		
		System.out.println("no arg constructor called from laptop!!..");
	}

	public static void main(String[] args) {
		System.out.println("Main method started from Laptop!!");
		Laptop lp = new Laptop();
		lp.laptopinfo();
		

	}
	void laptopinfo() {
		System.out.println("model of a laptop is : " + model);
		System.out.println("brand of a laptop is : " + brand);
		System.out.println("color of a laptop is : " + color);
		System.out.println("price of a laptop is : " + price);
	}
}