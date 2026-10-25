package com.javafundamentals;

public class StudentFactory {
	String sname;
	int age;
	int sid;

	    void main(String[] args) {
		System.out.println("Main method started");	
		StudentFactory student=getStudent();
		System.out.println( student.sname);
		System.out.println( student.age);
		System.out.println( student.sid);
		getStudentinfo(student);
		
		System.out.println("Main method ended");

	}
	    void getStudentinfo(StudentFactory s) {
	    	System.out.println("Studentinfo2 ");
	    	System.out.println(s.sname);
	    	System.out.println(s.age);
	    	System.out.println(s.sid);
	    }
	//Factory method
	StudentFactory getStudent() {
		StudentFactory sf = new StudentFactory();
		System.out.println("Studentinfo1 ");
		
		sf.sname="Sunitha";
		sf.age=21;
		sf.sid=1208;
		return sf;
		
		
	}
	

}
