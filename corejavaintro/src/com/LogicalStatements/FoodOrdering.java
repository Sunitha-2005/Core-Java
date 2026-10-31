package com.LogicalStatements;

import java.util.Scanner;

public class FoodOrdering {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double total_bill=0;
		String fi="";
		do {
			System.out.println("Enter the food items(pizza,Burger,Biryani,Noodles)");
			String food_items=sc.next();
			switch(food_items) {
			case "Pizza"->{
				//double pizza_price=200;
				System.out.println("The price of each pizza =200rs");
				double pizza_price=200;
				System.out.println("Enter quantity");
				double quantity=sc.nextDouble();
				total_bill=pizza_price* quantity;
				
			}
			case "Burger"->{
				System.out.println("The price of burger =120rs");
				double burger_price=120;
				System.out.println("Enter quantity");
				double quantity=sc.nextDouble();
				total_bill=burger_price* quantity;	
			}
			case "Biryani" ->{
				System.out.println("The price of Biryani =180 rs");
				double biryani_price=180;
				System.out.println("Enter quantity");
				double quantity=sc.nextDouble();
				total_bill=biryani_price*quantity;	
				
			}
			case "Noodles"->{
				System.out.println("The price of noodles =100rs");
				double noodle_price=100;
				System.out.println("Enter quantity");
				double quantity=sc.nextDouble();
				total_bill=noodle_price*quantity;	
			}
			default->System.out.println("Enter food items are not available");
			}
			System.out.println("Total bille is :" +total_bill);
			System.out.println("Do you want to continue? Click Y for yes and N for No");
			
			fi=sc.next();
			
		}while(fi.equalsIgnoreCase("y"));
		
		System.out.println("Program closed");

	}

}
