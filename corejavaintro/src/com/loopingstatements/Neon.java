package com.loopingstatements;

import java.util.Scanner;

public class Neon {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		int sum=0;
		int sq=n*n;
		int rem=0;
		
		while(sq>0) {
			 rem=sq%10;	
			 sq=sq/10;
			 sum=sum+rem;	 
				
		}
		if(sum==n) {
			System.out.println("The given number is neon");
		}else {
			System.out.println("The given number is not neon");
		}

	}

}
