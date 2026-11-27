package com.Arrays;

public class SecMax {

	public static void main(String[] args) {
		int[] salary= {25000,40000,30000,50000,35000};
		int highest_sal=salary[0];
		int second_highest=salary[0];
		int lowest=salary[0];
		int count=0;
		int total=0;
		for(int i=0;i<salary.length;i++) {
			if(salary[i]>highest_sal) {
				second_highest=highest_sal;
				highest_sal=salary[i];
			}else if(salary[i]>second_highest && salary[i]<highest_sal) {
				second_highest=salary[i];
				
			}if(salary[i]<lowest) {
				lowest=salary[i];
			}if(salary[i]>30000) {
				count++;
				
			}
			total=total+salary[i];
		}
		System.out.println("The highest in the array is:" +highest_sal);
		System.out.println("The second highest salary in the array is: " + second_highest);
		System.out.println("The lowest salary in the array is: " + lowest);
		System.out.println("Count salary greater than 30000: " + count);
		System.out.println("Final bill is : " + total);
		

	}

}
