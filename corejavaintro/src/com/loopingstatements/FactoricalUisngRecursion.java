package com.loopingstatements;

import java.util.Scanner;

public class FactoricalUisngRecursion {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		int result=calFactorial(n);
		System.out.println("The factorial of a given number is : " +result);
		

	}
	static int calFactorial(int n) {
		if(n==0 || n==1) {
			return 1;
		}else {
			return n*calFactorial(n-1);
		}
	}

}
