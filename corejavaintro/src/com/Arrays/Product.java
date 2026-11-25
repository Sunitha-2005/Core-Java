package com.Arrays;

import java.util.Arrays;

public class Product {

	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5};
		int n=arr.length;
		
		
		for(int i=0;i<n;i++) {
			int product=1;
			for(int j=0;j<n;j++) {
				if(i!=j) {
					product*=arr[j];
					
				}
			}
				
			System.out.print(" "  + product);
		}
	}

}
