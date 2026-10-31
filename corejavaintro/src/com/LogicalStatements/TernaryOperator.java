package com.LogicalStatements;

import java.util.Scanner;

public class TernaryOperator {

	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		System.out.println("Enter a number");
		int num=sc.nextInt();
		String temp=num>0 ?  "Positive" :"Negative";
			System.out.println("The result is :" + temp);	

	}

}
