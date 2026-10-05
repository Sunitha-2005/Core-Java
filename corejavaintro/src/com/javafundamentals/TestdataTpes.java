package com.javafundamentals;

import java.math.BigDecimal;
import java.math.BigInteger;
class Dog{
	
}
public class TestdataTpes {
	
	//predefined classes
	String s = "Sunitha";//string literals
	String s1 = new String("ACE"); // String object
	StringBuffer sb = new StringBuffer("Java");
	BigInteger bi;
	BigDecimal bd;
	
	//predefined Wrapper classes
	Integer i;
	Boolean b;
	Character c;
	
	//user defined obj 
	Dog d;

	public static void main(String[] args) {
		System.out.println("main method started ");
		TestdataTpes t = new TestdataTpes();
		System.out.println(t.s);
		System.out.println(t.s1);
		System.out.println(t.sb);
		System.out.println(t.bi);
		System.out.println(t.bd);
		System.out.println(t.i);
		System.out.println(t.b);
		System.out.println(t.c);
		
		
		System.out.println("main method ended");
		
	

	}

}
