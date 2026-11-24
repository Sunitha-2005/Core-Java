package com.Arrays;

import java.util.Scanner;

public class SumofPrev {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size:");
		int n=sc.nextInt();
		int[] arr = new int[n];//10 20 30 40	
		System.out.println("Enter elements:");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();		
		}
		for(int i=0;i<arr.length;i++) {
			int sum=0;
			if(i==0) {
				sum = arr[i]+arr[i+1];
			}else if(i==arr.length-1){
				sum=arr[i-1]+arr[i];
			} else {
				sum=arr[i-1]+arr[i+1];
			}
			System.out.println("The resultant sum is:" + sum );
			
			
		}
		

	}


}
