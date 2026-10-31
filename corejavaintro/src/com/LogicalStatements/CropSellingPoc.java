package com.LogicalStatements;
import java.util.Scanner;
//WA Switch POC: Crop Selling and Income Calculator
public class CropSellingPoc {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String yn = "";
		double total_price = 0;
		do {
			System.out.println("Enter category (grains/Commercial/veg)");
			String cat = sc.next();
			switch (cat) {
			case "grains" -> {
				double all_grain_price = 0;
				String gn = "";
				do {
					System.out.println("Enter grain item (paddy/maize/wheat/jowar/bajra)");
					String grain_items = sc.next();
					System.out.println("Enter quantity in kg");
					double quantity = sc.nextDouble();
					switch (grain_items) {
					case "paddy" -> {
						double price = 30;
						double income = quantity * price;
						System.out.println("Paddy price per kg = 30 rs");
						System.out.println("Paddy income = " + income + " rs");
						all_grain_price += income;
					}
					case "maize" -> {
						double price = 25;
						double income = quantity * price;
						System.out.println("Maize price per kg = 25 rs");
						System.out.println("Maize income = " + income + " rs");
						all_grain_price += income;
					}
					case "wheat" -> {
						double price = 28;
						double income = quantity * price;
						System.out.println("Wheat price per kg = 28 rs");
						System.out.println("Wheat income = " + income + " rs");
						all_grain_price += income;
					}
	     			case "jowar" -> {
						double price = 32;
						double income = quantity * price;
						System.out.println("Jowar price per kg = 32 rs");
						System.out.println("Jowar income = " + income + " rs");
						all_grain_price += income;
					}
					case "bajra" -> {
						double price = 27;
						double income = quantity * price;
						System.out.println("Bajra price per kg = 27 rs");
						System.out.println("Bajra income = " + income + " rs");
						all_grain_price += income;
					}
					default -> System.out.println("Grain is not available!");
					}
					System.out.println("Do you want to Continue with grains? Click Y for yes and  N for no");
					gn = sc.next();
				} while (gn.equalsIgnoreCase("y"));
				System.out.println("Total grain income = " + all_grain_price + " rs");
				total_price += all_grain_price;
			}
			case "Commercial" -> {
				double all_commercial_price = 0;
				String cn = "";
				do {
					System.out.println("Enter crop categary like(cotton/chilly/turmeric/groundnut)");
					String crop_items = sc.next();
					System.out.println("Enter quantity in kg");
					double quantity = sc.nextDouble();
					switch (crop_items) {
					case "cotton" -> {
						double price = 70;
						double income = quantity * price;
						System.out.println("Cotton price per kg = 70 rs");
						System.out.println("Cotton income = " + income + " rs");
						all_commercial_price += income;
					}
					case "chilly" -> {
						double price = 50;
						double income = quantity * price;
						System.out.println("Chilly price per kg = 50 rs");
						System.out.println("Chilly income = " + income + " rs");
						all_commercial_price += income;
					}
					case "turmeric" -> {
						double price = 90;
						double income = quantity * price;
						System.out.println("Turmeric price per kg = 90 rs");
						System.out.println("Turmeric income = " + income + " rs");
						all_commercial_price += income;
					}
					case "groundnut" -> {
						double price = 60;
						double income = quantity * price;
						System.out.println("Groundnut price per kg = 60 rs");
						System.out.println("Groundnut income = " + income + " rs");
						all_commercial_price += income;
					}
					default -> System.out.println("Commercial crop is not available!");
					}
					System.out.println("Do you want to Continue with category? click Y for yes and  N for No");
					cn = sc.next();
				} while (cn.equalsIgnoreCase("y"));
				System.out.println("Total commercial crop income = " + all_commercial_price + " rs");
				total_price += all_commercial_price;
			}
			case "veg" -> {
     			double all_veg_price = 0;
				String vn = "";
				do {
					System.out.println("Enter vegetable (tomato/potato/onion/carrot/brinjal/cabbage/beans/okra)");
					String veg_items = sc.next();
					System.out.println("Enter quantity in kg");
					double quantity = sc.nextDouble();
					switch (veg_items) {
					case "tomato" -> {
						double price = 25;
						double income = quantity * price;
						System.out.println("Tomato price per kg = 25 rs");
						System.out.println("Tomato income = " + income + " rs");
						all_veg_price += income;
					}
					case "potato" -> {
						double price = 30;
						double income = quantity * price;
						System.out.println("Potato price per kg = 30 rs");
						System.out.println("Potato income = " + income + " rs");
						all_veg_price += income;
					}
					case "onion" -> {
						double price = 35;
						double income = quantity * price;
						System.out.println("Onion price per kg = 35 rs");
						System.out.println("Onion income = " + income + " rs");
						all_veg_price += income;
					}
					case "carrot" -> {
						double price = 40;
						double income = quantity * price;
						System.out.println("Carrot price per kg = 40 rs");
						System.out.println("Carrot income = " + income + " rs");
						all_veg_price += income;
					}
					case "brinjal" -> {
						double price = 30;
						double income = quantity * price;
						System.out.println("Brinjal price per kg = 30 rs");
						System.out.println("Brinjal income = " + income + " rs");
						all_veg_price += income;
					}
					case "cabbage" -> {
						double price = 20;
						double income = quantity * price;
						System.out.println("Cabbage price per kg = 20 rs");
						System.out.println("Cabbage income = " + income + " rs");
						all_veg_price += income;
					}
					case "beans" -> {
						double price = 50;
						double income = quantity * price;
						System.out.println("Beans price per kg = 50 rs");
						System.out.println("Beans income = " + income + " rs");
						all_veg_price += income;
					}
					case "okra" -> {
						double price = 35;
						double income = quantity * price;
						System.out.println("Okra price per kg = 35 rs");
						System.out.println("Okra income = " + income + " rs");
						all_veg_price += income;
					}
					default -> System.out.println("Vegetable is not available!");
					}
					System.out.println("Do you want to Continue with category? click  Y for yes and N for No");
					vn = sc.next();
				} while (vn.equalsIgnoreCase("y"));
				System.out.println("Total vegetable income = " + all_veg_price + " rs");
				total_price += all_veg_price;
			}
			default -> System.out.println("Category is not available!");
			}
			System.out.println("Do you want to Continue with  category? click Y for yes  and  N for No");
			yn = sc.next();
		} while (yn.equalsIgnoreCase("y"));
		System.out.println("Total crop selling income = " + total_price + " rs");
	}
}