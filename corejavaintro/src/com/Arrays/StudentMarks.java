package com.Arrays;

public class StudentMarks {

	public static void main(String[] args) {
		int[] marks= {99,98,97,96,95};
		int n=marks.length;
		double sum=0;
		double avg=0;
		for(int i=0;i<n;i++ ) {
			sum+=marks[i];
		}
		avg=sum/n;
		System.out.println("The sum of marks is: " +sum);
		System.out.println("The avg of marks is: " +avg);
		// TODO Auto-generated method stub

	}

}
