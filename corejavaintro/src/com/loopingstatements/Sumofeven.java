package com.loopingstatements;


//Find the sum of even numbers from 1 to N.
public class Sumofeven {

	public static void main(String[] args) {
		System.out.println("Main method started");
		int sum=0;
		for(int i=0;i<=10;i++) {
			if(i%2==0) {
				sum=sum+i;
			}
		}
		System.out.println("sum of even number is: " +sum);
		

	}

}
