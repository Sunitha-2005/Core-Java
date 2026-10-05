package com.javafundamentals;
import java.util.Scanner;

public class Arthmeticoperation {
	 int  Addition(int a,int b) {
		 return a+b;	 
		
	}
	int subtraction(int a , int b) {
		return a-b;
		
	}
	int  multiply(int a, int b) {
		return a*b;
		
	}
	int division(int a ,int b) {
		return a/b;
		
	}

	public static void main(String[] args) {
		Arthmeticoperation a = new Arthmeticoperation();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number:");
		int num1 = sc.nextInt();
		System.out.println("Enter second number:");
		int num2 = sc.nextInt();
		int add = a.Addition(num1, num2);
		int sub = a.subtraction(num1 ,num2);
		int mul = a.multiply(num1 ,num2);
		int div = a.division(num1 ,num2);
		System.out.println("addition of two numbers : " + add );
		System.out.println("subtraction of two numbers : " + sub);
		System.out.println("multiplication of two numbers : " + mul);
		System.out.println("division of two numbers : " + div);
	}
}
		
		

		

	