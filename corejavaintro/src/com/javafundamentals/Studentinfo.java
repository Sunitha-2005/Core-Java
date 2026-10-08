package com.javafundamentals;
import java.util.Scanner;
public class Studentinfo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("main method started");
		
		System.out.println("Enter student age :");
		int age = sc.nextInt();
		getStudentAge(age);
		
		
		System.out.println("Enter student weight :");
		double weight=sc.nextDouble();
		
		System.out.println("Enter student height :");
		double height=sc.nextInt();
		
		//Studentinfo st = new Studentinfo();
		//System.out.println("main method started");
		
		System.out.println("Enter student salary:");
		double sal = sc.nextDouble();
		
		
		System.out.println("main method ended");
		
	}
	void getStudentAge(int age) {
		System.out.println("student age is :" + age);
		
	}
	void getStudentweight(double weight) {
		System.out.println("student weight is :" +weight);
	}
	void getStudentsal(double salary) {
		System.out.println("Student salary is: " + salary);
	}
	void getStudentheight(double height) {
		System.out.println("Student height is :" + height);
	}

}
