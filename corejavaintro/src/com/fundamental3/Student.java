package com.fundamental3;

public class Student {
	int roll_number;
	String name;
	double salary$;
	void read() {
		System.out.println("read called");
	}
	void write() {
		System.out.println("write called");
	}

	public static void main(String[] args) {
		Student s1 = new Student();
		System.out.println("main method started");
		System.out.println(s1.roll_number);
		System.out.println(s1.name);
		System.out.println(s1.salary$);
		s1.read();
		s1.write();
		System.out.println("main method ended");

	}

}
