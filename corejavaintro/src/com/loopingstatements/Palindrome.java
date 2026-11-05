package com.loopingstatements;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		int org=n;
		int rev = 0;
		while(n>0) {
			int rem=n%10;
			rev=rev*10+rem;
			n/=10;
	    //System.out.println("Reverse number is :" +rev);
			
		}
		if(org==rev) {
			System.out.println("It is a palindrome");
		}
		else {
			System.out.println("It is not a palindrome");
		}
		
	}

}
