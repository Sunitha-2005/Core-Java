package com.javafundamentals;

public class Student {
	static {
		String collegename = "ACE Engineering college";
		System.out.println(collegename);
		}
	{
		System.out.println("Student object is created ");
	}
	void StudentDetails() {
		int roll_number=1208;
		String name="Sunitha";
		int marks=70;
		System.out.println(roll_number);
		System.out.println(name);
		System.out.println(marks);
		
	}
	static void display() {
		String collegename="ACE Engineering College";
		System.out.println("College Name is:" + collegename );
	}
	

	public static void main(String[] args) {
		Student st = new Student();
		//Student st1 = new Student();
		st. StudentDetails();
		Student.display();
		
		
		

	}

}
