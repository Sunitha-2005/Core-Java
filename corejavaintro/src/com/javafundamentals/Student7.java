package com.javafundamentals;

public class Student7 {
	Student7(){
		System.out.println("no arg constructor ");
	}
	public static void main(String[] args) {
		System.out.println("Main method started");	
		Student7 st = new Student7();
		st.method1();

		System.out.println("Main method ended");		

	}
	void method1() {
		System.out.println("method1 is called");
	}

}
