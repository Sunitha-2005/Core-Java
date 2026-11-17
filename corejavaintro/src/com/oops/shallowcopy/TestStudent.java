package com.oops.shallowcopy;

public class TestStudent {

	public static void main(String[] args) throws CloneNotSupportedException {
		Address1 add = new Address1("warangal");
		Student st = new Student("Sunitha",add);
		System.out.println(st.name);
		System.out.println(st.address.city);
		
		Student st1 = (Student) st.clone();
		System.out.println(st1.name);
		System.out.println(st1.address.city);
		
		
		st1.name="Anitha";
		st1.address.city="hyd";
		System.out.println(st1.name);
		System.out.println(st1.address.city);

	}

}
