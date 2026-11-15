package com.oops;

public class Account {
	private long accountNumber;
	private double balance;
	private String name;
	
	
	@Override
	public String toString() {
		return "Account [accountNumber=" + accountNumber + ", balance=" + balance + ", name=" + name + "]";
	}
	
	

	public Account() {
		super();
		this.accountNumber = accountNumber;
		this.balance = balance;
		this.name = name;
	}



	public void setAccountNumber(long accountNumber) {
		this.accountNumber=accountNumber;
	}
	public long getaccountNumber() {
		return accountNumber;
	}
	public void setbalance(double balance) {
		if(balance>0) {
			this.balance= balance;
		}else {
			System.err.println("Invalid enetered amount");
		}
	}
	public double getbalance() {
		return balance;
	}
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}


}
