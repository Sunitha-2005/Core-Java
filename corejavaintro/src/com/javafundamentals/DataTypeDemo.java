package com.javafundamentals;

public class DataTypeDemo {
	int Std_id1 =12;
	double marks=77.7;
	boolean Pass_Status1=true;
	//boxing
	Integer Std_id = Std_id1;
    Double Marks = marks;
    boolean Pass_Status = Pass_Status1;
    //unboxing
    int idvalue = Std_id;
    Double m =marks;
    boolean boo = Pass_Status;
    

	public static void main(String[] args) {
		DataTypeDemo d = new DataTypeDemo();
		
		System.out.println("student id is : " + d.Std_id);
		System.out.println("Marks is : " + d.Marks);
		System.out.println("Pass Status is : " + d.Pass_Status);
		System.out.println("idValue is : " + d.Std_id);
		

	}

}
