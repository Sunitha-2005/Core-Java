package com.Arrays;

public class MaxSubArraySum {

	public static void main(String[] args) {
		int[] nums= {-2,1,-3,4,-1,2,1,-5,4};
		int max=0;
		int first=0;
		int sec = 0;
		
		
		for(int i=0;i<nums.length;i++){
			int curr=0;
			for(int j=i;j<nums.length;j++) {
				curr+=nums[j];
				if(curr>max) {
					max=curr;
					first=i;
					sec=j;
				}
				
			}

		}
		System.out.println(max);
		System.out.println(first+ " " + sec);
	}
}