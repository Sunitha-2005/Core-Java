package com.Arrays;

import java.util.Scanner;

public class PositiveNegative {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count_pos=0;
		int count_negative=0;
		
		System.out.println("Enter array size:");
		int n=sc.nextInt();
	    int[] arr = new int[n];
		System.out.println("Enter array elements:");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
			if(arr[i]>0) {
				count_pos++;
				
				
			}else {
				count_negative++;
				
			}
		}
		System.out.println("The total number of positive count is:" + count_pos);
		System.out.println("The total number of positive count is:" + count_negative);
	}
}
		
		
	