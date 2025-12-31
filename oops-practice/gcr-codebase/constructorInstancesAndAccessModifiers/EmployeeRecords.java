package com.constructorInstancesAndAccessModifiers;

//Problem 4: Employee Records
//Develop an Employee class with:
//employeeID (public).
//department (protected).
//salary (private).
//Write methods to:
//Modify salary using a public method.
//Create a subclass Manager to access employeeID and department.

class Employee {
    public String employeeID;
    protected String department;
    private double salary;
    
    public Employee(String employeeID, String department, double salary) {
        this.employeeID = employeeID;
        this.department = department;
        this.salary = salary;
    }
    
    public double getSalary() {
        return salary;
    }
    
    public void setSalary(double salary) {
        if (salary > 0) {
            this.salary = salary;
        }
    }
}

class Manager extends Employee {
    private String teamName;
    
    public Manager(String employeeID, String department, double salary, String teamName) {
        super(employeeID, department, salary);
        this.teamName = teamName;
    }
    
    public void displayManager() {
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Department: " + department);
        System.out.printf("Salary: $%.2f%n", getSalary());
        System.out.println("Team: " + teamName + "\n");
    }
}

public class EmployeeRecords{
    public static void main(String[] args) {
        Manager mgr = new Manager("M1", "IT", 90000, "Development Team");
        mgr.displayManager();
    }
}