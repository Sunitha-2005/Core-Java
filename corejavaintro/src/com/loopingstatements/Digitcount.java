package com.loopingstatements;

import java.util.Scanner;

public class Digitcount {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		int digitcount=0;
		while(n>0) {
			n=n/10;
			digitcount++;
			
		}
		System.out.println("The digitcount of a number is:" + digitcount);
		
		

	}

}
