
class Vehicle {
	private String company;
	private double price;
	
	Vehicle (String company, double price) {
		this.company = company;
		this.price = price;
	}

	public String getCompany() {
		return company;
	}

	public double getPrice() {
		return price;
	}
	
	public void printDetails() {
		System.out.println("company: " + company);
		System.out.println("price: " + price);
		System.out.println();
	}
}

class Car extends Vehicle {
	private boolean isElectric;
	
	Car(String company, double price, boolean isElectric) {
		super(company, price);
		this.isElectric = isElectric;
	}
	
	@Override
	public void printDetails() {
		System.out.println("company: " + this.getCompany());
		System.out.println("price: " + this.getPrice());
		System.out.println("Is electric: " + isElectric);
		System.out.println();
	}
}

class Bike extends Vehicle {
	private String type;
	
	public Bike(String company, double price, String type) {
		super(company, price);
		this.type = type;
	}
	
	@Override
	public void printDetails() {
		System.out.println("company: " + this.getCompany());
		System.out.println("price: " + this.getPrice());
		System.out.println("type: " + type);
		System.out.println();
	}
}

public class DemonstrateInheritence {
	public static void main(String[] args) {
		Car car1 = new Car("Maruti", 1000000, false);
		car1.printDetails();
		
		Bike bike1 = new Bike("Honda", 200000, "SuperBike");
		bike1.printDetails();
	}
}
