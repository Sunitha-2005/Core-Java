package com.loopingstatements;

public class Divisible1 {

	public static void main(String[] args) {
		System.out.println("Main method started");
		for(int i=0;i<=50;i++) {
			if(i%5==0 && i%3==0) {
				System.out.println(i);
			}
		}
		System.out.println("Main method ended");

	}

}
