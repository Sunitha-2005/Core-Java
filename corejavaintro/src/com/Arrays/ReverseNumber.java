package com.Arrays;
import java.util.Scanner;
public class ReverseNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array:");
		int n=sc.nextInt();
		int[] arr1 = new int[n];
		System.out.println("Enter elements ");
		for(int i=0;i<n;i++) {
		  arr1[i]=sc.nextInt();
		}
		System.out.println("Reversed number");
		for(int i=0;i<arr1.length;i++) {
			int num=arr1[i];
			int rev=0;
			while(num>0) {
				int rem=num%10;
				rev = rev*10+rem;
				num=num/10;
			}
		
			System.out.println(rev + " ");
		}
					
	}
}
