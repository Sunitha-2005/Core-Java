package com.LogicalStatements;

import java.util.Scanner;

//WAP to print vote eligibility based on age
public class VoterEligibility {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your age");
		int age=sc.nextInt();
		System.out.println("Are you indiancitizenship or not(true/false)");
		boolean indiancitizenship=sc.nextBoolean();
		System.out.println("Do you have voterid");
		boolean hasvoterid=sc.nextBoolean();
		if(age<0) {
			System.out.println("not valid");
		}else if(age<18) {
			System.out.println("Below 18 year people are not eligible to vote");
		}else if(!indiancitizenship) {
			System.out.println("you are not eligible to vote");
		}else if(!hasvoterid) {
			System.out.println("voter id required");	
		}else {
			System.out.println("eligible to vote");
		}
	}
}
		