package com.LogicalStatements;

import java.util.Scanner;

public class Switchcase {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String yn;
		do {
			System.out.println("Enter a number");
			int a = sc.nextInt();
			System.out.println("Enter b number");
			int b = sc.nextInt();
			System.out.println("Enter the operator is 1.Additon ,2.Subtraction,3.Multiplication,4.Division,5.Modulo");
			int oper = sc.nextInt();

			switch (oper) {
			case 1->
				System.out.println("Addition of two number is :" + (a + b));
				//break;
			case 2 ->
				System.out.println("Subtraction of two number is :" + (a - b));
				//break;
			case 3->
				System.out.println("Multiplication of two number is :" + (a * b));
				//break;
			case 4->
				System.out.println("Division of two number is :" + (a / b));
				//break;
			case 5->
				System.out.println("modulo of two number is :" + (a % b));
				//break;

			default->
				System.out.println("The enter number is invalid");
			}
			System.out.println("Do you want to continue Y for YES and N for NO");
			yn = sc.next();

		} while (yn.equalsIgnoreCase("y"));
		System.out.println("Calculation closed");

	}

}
