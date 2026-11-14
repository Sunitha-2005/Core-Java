package com.Arrays;

public class MovieZeroeToEnd {

	public static void main(String[] args) {
		
		int[] arr = {1,0,3,2,0,9,0,8,0,7};
		int index=0;
		int i=0;
		for(i=0;i<arr.length;i++) {
			if(arr[i]!=0) {
				arr[index]=arr[i];
				index++;
				System.out.print(arr[i] + " ");
			}
			
		}
		while(index<arr.length) {
			arr[index]=0;
			index++;
		}
		System.out.println("\nAfter all zeroes moves to end");
		for(int k=0;k<arr.length;k++) {
			System.out.print(arr[k] + " ");
		}

	}

}
