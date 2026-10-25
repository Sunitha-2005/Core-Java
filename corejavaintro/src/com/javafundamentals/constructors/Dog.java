package com.javafundamentals.constructors;
 class  Animal{
	 int age=5;
	 String breed="Labrador Retriever";
	 public static void main(String[] args) {
		 System.out.println("Main method started from animal!!...");
	 }
	 
 }
public class Dog extends Animal{
	int age=6;
	String breed="German Shepherd";

	public static void main(String[] args) {
		System.out.println("main method started from dog!!...");
		Dog d = new Dog();
		d.dogInfo();
			
	}
	void dogInfo() {
		System.out.println("Age of the Dog: " +super.age);
		System.out.println("Age of the Dog: " +super.breed);
		
		System.out.println("************child******");
		
		System.out.println("Age of the Dog: " +this.age);
		System.out.println("Age of the Dog: " +this.breed);
		
		
	}

}
