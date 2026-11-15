package com.oops;

public class TestAccount {

	public static void main(String[] args) {
		Account a = new Account();
		a.setAccountNumber(634789);
		a.setbalance(100000);
		a.setName("Sunitha");
		System.out.println(a);
		
		System.out.println("Account number is :" + a.getaccountNumber());
		System.out.println("Account balance is :" + a.getbalance());
		System.out.println("Customer name is : " +a.getName());
		System.out.println("*************************");
		
		Account a1 = new Account();
		a1.setAccountNumber(634789);
		a1.setbalance(100000);
		a1.setName("Anitha");
		System.out.println("Account number is :" + a1.getaccountNumber());
		System.out.println("Account balance is :" + a1.getbalance());
		System.out.println("Customer name is : " +a1.getName());
	}

}
