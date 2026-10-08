package com.javafundamentals;

public class Studentinfo1 {

	  void main(String[] args) {
		System.out.println("Main method started!!");
		getStudentname("Bhukya","Sunitha");
		getStudentage(22);
		getstudentsal(50000);
		getstudentWeight(22);
		getstudentheight(5.5);
		
		System.out.println("Main method ended!!");

	}
	void getStudentname(String fname,String lname) {
		System.out.println("Full name of the Student is :" + fname + " " + lname);
	}
	void getStudentage(int age) {
		System.out.println("Student age is : " +age);
	}
	void getstudentsal(double sal) {
		System.out.println("Student salary is : " + sal);
	}
	void getstudentWeight(double weight) {
		System.out.println("student weight is : " + weight);
	}
	void getstudentheight(double height) {
		System.out.println("student height is : " +height);
	}

}
