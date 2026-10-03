package com.javafuntamental2;

public class Demo3 {
	static void Method1() {
		System.out.println("method1 calledt");
		}
	static void Method2()
	{
		System.out.println("method2 called");
		Method1();
	}
	static void method3() {
		Method2();
		System.out.println("method3 called");
		Demo3 ob1 = new Demo3();
		//ob1.method4();			
	}
	void method4() {
		System.out.println("method4 called");
	}
	void method5() {
		System.out.println("method5 called");
		
	}
	public static void main(String[] args) {
		System.out.println("main method started");
		System.out.println("main method ended");
		// TODO Auto-generated method stub

	}

}
