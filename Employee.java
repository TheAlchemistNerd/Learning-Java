import java.io.*;
public class Employee {
	
	String name;
	int age;
	String designation;
	double salary;
	
	// This is the constructor of the Employee class
	public Employee(final String name) { //Parametrized constructor
		this.name = name;
	}
	
	// Assign the age of the Employee to the variable age.
	public void empAge(final int empAge) {
		age = empAge;
	}
	
	/* Assign the designation to the variable designation */
	public void empDesignation(final String empDesig) {
		designation = empDesig;
	}
	
	/* Assign the salary to the variable salary */
	public void empSalary(final double empSalary) {
		salary = empSalary;
	}
	
	/* Print the Employee details */
	public void printEmployee() {
		System.out.println("Name:"+ name);
		System.out.println("Age:" + age);
		System.out.println("Designation:" + designation);
		System.out.println("Salary:" + salary);
	}
}
	
		
	
	
	
