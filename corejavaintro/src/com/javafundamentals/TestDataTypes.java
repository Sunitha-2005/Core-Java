package com.javafundamentals;
class Employee{
	int eid;
	String ename;
	double esal;
	int age;	
	//Address address = new Address();
}
class Address{
	String flat;
	String plot;
	String street;
	String city;
	int zipcode;
}
public class TestDataTypes {
	public static void main(String[] args) {
		Employee emp = new Employee();
	    Address address = new Address();
	    emp.eid=101;
	    emp.ename="Sunitha";
	    emp.esal=1900;
	    emp.age=21;
	    System.out.println("employee id is : " + emp.eid);
	    System.out.println("employee name is : " + emp.ename);
	    System.out.println("employee salary is : " + emp.esal);
	    System.out.println("employee age : " + emp.age);
	    address.flat="LIC-12";
	    address.plot="lic1";
	    address.city="HYD";
	    address.street="kphb";
	    address.zipcode=500072;
	    System.out.println(address.flat);
	    System.out.println(address.city);
	    System.out.println(address.street);
	    System.out.println(address.plot);
	    System.out.println(address.zipcode);
	}
}