package com.javafundamentals;
import java.util.Scanner;
public class EmployeeMethod {

	    void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Main method Started");
		System.out.println("Enter employee name: ");
		String name = sc.nextLine();
		System.out.println("Enter employee age");
		int age = sc.nextInt();
		
		System.out.println("Enter employee salary is ");
		double sal=sc.nextDouble();
		
		System.out.println("Enter employee height");
		double ht = sc.nextDouble();
		
		System.out.println("Enter employee weight");
		double wt = sc.nextDouble();
		
		System.out.println("Enter employee gender");
		char gen = sc.next().charAt(0);
		
		System.out.println("Enter employee phone number");
		Long ph = sc.nextLong();
		 
		employeename(name);
		employeeage(age);
		employeesal(sal);
		employeeheight(ht);
		employeeWeight(wt);
		employeegender(gen);
		employeephone(ph);
		
		
		
		System.out.println("Main method ended");
		
		

	}
	void employeename(String name) {
		System.out.println("Employee full name is : " + name);
	} 
	void employeeage(int age) {
		System.out.println("Employee age is :" +age);
	}
	void employeesal(double sal) {
		System.out.println("Employee sal is : " + sal);
	}
	void employeeheight(double height) {
		System.out.println("Employee height is :" + height);
	}
	void employeeWeight(double weight) {
		System.out.println("Employee weight is :" +weight);
	}
	void employeegender(char gen) {
		System.out.println("Employee gender is : " +gen);
	}
	void employeephone(Long phone) {
		System.out.println("Employee phone number is :" +phone);
	}

}
