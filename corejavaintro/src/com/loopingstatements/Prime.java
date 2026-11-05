package com.loopingstatements;

import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		for(int i=1;i<100;i++) {
			if(isPrime(i)) {
				System.out.println(i);
			}
		}
	}
	static boolean isPrime(int n) {
		boolean status =true;
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