package com.loopingstatements;
//WAP To check given number is prime or not
import java.util.Scanner;

public class Primenumber {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.println("How many numbers you want?");
	        int n = sc.nextInt();
	        for (int i = 1; i <= n; i++) {
	            if (isPrime(i)) {
	                System.out.println(i);
	            }
	        }
	    }
	    static boolean isPrime(int n) {
	        boolean status = true;
	        if (n == 0 || n == 1) {
	            return false;
	        }
	        for (int i = 2; i < n; i++) {
	            if (n % i == 0) {
	                status = false;
	                break;
	            }
	        }
	        return status;
	    }
	}