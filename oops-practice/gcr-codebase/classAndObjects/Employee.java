package com.classAndObjects;

//Program to Display Employee Details
//Problem Statement: Write a program to create an Employee class with attributes name, id, and salary. Add a method to display the details.

public class Employee {
//	non static variables
	int id;
	String name;
	double salary;
	
//	constructor
	Employee(int id , String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
//	method to display employee details
	void displayDetails() {
		System.out.println("id: " + this.id);
		System.out.println("name: " + this.name);
		System.out.println("salary: " + this.salary);
	}
	
	public static void main(String[] args) {
		Employee emp1 = new Employee(1, "Govind", 25000);
		emp1.displayDetails();
	}
}
