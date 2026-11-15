package com.Arrays;

public class SecondLargest {

	public static void main(String[] args) {
		
		int[] arr= {2,7,13,9,8,13};
		int max=arr[0];
		int sec_max=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				sec_max=max;
				max=arr[i];
			}else if(arr[i]>sec_max && arr[i]<max) {
				sec_max=arr[i];
			}
		}
		System.out.println("Second maximum element is : " + sec_max);
	
	}

}
