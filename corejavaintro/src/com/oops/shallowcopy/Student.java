package com.oops.shallowcopy;



 public class Student implements Cloneable {
	String name;
	Address1 address;

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	public Student(String name, Address1 address) {
		// super();
		this.name = name;
		this.address = address;
	}
}
