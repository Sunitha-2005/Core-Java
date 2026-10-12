package com.javafundamentals;
import java.util.Scanner;
public class Factorial {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Main method is started");
		
		System.out.println("Enter factorial of a number");
		int n=sc.nextInt();
		Factorial fact = new Factorial();
		int result=fact.factorial(n);
		System.out.println("The factorial number is : " +result);
		
		System.out.println("Main method is ended");
		
	}
	int factorial(int n) {
		int fact=1;
		for(int i=1;i<=n;i++) {
			fact=fact*i;
		}
		return fact;
			
		
	}

}
