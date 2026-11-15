package com.Arrays;

import java.util.Scanner;

public class Search {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = {2,1,2,3,4,5,6,9};
		System.out.println("Enter search element in array:");
		int key=sc.nextInt();
		boolean status=false;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==key) {
				status=true;
				System.out.println("The given number is found in the array:");
				//break;
				
			}
			
		}
		if(!status) {
			System.out.println("The given number is not found in the array");
		}

	}

}
