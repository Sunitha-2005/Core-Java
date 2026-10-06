package com.javafundamentals;

public class BankAccount {
	static int balance = 1000;
	void deposit(int amount) {
		balance = balance+amount;
	}
	void without(int amount) {
		balance = balance-amount;
		
	}


	public static void main(String[] args) {
		BankAccount b = new BankAccount();
		b.deposit(500);
		b. without(300);
		System.out.println("Final amount is : " + balance);
		// TODO Auto-generated method stub

	}

}
