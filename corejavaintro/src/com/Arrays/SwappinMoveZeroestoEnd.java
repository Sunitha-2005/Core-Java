package com.Arrays;

import java.util.Scanner;

public class SwappinMoveZeroestoEnd {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size");
		int n=sc.nextInt();
		int[] arr = new int[n];
		int index=0;
		System.out.println("Enter array elements");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
			if(arr[i]!=0) {
				int temp=arr[i];
				arr[i]=arr[index];
				arr[index]=temp;
				index++;
			}
		}
		System.out.println("\n after moves all zeroes to end");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i] + " ");
		}
		

	}

}
