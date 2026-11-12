package com.Arrays;

public class CountEvenandodd {

	public static void main(String[] args) {
		int[] arr= {50,20,10,15,11,22,25,29};
		int n=arr.length;
		int e_count=0;
		int o_count=0;
		
		for(int i=0;i<n;i++) {
			if(arr[i]%2==0) {
				e_count+=1;
		}else {
			o_count+=1;
			
		}
		}
			System.out.println(e_count);
			System.out.println(o_count);
		
	}
}