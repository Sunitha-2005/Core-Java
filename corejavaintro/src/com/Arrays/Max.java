package com.Arrays;

public class Max {

	public static void main(String[] args) {
		int[] arr= {25000,40000,30000,50000,35000};
		int max=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
			
		}
		System.out.println("The highest salary is:" + max);

	}

}
