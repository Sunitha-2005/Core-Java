package com.LogicalStatements;
import java.util.Scanner;

//WAP to check the character is less than 15 than the name is add to passport 
public class TestDemols3 {

	public static void main(String[] args) {
		System.out.println("Main method Started");
		System.out.println("Enter a name :");
		Scanner sc = new Scanner(System.in);
		String name=sc.nextLine();
		
		if(name.length()<=15) {
			System.out.println("Easy to add name in passport");
			
		}else {
			System.out.println("it is too long so very  difficult to add name in passport make it has short");
		}

	}

}
