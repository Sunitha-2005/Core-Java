package com.javafundamentals;

public class Student1 {
		String Std_name = "Sunitha" ;
		int roll_no = 8;
		String course = " jfs";
		
		
		int marks1 = 60;
		int marks2 = 70;
		int marks3 = 90;
		
		void displayStudentDetails() {
			System.out.println("Student name is : " + Std_name);
			System.out.println("roll number is : " + roll_no);
			System.out.println("Course name is  : " + course);
		}
		void calculatetotalmarks() {
			int total = marks1+marks2+marks3;
			System.out.println("total marks is : " + total);
		}
		void calculateAvgmarks() {
			int total1 = marks1+marks2+marks3;
			double avg = total1/3.0;
			System.out.println("avg marks is : " + avg);
		}

	public static void main(String[] args) {
		    Student1 s = new Student1();
		    s.displayStudentDetails();
		    s.calculatetotalmarks();
		    s.calculateAvgmarks();
			

	}

}
