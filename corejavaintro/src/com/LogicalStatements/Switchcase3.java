package com.LogicalStatements;

import java.util.Scanner;

//WAP days in a week
public class Switchcase3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a days in a week(1-7)");
		int day=sc.nextInt();
		String dayname = switch(day) {
		case 1 -> "Monday";
		case 2 -> "tuesday";
		case 3 -> "wednesday";
		case 4 -> "thursday";
		case 5 -> "friday";
		case 6 -> "saturday";
		case 7 -> "sunitha";
		default ->"Invalid day";
		
		};
		System.out.println("day name is:"+dayname);
		// TODO Auto-generated method stub

	}

}
