package com.LogicalStatements;

import java.util.Scanner;
//WAP to check the vote eligibility and driving 
public class Logicalstatement {

	public static void main(String[] args) {
		System.out.println("Main method started");
		System.out.println("Enter your age is:");
		Scanner sc = new Scanner(System.in);
		int age =sc.nextInt();
		if(age>=18) {
			System.out.println("Have a Good Day");
			
			System.out.println("Congradulation!! you are eligible for vote and driving");
		}else {
			
			//System.out.println("Have a Good Day");
			System.out.println("sorry!! you are not eligible for vote and driving  ");
		}
		System.out.println("Main method ended");

	}

}
