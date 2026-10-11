package com.javafundamentals;

//WAP to calculate 
import java.util.Scanner;

public class CalculateMethods {
	

	    void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Main method started");
		int sum = addition();
		System.out.println("the addition of two number :" +sum);
		
		int sub=subtraction();
		System.out.println("the subtraction of two number:" + sub);
		
		double mul=multiplication();
		System.out.println("the multiplication two number is : " + mul);
		
		double squ=square();
		System.out.println("The square of two number is :" +squ);
		
		double rec=rectangle();
		System.out.println("rectangle of two number is :" + rec);
		
		System.out.println("Main method ended");
		
		

	}
	int addition() {
		System.out.println("addition method called");
		int a=10;
		int b=20;
		int sum=a+b;
		return sum;
	}
	int subtraction() {
		System.out.println("subtraction method called");
		int a=50;
		int b=30;
		int sub=a-b;
		return sub;
	}
	double multiplication() {
		int a=5;
		int b=4;
		int mul=a*b;
		return mul;
	}
	double square() {
		int s1=10;
		int s2=30;
		int sq=s1*s1+s2*s2;
		return sq;
	}
	double rectangle() {
		int length=5;
		int breadth=20;
		int area=length*breadth;
		return area;
	}
	double circle() {
		int 
	}

}
