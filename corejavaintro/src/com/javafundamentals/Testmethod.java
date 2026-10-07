package com.javafundamentals;

public class Testmethod {
	//static method
	public static void Welcome() {
		System.out.println("Welcome to java block");
	}

	public static void main(String[] args) {
		System.out.println("Main method started !!!");
		Testmethod t = new Testmethod();
		//call the method
		Welcome();
		Testmethod.Welcome();
		t.hello();
		
		System.out.println("Main method ended !!!");
		

	}
	//Instances method
	public void hello() {
		System.out.println("I love my family");
	}

}
