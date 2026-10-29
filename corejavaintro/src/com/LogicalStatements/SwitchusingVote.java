package com.LogicalStatements;

import java.util.Scanner;

//using switchcase vote eligibility based on some rules
public class SwitchusingVote {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String ev="";
		do {
			System.out.println("Enter your age");
			int age=sc.nextInt();
			System.out.println("Are you indiancitizenship or not(true/false)");
			boolean indiancitizenship=sc.nextBoolean();
			System.out.println("Do you have voterid(true/false)");
			boolean hasVoterid=sc.nextBoolean();
			int choice;
			if(age<0) {
				choice=1;
			}else if(age<18) {
				choice=2;
			}else if(!indiancitizenship) {
				choice=3;
			}else if(!hasVoterid) {
				choice=4;
			}else {
				choice=5;
			}
			switch(choice) {
			case 1 -> System.out.println("Enter age is invalid age");
			case 2 -> System.out.println("below 18 persons are not eligible to vote");
			case 3 -> System.out.println("yor are  not eligible to vote");
			case 4 -> System.out.println("You have required voterid");
			case 5 -> System.out.println(" you are Eligible to vote ");
			default -> System.out.println("Invalid information");
			}
			System.out.println("Do you want continue...?Click Y for yes and N for No");

			ev=sc.next();
		}while(ev.equalsIgnoreCase("y"));
		System.out.println("program closed");
	}
}
