package com.loopingstatements;

public class Even {

	public static void main(String[] args) {
		System.out.println("Main method started");
		for(int i=100;i>=0;i=i-1) {
			if(i%2==1 ) {
				System.out.println(i);
			}
		}
	}

}
