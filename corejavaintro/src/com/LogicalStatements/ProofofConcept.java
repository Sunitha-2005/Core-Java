package com.LogicalStatements;

import java.util.Scanner;

//WA Switch :POC( proof of concept ) to provide invoice based on your purchase the fruits or vegatables...

public class ProofofConcept {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Main method started");
		String yn="";
		double total_price=0;
		do {
			System.out.println("Enter the Categary");
			String catgy=sc.next();
			double all_fruit_price=0;
			switch(catgy) {
			case "fruits" ->{
				String fyn="";
				do {
					System.out.println("Enter fruits items");
					String fruits_item=sc.next();
					switch(fruits_item) {
					case "org"->{
						System.out.println("orange 1kg price is =100rs");
						double orgPrice=100;
						all_fruit_price+=orgPrice;	
						
					}
					case "kiwi"->{
						System.out.println("kiwi 1 kg price is =200");
						double kiwiPrice=200;
						all_fruit_price+=kiwiPrice;
					}

					case "app" -> {
					    System.out.println("Apple 1kg price is = 180rs");
					    double appPrice = 180;
					    all_fruit_price += appPrice;
					}

					case "ban" -> {
					    System.out.println("Banana 1kg price is = 60rs");
					    double banPrice = 60;
					    all_fruit_price += banPrice;
					}

					case "man" -> {
					    System.out.println("Mango 1kg price is = 120rs");
					    double manPrice = 120;
					    all_fruit_price += manPrice;
					}

					case "gra" -> {
					    System.out.println("Grapes 1kg price is = 80rs");
					    double graPrice = 80;
					    all_fruit_price += graPrice;
					}

					case "wat" -> {
					    System.out.println("Watermelon 1kg price is = 40rs");
					    double watPrice = 40;
					    all_fruit_price += watPrice;
					}
					default->System.out.println("Enter item is not available:");
					}
					System.out.println("Do you want to continue..?Click Y for yes and N for No");
					fyn=sc.next();
				}while(fyn.equalsIgnoreCase("y"));
				System.out.println("Total fruit price is : " +all_fruit_price);
				total_price+=all_fruit_price;
			}
			case "veg"->{
				String vgn="";
				//double veg_price=0;
				double veg_price=0;
				do {
					System.out.println("Enter vegetable item ");
					String veg_item=sc.next();
					switch(veg_item) {
					case "tmr"->{
						System.out.println("Tomato price is =50rs");
						double tmt_price=50;
						veg_price+=tmt_price;
								
					}
					case "pot" -> {
					    System.out.println("Potato price is = 40rs");
					    double pot_price = 40;
					    veg_price += pot_price;
					}

					case "oni" -> {
					    System.out.println("Onion price is = 60rs");
					    double oni_price = 60;
					    veg_price += oni_price;
					}

					case "car" -> {
					    System.out.println("Carrot price is = 50rs");
					    double car_price = 50;
					    veg_price += car_price;
					}

					case "cab" -> {
					    System.out.println("Cabbage price is = 35rs");
					    double cab_price = 35;
					    veg_price += cab_price;
					}

					case "brin" -> {
					    System.out.println("Brinjal price is = 45rs");
					    double brin_price = 45;
					    veg_price += brin_price;
					}

					case "chi" -> {
					    System.out.println("Chilli price is = 30rs");
					    double chi_price = 30;
					    veg_price += chi_price;
					}

					case "spi" -> {
					    System.out.println("Spinach price is = 25rs");
					    double spi_price = 25;
					    veg_price += spi_price;
					}

					case "cuc" -> {
					    System.out.println("Cucumber price is = 40rs");
					    double cuc_price = 40;
					    veg_price += cuc_price;
					}

					case "lad" -> {
					    System.out.println("Ladies finger price is = 45rs");
					    double lad_price = 45;
					    veg_price += lad_price;
					}

					case "bea" -> {
					    System.out.println("Beans price is = 55rs");
					    double bea_price = 55;
					    veg_price += bea_price;
					}
					default->System.out.println("Entered vegetable is not available!!!");
					}
					System.out.println("Do you want to continue ? Click Y for yes and N for No");
					vgn=sc.next();
				
				}while(vgn.equalsIgnoreCase("y"));
				System.out.println("Total veg price is : "+ veg_price);
				total_price+=veg_price;
				
			}
			}
			System.out.println("Do you want to continue with Categary? Click Y for yes and N for No");
			yn=sc.next();
			
			
			
		}while(yn.equalsIgnoreCase("y"));
		System.out.println(" total price is:" +total_price);
		
		
	}

}
