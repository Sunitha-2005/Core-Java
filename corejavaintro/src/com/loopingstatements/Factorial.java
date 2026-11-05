package com.loopingstatements;

import java.util.Scanner;

public class Factorial {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num=sc.nextInt();
		int result=factorial(num);
		System.out.println("The factorial of a given number is:" +result);
		

	}
	static int factorial(int n) {
		int fact=1;
		for(int i=n;i>=1;i--) {
			fact=fact*i;
		}
		return fact;	
	}

}
