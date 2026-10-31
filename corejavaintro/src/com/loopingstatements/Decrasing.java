package com.loopingstatements;
//WAP to print 100 to 0 using for loop

public class Decrasing {

	public static void main(String[] args) {
		System.out.println("Main method Started");
		
		//for(int i=100;i>=0;i=i-1)
		for(int i=100;i>=0;i--) {
			if(i%2==0 && i!=0) {
				System.out.println(i);
			}
		}
		System.out.println("Main method Ended");

	}

}
