package com.LogicalStatements;
import java.util.Scanner;

//WAP 
public class TestDemols2 {

	public static void main(String[] args) {
		System.out.println("Main method Started");
		System.out.println("Enter a number");
		Scanner sc = new Scanner(System.in);
		int n1=sc.nextInt();
		if(n1%2==0) {
			System.out.println("Even number");
		}else {
			System.out.println("odd number");
			
		}
		System.out.println("Main method ended");
		

	}

}
