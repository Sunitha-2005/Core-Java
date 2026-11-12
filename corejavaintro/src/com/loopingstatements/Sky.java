package com.loopingstatements;

import java.util.Scanner;

public class Sky {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		int sum=0;
		int rem=0;
		int product=1;
		while(n>0) {
			rem=n%10;	
			sum=sum+rem;
			n=n/10;
			product=product*rem;
						
		}
		if(product==sum) {
			System.out.println("The given number is sky");
		}else {
			System.out.println("The given number is not sky");
		}

	}

}
