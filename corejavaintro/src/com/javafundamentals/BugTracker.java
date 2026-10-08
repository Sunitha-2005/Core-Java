package com.javafundamentals;

public class BugTracker {
	int Bugid=12;
	String App_name="ecommerce";
	String bug_title="Application";
	String severity = "critical";
	String priority = "low";
	String status = "depart" ;
	String assi_developer = "bugTracker";
	static void bugid(int id){
		System.out.println("Big id values : " + id);
		
	}
	 void application(String App_name) {
		System.out.println("Application name is: " +App_name);
	}
	 void title(String Title) {
		System.out.println("bug title: " + Title);
	}
	 void sever(String severity) {
		System.out.println("severity condition: " + severity);
	}
	 void pri(String priority) {
		System.out.println("priority is:" + priority);
	}
	 void stat(String status) {
		System.out.println("status of the application:" +status);
	}
	 void developer(String assi_developer) {
		System.out.println("assign value:" +assi_developer);
	}

	

	public static void main(String[] args) {
		BugTracker bt = new BugTracker();
		bugid(bt.Bugid);
		bt.application(bt.App_name);
		bt.title(bt.bug_title);
		bt.sever(bt.severity);
		bt.pri(bt.priority);
		bt.stat(bt.status);
		bt.developer(bt.assi_developer);
		
		
	
	}

}
