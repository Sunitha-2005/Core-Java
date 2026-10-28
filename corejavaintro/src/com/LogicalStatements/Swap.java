package com.LogicalStatements;
import java.util.Scanner;
public class Swap {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first number");
		int first=sc.nextInt();
		System.out.println("Enter second number");
		int sec=sc.nextInt();
		
		//using temp as third variable
		//if(first>sec) {
			//int temp=first;
			//first=sec;
			//sec=temp;	
		    //System.out.println("after swapped number is :" +first );
		    //System.out.println("after swapped number is :" +sec );
		//}
		
		//using operator
		first=first+sec;
		sec=first-sec;
		first=first-sec;
		System.out.println("the first number is :"+ first);
		System.out.println("the second number is :"+ sec);
		
	}

}


