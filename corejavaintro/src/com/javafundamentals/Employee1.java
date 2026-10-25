package com.javafundamentals;

public class Employee1 {
	String ename;
	int age;
	double esal;
	int id;
	//no arg constructor
	Employee1 (){
		System.out.println("no arg constructor started");
		ename="Anitha";
		age=22;
		esal=500000;
		id=1208;
		System.out.println("no arg constructor ended");
		
	}
	

	public static void main(String[] args) {
		System.out.println("Main method Started");
		
		// Default constructor when we create the object
		Employee1 e1 = new Employee1();
		//Employee1 e2 = new Employee1();
		
		//e2.ename="Jessy";
		//e2.age=12;
		System.out.println("employee name is : " +e1.ename);
		System.out.println("employee name is : " +e1.age);
		System.out.println("employee name is : " +e1.esal);
		System.out.println("employee name is : " +e1.id);	
		System.out.println("Main method Started");
		
	}
	
}
