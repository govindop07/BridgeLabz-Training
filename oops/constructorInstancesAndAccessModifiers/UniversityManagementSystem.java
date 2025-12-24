package com.constructorInstancesAndAccessModifiers;

//Problem 1: University Management System
//Create a Student class with:
//rollNumber (public).
//name (protected).
//CGPA (private).
//Write methods to:
//Access and modify CGPA using public methods.
//Create a subclass PostgraduateStudent to demonstrate the use of protected members.

class Student {
	public int rollNumber;
	protected String name;
	private double CGPA;
	
	Student(int rollNumber, String name, double CGPA) {
		this.rollNumber = rollNumber;
		this.name = name;
		this.CGPA = CGPA;
	}
	
	public double getCGPA() {
		return this.CGPA;
	}
	
	public void setCGPA(double newCGPA) {
		CGPA = newCGPA;
		System.out.println("New CGPA is: " + CGPA);
	}
	
	public void printDetails() {
		System.out.println("Student name: " + name);
		System.out.println("Student roll number: " + rollNumber);
		System.out.println("Student CGPA: " + CGPA);
	}
}

class PostGraduateStudent extends Student {

	PostGraduateStudent(int rollNumber, String name, double CGPA) {
		super(rollNumber, name, CGPA);
	}
	
	public void printDetails() {
		System.out.println("Student name: " + name);
		System.out.println("Student roll number: " + rollNumber);
		System.out.println("Student CGPA: " + getCGPA());		
	}
	
}

public class UniversityManagementSystem {
	public static void main(String[] args) {
		Student s1 = new Student(2, "Govind", 7.5);
		s1.printDetails();
		
		PostGraduateStudent ps = new PostGraduateStudent(12, "Gopal", 8);
		ps.printDetails();
	}
}
