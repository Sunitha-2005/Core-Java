package com.javafundamentals;
import java.util.Scanner;
public class LoanManagement {
	String cust_name;
	double Loan_amount;
	double interest_Rate;
	int Loan_Tenure;


	    public static void main(String[] args) {
		System.out.println("Main method started");
		Scanner sc = new Scanner(System.in);
		LoanManagement lm=new LoanManagement ();
		lm.cust_name="Vijendar";
		lm.Loan_amount=10000;
		lm.interest_Rate=8;
		lm.Loan_Tenure=2;
	
		double l1 = lm.calculateinterest(lm.Loan_amount,lm.interest_Rate);
		double t1=lm.calculateTotalAmount(l1);
		double e1 = lm.calculateMonthlyEMI(t1, lm.Loan_Tenure);
		lm.displayLoanSummary(l1,t1,e1);
		
		
		LoanManagement lm2=new LoanManagement ();
		lm2.cust_name="Sunitha";
		lm2.Loan_amount=1008;
		lm2.interest_Rate=4;
		lm2.Loan_Tenure=3;
		double l2 = lm2.calculateinterest(lm2.Loan_amount,lm2.interest_Rate);
		double t2=lm2.calculateTotalAmount(l2);
		double e2 = lm2.calculateMonthlyEMI(t2, lm2.Loan_Tenure);
		lm2.displayLoanSummary(l2,t2,e2);
		
		
		System.out.println("Main method ended");
		sc.close();

	}
	double calculateinterest(double loanamount,double interest) {
		 return (loanamount*interest*Loan_Tenure)/100;

	}
	double calculateTotalAmount(double interest) {
		
		return Loan_amount+interest;
	}
	double calculateMonthlyEMI(double totalamount,int Loan_Tenure) {
		return totalamount/(Loan_Tenure*12.0);
		
		
	}
	void displayLoanSummary(double interest,double totalamount,double emi) {
		
		System.out.println("The number of the customer is :" + cust_name);
		System.out.println("The total loan amount is :" + Loan_amount);
		System.out.println("the total interest is: " + interest);
		System.out.println("the loan tenture is : " + Loan_Tenure);	
		System.out.println("the total amount is : " + totalamount);	
		System.out.println("the total emi t is : " + emi);	
	}

}
