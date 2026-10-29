package com.LogicalStatements;

import java.util.Scanner;

//WAP To print calculation of two number
public class Calculation {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int a=sc.nextInt();
		System.out.println("Enter b number");
		int b=sc.nextInt();
		System.out.println("Enter a symbol is +,-,*,/,%");
		char symb=sc.next().charAt(0);
		int result=0;
		switch(symb) {
		case '+' -> result=a+b;
		case '-' -> result=a-b;
		case '*' -> result=a*b;
		case '/' -> result=a/b;
		case '%' -> result = a%b;
		default -> {
			result=0;
			System.out.println("invalid result");
		}
		}
		System.out.println("The  result value is : " +result);
		

	}

}
