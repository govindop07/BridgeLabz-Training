package com.constructorInstancesAndAccessModifiers;

//Problem 3: Vehicle Registration
//Create a Vehicle class to manage the details of vehicles:
//Instance Variables: ownerName, vehicleType.
//Class Variable: registrationFee (fixed for all vehicles).
//Methods:
//An instance method displayVehicleDetails() to display owner and vehicle details.
//A class method updateRegistrationFee() to change the registration fee.

class Vehicle {
	private static double registrationFee = 20000;
	String ownerName;
	String vehicleType;
	
	Vehicle(String ownerName, String vehicleType) {
		this.ownerName = ownerName;
		this.vehicleType = vehicleType;
	}
	
	public void displayVehicleDetails() {
		System.out.println("Owner name: " + ownerName);
		System.out.println("vehicle type: " + vehicleType);
		System.out.println("Registration fee: " + registrationFee + "\n");
	}
	
	public static void updateRegistrationFee(double newFee) {
		registrationFee = newFee;
		System.out.println("New registration fee is: " + registrationFee);
	}
}

public class VehicleRegistration {
	public static void main(String[] args) {
		Vehicle v1 = new Vehicle("Govind", "Car");
		v1.displayVehicleDetails();
		
		Vehicle.updateRegistrationFee(25000);
		
		Vehicle v2 = new Vehicle("Govind", "Bus");
		v2.displayVehicleDetails();
		
	}
}
