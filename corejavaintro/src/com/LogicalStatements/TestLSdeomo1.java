package com.LogicalStatements;
//WAP To check the given number is positive or negative number
import java.util.Scanner;
public class TestLSdeomo1 {

	public static void main(String[] args) {
		System.out.println("Main method Started");
		System.out.println("Enter a number:");
		Scanner sc = new Scanner(System.in);
		int num=sc.nextInt();
		if(num>=0) 
			System.out.println("The given number is positive");
		else 
			System.out.println("The given number is negative");		
		
		System.out.println("Main method Ended");

	}

}
