package com.Arrays;

import java.util.Scanner;

public class Occurrance {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr= {2,1,3,4,5,5,5,4,3,2,};
		int count=0;
		System.out.println("Enter the element");
		int n=sc.nextInt();
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==n) {
				count++;
			}
		}
		System.out.println("The count of the given number is: " +count);
		// TODO Auto-generated method stub

	}

}
