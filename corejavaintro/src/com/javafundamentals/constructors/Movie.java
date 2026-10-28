package com.javafundamentals.constructors;
//Copy Constructor Example
public class Movie {
	String name;
	String hero;
	String heroine;
	String director;
	double budget;
	Movie(){
		System.out.println("no arg constructor called!!!....");
	}
	Movie(Movie m){
		this.name=m.name;
		this.hero=m.hero;
		this.heroine=m.heroine;
		this.director=m.director;
		this.budget=m.budget;
		
	}
	

	public static void main(String[] args) {
		System.out.println("Main method started");
		
		Movie m = new Movie();
		m.name="varanashi";
		m.hero="mahesh babu";
		m.heroine="priyanka";
		m.director="ss Rajamouli";
		m.budget=500000.00;
		m.movieInfo();
		
		Movie m1 = new Movie(m);
		m1.movieInfo();
		
		
		System.out.println("Main method ended");

	}
	void movieInfo() {
		System.out.println("Name of the movie:" +name);
		System.out.println("hero of the movie:" +hero);
		System.out.println("heroine of the movie:" +heroine);
		System.out.println("director of the movie:" +director);
		System.out.println("budget of the movie:" +budget);
		System.out.println("********************************");
	}

}
