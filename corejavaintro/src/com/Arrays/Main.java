package com.Arrays;

class parent{
	int x= 10;
	
}
class Child extends parent{
	int x= 20;
	
}
public class Main {
	

	public static void main(String[] args) {
		parent obj=new Child();
		System.out.println(obj.x);
		
		
	}

}
