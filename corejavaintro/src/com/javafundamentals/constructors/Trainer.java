package com.javafundamentals.constructors;

class Person{
	int age;
	String name;
	String city;
	public Person() {
		System.out.println("person class constructor called!!...");
	}
	public Person(int age, String name, String city) {
		super();
		this.age = age;
		this.name = name;
		this.city = city;
	}
	
	
}
//Either this() or super() can call but not both.
//until java 24 version,this() or super() must be be first line of any constructor.
//but After 25 onwards,this() & super() can written any where in the constructor based on requirements.
public class Trainer extends Person{
	//by using child class,we can call super()
	Trainer(){
		super(25,"unknown","unknown");
	    System.out.println("Trainer class constructor called!!!...");
	}
	Trainer(int age,String name,String city){
		super.age=age;
		super.name=name;
		super.city=city;
		
}

	public static void main(String[] args) {
		System.out.println("Main method Started");
		Trainer t = new Trainer();
		t.displayTrainerinfo();
		
		
		Trainer t1 = new Trainer(21,"Sunitha","hyd");
		t1.displayTrainerinfo();

	}
	void displayTrainerinfo() {
		System.out.println("The age of the trainer is : " +age);
		System.out.println("The name of the trainer is : " +name);
		System.out.println("The city of the trainer is : " +city);
		System.out.println("****************************************");

	}

}
