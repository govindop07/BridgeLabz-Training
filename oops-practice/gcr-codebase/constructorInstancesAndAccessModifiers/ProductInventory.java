package com.constructorInstancesAndAccessModifiers;

//Problem 1: Product Inventory
//Create a Product class with:
//Instance Variables: productName, price.
//Class Variable: totalProducts (shared among all products).
//Methods:
//An instance method displayProductDetails() to display the details of a product.
//A class method displayTotalProducts() to show the total number of products created.

class Product {
	static int totalProducts;
	String productName;
	double price;
	
	Product(String productName, double price) {
		this.productName = productName;
		this.price = price;
		totalProducts++;
	}
	
	void displayProductDetails() {
		System.out.println("Product name: " + this.productName);
		System.out.println("Product price: " + this.price + "\n");
	}
	
	static void displayTotalProducts() {
		System.out.println("Total products: " + totalProducts);
	}
	
}

public class ProductInventory {
	public static void main(String[] args) {
		Product product1 = new Product("Phone" , 25000);
		Product product2 = new Product("Laptop" , 75000);
		
		product1.displayProductDetails();
		product2.displayProductDetails();
		
		Product.displayTotalProducts();
	}
}
