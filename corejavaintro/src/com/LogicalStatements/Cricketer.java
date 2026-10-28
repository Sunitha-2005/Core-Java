package com.LogicalStatements;

import java.util.Scanner;

//WAP to print cricketer info based on his jersey number
public class Cricketer {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a jersey number");
		int jno=sc.nextInt();
		
		switch(jno) {
		case 1 ->{
			System.out.println("VK Virat Kohil");
			System.out.println("Well played person");
		}
		case 2 -> {
			System.out.println("MD Mahendra singh dhoni");
			System.out.println("cool person");	
		}
		case 3 -> System.out.println("Abhishek");
		case 4 -> {
			System.out.println("KL : Lokesh Rahul");
			System.out.println("Classic player");
		}
		default->System.out.print("Invalid info");
			
		}

	}

}
