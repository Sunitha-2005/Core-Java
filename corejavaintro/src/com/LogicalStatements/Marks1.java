package com.LogicalStatements;

import java.util.Scanner;

public class Marks1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the marks");
		int marks=sc.nextInt();
		String grade = switch(marks/10) {
		case 10,9 ->{
			System.out.println("some people are interested in education");
			yield "A";
			
		}
		case 8 -> "B";
		case 7 -> "C";
		case 6,5,4 -> "D";
		case 1,2,3 -> "F";
		default -> "Enter marks are invalid";
		};
		System.out.println("Grade is : " +grade);

	}

}
