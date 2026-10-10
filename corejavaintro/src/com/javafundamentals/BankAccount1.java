package com.javafundamentals;
//WAP Account related program like withdraw and deposit and check balance

import java.util.Scanner;

public class BankAccount1 {
	double  balance = 100000.00;

	    void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Main method started");
		
		System.out.println("Enter your deposit amount ");
		double amt=sc.nextDouble();
		deposit(amt);
		checkbalance();
		
		System.out.println("Enter your withdraw amount ");
		double Wamt=sc.nextDouble();
		withdraw(Wamt);
		checkbalance();
		sc.close();
		
		System.out.println("Main method ended");
			
		}
	    void deposit(double amount) {
	    	System.out.println("total deposited amount is:" + amount);
		    balance = balance+amount;
	    }
	    void withdraw(double amount) {
	    	System.out.println("the withdraw amount is : " + amount);
	    	if(amount<=balance) {
	    		balance = balance-amount;
	    	}else {
	    		System.out.println("insuffient funds in your account");
	    	}
	    }
	    void checkbalance() {
	    	System.out.println("The checkbalance amount is :" + balance);
	}

}
