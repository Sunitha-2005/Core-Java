package com.javafundamentals;
import java.util.Scanner;
public class Method3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length values");
		int num1 = sc.nextInt();
		System.out.println("Enter the breadth values");
		int num2 = sc.nextInt();
	
		System.out.println("Main method started!!");
		rectangle(num1,num2);
		
		System.out.println("Main method ended!!");
		// TODO Auto-generated method stub

	}
	static void rectangle(int length,int breadth) {
		System.out.println("Rectangle method called");
		System.out.println(length*breadth);
		
	}

}
