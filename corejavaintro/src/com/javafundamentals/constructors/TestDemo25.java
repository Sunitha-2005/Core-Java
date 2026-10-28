package com.javafundamentals.constructors;
//Create a Product class with productId and productName.
//Create an Electronics class extending Product, with brand and price.
//Create a Laptop class extending Electronics, with ram and storage.
//Use parameterized constructors in all three classes.
//Use super() to call the parent constructors.
////Create a displayDetails() method inside Laptop.
//Create an object in main() and display all six fields.
class Products{
	int productid;
	String prod_name;
	Products(int productid,String prod_name){
		this.productid=productid;
		this.prod_name=prod_name;
	}
}
class Electronics extends Products{
	String brand;
	double price;
	Electronics(int productid,String prod_name,String brand,double price){
		super(productid,prod_name);
		this.brand=brand;
		this.price=price;
		
	}
	
}
class Laptop1 extends Electronics{
	int ram;
	int storage;
	Laptop1(int productid,String prod_name,String brand,double price,int ram,int storage){
		super(productid,prod_name,brand,price);
		this.ram=ram;
		this.storage=storage;
		
	}
	void displayDetails() {
		System.out.println("the id of the product is:" +productid);
		System.out.println("the name  of the product is:" +prod_name);
		System.out.println("the brand of the electronics is:" +brand);
		System.out.println("the price of the electronics is:" +price);
		System.out.println("the ram of the laptop is:" +ram);
		System.out.println("the storage of the laptop is:" +storage);

	}
}
public class TestDemo25 {

	public static void main(String[] args) {
		Laptop1 l = new Laptop1(101, "Laptop", "Dell", 55000.0, 16, 512);
		l.displayDetails();

	}

}
