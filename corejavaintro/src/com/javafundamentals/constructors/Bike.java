package com.javafundamentals.constructors;

public class Bike {
	String model;
	String brand;
	String color;
	double price;
	int year;
	{
		System.out.println("Instance block is called!!");
	}
	
	//no arg constructor
	Bike(){
		System.out.println("no arg constructor called!!!...");
		model="Unknown";
		brand="Unknown";
		color="Unknown";
		price=100000.00;
		year=2025;
	}
	
	//one arg constructor
	Bike(String model){
		System.out.println("one arg constructor called!!!...");
		this.model=model;
		
	}
	
	//Two arg constructor
	Bike(String model,String brand){
		System.out.println("two arg constructor called!!!...");
		this.model=model;
		this.brand=brand;
	}
	
	//Three arg constructor
	Bike(String model,String brand,String color){
		System.out.println("three arg constructor called!!!...");
		this.model=model;
		this.brand=brand;
		this.color=color;
		
	}

	
	
	//four arg Constructor
	Bike(String model,String brand,String color,double price){
		System.out.println("four arg constructor called!!!...");
		this.model=model;
		this.brand=brand;
		this.color=color;
		this.price=price;
	}
	
	
	//five arg constructor
	Bike(String model,String brand,String color,double price,int year){
		System.out.println("five arg constructor called!!!...");
		this.model=model;
		this.brand=brand;
		this.color=color;
		this.price=price;
		this.year=year;
	}

	public static void main(String[] args) {
		System.out.println("Main method Started");
		Bike b = new Bike();
		b.bikeInfo();
		
		
		Bike b1 = new Bike("Classic");
		System.out.println(b1.model);
		//b1.bikeInfo();
		
		
		Bike b2 = new Bike("Classic","RE");
		b2.bikeInfo();
		
		Bike b3 = new Bike("Shine","Honda","Pink");
		b3.bikeInfo();
		
		
		Bike b4 = new Bike("FA-Z","Pulzar","blue",100000);
		b4.bikeInfo();
		
		
		
		Bike b5 = new Bike("shineee","Grammar","back",120000,2026);
		b5.bikeInfo();
		
		System.out.println("Main method ended");
		

	}
	
	
	
	void bikeInfo() {
		System.out.println("The model of a bike is : " + model);
		System.out.println("The brand of a bike is : " + brand);
		System.out.println("The color of a bike is : " + color);
		System.out.println("The price of a bike is : " + price);+
		System.out.println("The year of a bike is : " + year);
	}

}
