package com.loopingstatements;

import java.util.Scanner;

public class DigitSum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		int sum=0;
		int r=0;
		while(n>0) {
			 r=n%10;
			n=n/10;
			sum=sum+r;
			
			
		}
		System.out.println("Sum of digit is:" +sum);

	}

}
