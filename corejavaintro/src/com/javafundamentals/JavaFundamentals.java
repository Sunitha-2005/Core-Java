package com.javafundamentals;

public class JavaFundamentals {
	static String name="Sunitha";

	public static void main(String[] args) {
		System.out.println("Main method started");
		System.out.println(JavaFundamentals.name.length());
		
		for(String a : args) {;
			System.out.println(a);
			
		}
		//System.out.println(JavaFundamentals.name.length());
		System.out.println("Main method ended");

	}
	
	

}
