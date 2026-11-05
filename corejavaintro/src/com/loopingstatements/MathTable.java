package com.loopingstatements;

import java.util.Scanner;

public class MathTable {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter which table you want to written");
		int n=sc.nextInt();
		System.out.println("how many you want to enter");
		int n1=sc.nextInt();
		for(int i=1;i<=n1;i++) {
			System.out.println(n + " * " + i + " = " +(n*i));
		}
	}
}
		