package com.loopingstatements;

import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		int rem=0;
		int rev=0;
	    int org=n;
		while(n>0) {
			rem=n%10;
			n=n/10;
			rev=rev*10+rem;
		}
		//System.out.println("The reverse of a number is :" + rev);
	   if(org==rev) {
		   System.out.println("The given number is palindrome");
	   }else {
		   System.out.println("The given number is not palindrome");
	   }
		
	}

}
