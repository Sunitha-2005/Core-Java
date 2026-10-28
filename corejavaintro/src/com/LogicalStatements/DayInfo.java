package com.LogicalStatements;
//WAP to print days info String
import java.util.Scanner;

public class DayInfo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String yn;

		do {
			System.out.println("Enter a day");
			String day = sc.next();

			switch (day) {
			case "Monday" -> System.out.println("Monday is a lazyy day");
			case "Tuesday" -> {
				System.out.println("Tuesday is crazyy day");
				System.out.println("It is a boring day");
			}
			case "Wednesday" -> System.out.println("Non-veg day in hostel");
			case "Thursday" -> System.out.println("veg day in hostel");
			case "Friday" -> System.out.println("Weekend njoy day");
			case "Saturday" -> System.out.println("trip with friends");
			case "Sunday" -> System.out.println("Rest day and Sleeply day ");
			default -> System.out.println("Invalid day");

			}
			System.out.println("Do you want to continue Y for yes and N for no");
			yn = sc.next();

		} while (yn.equalsIgnoreCase("y"));
		System.out.println("calculation closed");
	}
}
