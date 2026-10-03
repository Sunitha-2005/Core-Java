package com.javafundamentals;
import java.util.Scanner;

public class Demo4 {
	
	static int total=450;
	static void method1(int c,int b) {
		c=c*15;
		b=b*10;
		
		int sum=c+b;	
		int remaining=total-sum;
		System.out.println(remaining);
		
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int c=10;
		int b=5;
		method1(c,b);
		
		
	
		
		
		// TODO Auto-generated method stub

	}

}
