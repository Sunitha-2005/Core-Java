package com.javafundamentals;

public class Student5 {
	static int count=0;
	 Student5(){
		count=count+1;
		
	}

	public static void main(String[] args) {
		Student5 s1 = new Student5 ();
		Student5 s2 = new Student5 ();
		Student5 s3 = new Student5 ();
		Student5 s4 = new Student5 ();
		Student5 s5 = new Student5 ();
		System.out.println("the total number count is display : " + count);
		
	
		// TODO Auto-generated method stub

	}

}
