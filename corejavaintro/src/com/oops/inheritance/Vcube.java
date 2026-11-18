package com.oops.inheritance;

class Device{
	private String brand;
	private double price;
	
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	void display() {
		System.out.println("The brand:" + brand);
		System.out.println("The price: " + price);
	}
}
class Laptop extends Device{
	String ram;
	String processor;
	 void RunIDE() {
		 System.out.println("The laptop runing IDE");
		 ;
		 
	 }
	 void compilecode() {
		 System.out.println("The laptop comiling code");
		 
	 }
	 void displayDetails() {
		 System.out.println("Laptop details");
		 System.out.println("The ram of a device is:" + ram);
		 System.out.println("The processor of a device is : " + processor);
		 
	 }	 	
	
}
class Mobile extends Device{
	String camera;
	String battery;
	void  makeCall() {
		System.out.println("The mobile making call");
	}
	void takephoto() {
		System.out.println("Taking photo");
		
	}
	void detailsDisplays() {
		System.out.println("Mobile details");
		System.out.println("The camera of mobile is:" + camera);
		System.out.println("The battery of mobile is:" + battery);
	}
	
}

public class Vcube {

	public static void main(String[] args) {
		 Laptop l = new  Laptop();
		 l.setBrand("HP");
		 l.setPrice(200000);
		 l.ram="16GB";
		 l.processor="intel i5";
		 
		 Mobile m = new Mobile();
		 m.setBrand("Samsung");
		 m.setPrice(10000);
		 m.camera="50MP";
		 m.battery="5000mAh";
		 
		 //runtime polymorphism
		 Device d;
		 d=l;
		 d.display();
		 System.out.println();
		 
		 d=m;
		 m.detailsDisplays();
		 System.out.println();
		 
		 l.RunIDE();
		 l.compilecode();
		 m.makeCall();
		 m.takephoto();
	}
}