package com.Arrays;

public class MaxandMin {

	public static void main(String[] args) {
		int[] numbers= {5,9,1,8,99,88};
		int n=numbers.length;
	
		
		int min=numbers[0];
		int max=numbers[0];
		for(int i=0;i<n;i++) {
			if(numbers[i]<min) {
				min=numbers[i];	
			}
			if(numbers[i]>max) {
				max=numbers[i];
			}
			
		}
		System.out.println("The min number is:" + min);
		System.out.println("The max number is:" + max);

		
	}

}
