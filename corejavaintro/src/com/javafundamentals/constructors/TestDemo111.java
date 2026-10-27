package com.javafundamentals.constructors;

class Vehicle{
	String type;
	Vehicle(String type){
		this.type=type;
	}
}
class Car extends Vehicle{
	String brand;
	double price;
	Car(String type,String brand,double price){
		super(type);
		this.brand=brand;
		this.price=price;
	}
}
class ElectricCar extends Car{
	int batteryCapacity;
	ElectricCar(String type,String brand,double price,int batteryCapacity ){
		super(type,brand,price);
	    this.batteryCapacity=batteryCapacity;
	}
	void displayVehicleinfo() {
		System.out.println("The type of vehicle is : " +type);
	    System.out.println("The brand of car is : " +brand);
	    System.out.println("The price of car is : " +price);
	    System.out.println("The batteryCapacity of Electriccar is : " + batteryCapacity);
	}
}
public class TestDemo111 {
	public static void main(String[] args) {
		ElectricCar ec = new ElectricCar("kiya","seldon",12000,200);
		ec.displayVehicleinfo();
		
	}
}
		
		
		