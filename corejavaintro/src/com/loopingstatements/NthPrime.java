package com.loopingstatements;
import java.util.Scanner;
public class NthPrime {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int n=sc.nextInt();
		int count=0;
		for(int i=0;count<n;i++) {
			if(isPrime(i)) {
				count++;
				if(count==n) {
					System.out.println("The n th prime number is :" + i);
					break;
				}
			}

		}

	}
	static boolean isPrime(int n) {
		boolean status=true;
		if(n==0 || n==1) {
			return false;
		}
		for(int i=2;i<=Math.sqrt(n);i++) {
			if(n%i==0) {
				status=false;;
				break;						
			}
		}
		return status;
	}

}
