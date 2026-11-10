package com.loopingstatements;

import java.util.Random;
import java.util.Scanner;

public class GameChance {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String gn="";
		do {
			Random r = new Random();
			int guess=r.nextInt(100);
			
		
			int choice=3;
			for(int i=0;i<=choice;i++) {
				System.out.println("Enter a guess number");
				int g_no=sc.nextInt();
				if(guess==g_no) {
					System.out.println("Congradulation! You have guessded correct number");
					break;
					
				}else if(g_no<guess) {
					System.out.println("Too low!Try Again");
				}else {
					System.out.println("Too High! Try again");
				}
				
			}
			System.out.println("Game over");
			System.out.println("Random number is: " + guess);
			System.out.println("Do you want to continue Y for yes and N for No");
			gn=sc.next();

		}while(gn.equalsIgnoreCase("y"));
		System.out.println("Close program");
		
	}

}
