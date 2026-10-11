package com.javafundamentals;
import java.util.Scanner;
//WAP To calculate all the areas
public class AreaOfall {
	

	    void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter length of a traingle");
		double are=sc.nextDouble();
		
		
		System.out.println("Enter breadth of a traingle");
		double bre=sc.nextDouble();
		double ar=trianglearea(bre,are);
		System.out.println(ar);
		 
		System.out.println("Enter radius");
		double ciare=sc.nextDouble();
		
		double arr=circle1(ciare);
		System.out.println(arr);
		
		sc.close();
		
		
		
		
		

	}
	double trianglearea(double l, double b) {
		//System.out.println("Triangle area is called: " + l + " " + b);
		double area=0.5*l*b;
		return area;
	}
	double circle1(double radius) {
		return Math.PI*radius*radius;
		
		
	}

}
