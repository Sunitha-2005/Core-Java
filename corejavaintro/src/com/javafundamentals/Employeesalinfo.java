package com.javafundamentals;
import java.util.Scanner;
public class Employeesalinfo {
	Scanner sc = new Scanner(System.in);

	    void main(String[] args) {
		System.out.println("Main method started");
		double bs= getBasic();
		double ra = getRentallowance();
		double hrs=getLeavetravelallowance();
		double mp = getMealcoupons();
		double pf = getPF();
		double gd = graduity();
		System.out.println( bs+ra+hrs+mp+pf+gd);
		
		System.out.println("Main method ended");

	}
	double getBasic() {
		System.out.println("Enter your basic sal");
		double basic = sc.nextDouble();
		return basic;
		
	}
	double getRentallowance() {
		System.out.println("Enter your set allowance");
		double ra = sc.nextDouble();
		return ra;
	
	}
	double getLeavetravelallowance() {
		System.out.println("Enter you leave allowance");
		double lta=sc.nextDouble();
		return lta;
	}
	double getMealcoupons() {
		System.out.println("Enter your meal coupons");
		double mcp = sc.nextDouble();
		return mcp;
	}
	double getPF() {
		System.out.println("enter your pf is");
		double pf = sc.nextDouble();
		return pf;
	}
	double graduity() {
		System.out.println("Enter your graduity");
		double gd = sc.nextDouble();
		return gd;
	}
	

}
