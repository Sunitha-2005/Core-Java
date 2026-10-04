package com.javafundamentals;

public class DataTypeDemo2 {
	byte b = 127;
	byte b1 = (byte) 128;
	short s = 32767;
	short s1 = (short) 327678;
	int i = 2147483647;
	int i1 = (int)2147483648L;
	long l = 2147483647;
	long l1 = i1;
	long l2 =  9223372036854775807L;
	
	float f = 5.5F;
	float f1 = 100;
	float f2 = 55;
	float f3 = 787.4444f;
	double d  =768.98654322466445654;
	
	char c = 'A';
	char c1 = 126;
	char c3 = 44567;
	char c4 = '\u0040';
	boolean boo =  false;

	public static void main(String[] args) {
	
		DataTypeDemo2 td =  new DataTypeDemo2();
		System.out.println("main method started ");
		System.out.println(td.b);	
		System.out.println(td.b1);	
		
		System.out.println(td.s);	
		System.out.println(td.s1);
		
		System.out.println(td.i);	
		System.out.println(td.i1);
		
		System.out.println(td.l);	
		System.out.println(td.l1);	
		System.out.println(td.l2);	
		
		System.out.println(td.f1);	
		System.out.println(td.f2);	
		System.out.println(td.f3);	
			
		
		System.out.println(td.d);	
			
		
		System.out.println(td.c);	
		System.out.println(td.c1);	
		System.out.println(td.c3);	
		System.out.println(td.c4);	
		
		System.out.println(td.boo);	
		System.out.println("main method ended ");
		

	}

}
