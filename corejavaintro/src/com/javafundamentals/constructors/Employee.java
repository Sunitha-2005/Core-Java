package com.javafundamentals.constructors;

public class Employee {
	int emp_id;
	String emp_name;
	double emp_sal;
	
	Employee (int emp_id,String emp_name,double emp_sal){
		this.emp_id=emp_id;
		this.emp_name=emp_name;
		this.emp_sal=emp_sal;
			
	}
	
	public static void main(String[] args) {
		Employee em = new Employee(1208,"Sunitha",50000.00);
		Employee em1 = new Employee(1209,"Anitha",40000.00);
		em.display();
		em1.display();
		
	}
	double calBonus() {
		return emp_sal*10/100;
		
	}
	void display() {
		double bonus = calBonus();
        double finalSalary = emp_sal + bonus;
		System.out.println("Employee  id is:" +emp_id);
		System.out.println("Employee name is: " +emp_name);
		System.out.println("Employee  Salary is : " +emp_sal);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		System.out.println("Employee bonus is:" + bonus );
		System.out.println("The finalSalary of the employee is:" +finalSalary);
		System.out.println("*******************************************");
	}

}
