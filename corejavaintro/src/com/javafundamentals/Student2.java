package com.javafundamentals;

public class Student2 {
	String std_name;
	int roll_no;
	String course;
	
	int marks1, marks2,marks3;
	 
	void DisplayStudentDetails() {
		System.out.println("Student name is : " + std_name );
		System.out.println("roll no  is : " + roll_no );
		System.out.println("course name is : " + course );
	}
	void calculatetotalmarks() {
		int total = marks1+marks2+marks3;
		System.out.println(total);
		
	}
	void avgmarks() {
		double avg = marks1+marks2+marks3/3.0;
		System.out.println(avg);
	}

	public static void main(String[] args) {
		Student2 s = new Student2();
		s.std_name = "Sunitha";
		s.roll_no = 8;
		s.course = "jfs";
		s.marks1=30;
		s.marks2=60;
		s.marks3=80;
		s.DisplayStudentDetails();
		s.calculatetotalmarks();
		s.avgmarks();

	}

}
