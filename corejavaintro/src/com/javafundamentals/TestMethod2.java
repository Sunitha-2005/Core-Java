package com.javafundamentals;

public class TestMethod2 {

	public static void main(String[] args) {
		//TestMethod2 t = new TestMethod2();
		System.out.println("Main method started!!");
		//passing the values:arguments
	    addition(12,30);
		subtraction(20,40);
		multiplication(30, 10);
		division(20,50);
		modulus(30, 5);
		
		System.out.println("Main method ended!!");
	}
	static void addition(int a, int b) {
		System.out.println("addition method called ");
		System.out.println(a+b);
		
	}
	static void subtraction(int a,int b) {
		System.out.println("subtraction method called ");
		System.out.println(a-b);
		
	}
	static void multiplication(int a,int b) {
		System.out.println("multiplication method called ");
		System.out.println(a*b);
		
	}
	static void division(int a, int b) {
		System.out.println("Division method called");
		System.out.println(a/b);
		
	}
	static void modulus(int a, int b) {
		System.out.println("modulus method called");
		System.out.println(a%b);
	}

}
