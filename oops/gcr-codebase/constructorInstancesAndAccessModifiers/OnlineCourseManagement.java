package com.constructorInstancesAndAccessModifiers;

//Problem 2: Online Course Management
//Design a Course class with:
//Instance Variables: courseName, duration, fee.
//Class Variable: instituteName (common for all courses).
//Methods:
//An instance method displayCourseDetails() to display the course details.
//A class method updateInstituteName() to modify the institute name for all courses.

class Course {
	static String instituteName = "Govind institude";
	
	String courseName;
	int duration;
	double fee;
	
	Course(String courseName, int duration, double fee) {
		this.courseName = courseName;
		this.duration = duration;
		this.fee = fee;
	}
	
	public void displayCourseDetails() {
		System.out.println("Course name: " + courseName);
		System.out.println("Course duration: " + duration);
		System.out.println("Course fee: " + fee + " \n");
	}
	
	public static void updateInstituteName(String newName) {
		instituteName = newName;
		System.out.println("New intitude name is: " + instituteName);
	}
	
}

public class OnlineCourseManagement {
	public static void main(String[] args) {
		Course c1 = new Course("c1", 10, 10000);
		Course c2 = new Course("c2", 20, 20000);
		
		c1.displayCourseDetails();
		c2.displayCourseDetails();
		
		Course.updateInstituteName("Govind University");
	}
}
