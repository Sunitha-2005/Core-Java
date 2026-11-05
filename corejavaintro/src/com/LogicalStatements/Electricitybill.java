package com.LogicalStatements;

import java.util.Scanner;
public class Electricitybill {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("1. Domestic");
		System.out.println("2. Commercial");
		System.out.println("Enter the connection type");
		int type = sc.nextInt();
		System.out.println("Enter the units");
		int units = sc.nextInt();
		int rate_per_unit = 0;
		int total_Electricity_bill = 0;
		switch (type) {
		case 1 -> {
			if (units <= 100) {
				rate_per_unit = 2;
			} else {
				rate_per_unit = 3;
			}
			total_Electricity_bill = units * rate_per_unit;
		}
		case 2 -> {
			if (units <= 100) {
				rate_per_unit = 4;
			} else if (units <= 300) {
				rate_per_unit = 6;
			} else {
				rate_per_unit = 8;
			}
			total_Electricity_bill = units * rate_per_unit;
		}
		default -> System.out.println("Invalid connection type");
		}
		if (type == 1 || type == 2) {
			System.out.println("Connection Type: " + (type == 1 ? "Domestic" : "Commercial"));

			System.out.println("Units Consumed: " + units);
			System.out.println("Rate Per Unit: " + rate_per_unit);
			System.out.println("Total Electricity Bill: " + total_Electricity_bill);
		}
	}
}