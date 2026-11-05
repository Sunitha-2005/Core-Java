package com.loopingstatements;

import java.util.Scanner;

public class PrimeorNot {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int n=sc.nextInt();
		boolean status=isPrime(n);
		if(status) {
			System.out.println("The given number is prime");
		}else {
			System.out.println("The given number is not prime:");
		}
		

	}
	static boolean isPrime(int n) {
		boolean status=true;
		if(n==0 || n==1) {
			return false;
		}
		for(int i=2;i<n;i++) {
			if(n%i==0) {
				status=false;
				break;
			}
		}
		return status;
	}
	

}
