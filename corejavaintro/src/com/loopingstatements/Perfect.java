package com.loopingstatements;

import java.util.Scanner;

public class Perfect {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num=sc.nextInt();
		boolean status=isperfect(num);
		if(status) {
			System.out.println("The given number is perfect number");
		}else {
			System.out.println("The given number is not perfect number");
			
		}

	}
	 static boolean isperfect( int n) {
		 boolean status=false;
		 int sum=0;
		 for(int i=1;i<=n/2;i++) {
			 if(n%i==0) {
				 sum=sum+i;
				 
			 }
		 }
		 if(sum==n) {
			 status=true;
		 }
		 return status;	
	 }
}