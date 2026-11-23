package com.oops;

public class Employee {
	private int id;
    private String name;
    private double salary;
    private long password;
    
   
	public void setId(int id) {
    	this.id=id;	
    }
    public int getid() {
    	return id;
    }
    public void setName(String name) {
    	this.name=name;
    }
    public String getName() {
    	return name;
    }
    public void setSalary(double salary) {
    	if(salary>0) {
    		this.salary=salary;
    	}else {
    		System.err.println("Invalid salary");
    	}
    }public double getsalary() {
    	return salary;
    }
    public void setPassword(long password) {
    	this.password=password;
    }
    public long getpassword() {
    	return password;
    }
 

}
