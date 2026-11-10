package com.loopingstatements;

import java.util.Scanner;

public class Automorphic {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt();
		int sq = n * n;
		int count = 1;
		int n1=n;
		System.out.println(sq);
		while (n1 > 0) {
			count = count * 10;
			n1 = n1 / 10;
		}
		if (sq % count == n) {
			System.out.println("The given number is automorphic :" + n);
		} else {
			System.out.println("The given number is not automorphic");
		}

	}

}
