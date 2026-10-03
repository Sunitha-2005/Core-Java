package com.javafundamentals;

class student {
	String Std_name = "Sunitha";
	int roll_no = 8;
	String course = "JFS";
	
	
	int marks1 = 75;
	int marks2 = 60;
	int marks3 = 80;
	
	void displayStudentDetails(int roll_no,String Std_name, String course) {
		System.out.println("Student name is : " + Std_name);
		System.out.println("roll number is : " + roll_no);
		System.out.println("Course name is  : " + course);
	}
	void calculatetotalmarks(int marks1 , int marks2,int marks3) {
		int total = marks1+marks2+marks3;
		System.out.println("total marks is : " + total);
	}
	void calculateAvgmarks() {
		int total1 = marks1+marks2+marks3;
		double avg = total1/3.0;
		System.out.println("avg marks is : " + avg);
	}
	
	


	public static void main(String[] args) {
		student s = new student();
		System.out.println(s.Std_name);
		System.out.println(s.roll_no);
		System.out.println(s.course);
		
		

	}

}
