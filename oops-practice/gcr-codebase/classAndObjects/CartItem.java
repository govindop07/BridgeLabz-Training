package com.classAndObjects;

//Program to Simulate a Shopping Cart
//Problem Statement: Create a CartItem class with attributes itemName, price, and quantity. Add methods to:
//Add an item to the cart.
//Remove an item from the cart.
//Display the total cost.
//Explanation: The CartItem class models a shopping cart item. The methods handle cart operations like adding or removing items and calculating the total cost.


public class CartItem {
   // Attributes for item name, price, and quantity
   private String itemName;
   private double price;
   private int quantity;
   
   // Constructor to initialize the attributes
   public CartItem(String itemName, double price, int quantity) {
       this.itemName = itemName;
       this.price = price;
       this.quantity = quantity;
   }
   
   // Method to add items to the cart
   public void addItem(int quantityToAdd) {
       this.quantity += quantityToAdd;
       System.out.println("Added " + quantityToAdd + " of " + this.itemName + " to the cart.");
   }
   
   // Method to remove items from the cart
   public void removeItem(int quantityToRemove) {
       if (quantityToRemove > this.quantity) {
           System.out.println("Cannot remove " + quantityToRemove + " of " + this.itemName + " as there are only " + this.quantity + " left.");
       } else {
           this.quantity -= quantityToRemove;
           System.out.println("Removed " + quantityToRemove + " of " + this.itemName + " from the cart.");
       }
   }
   
   // Method to calculate the total cost of the items in the cart
   public double totalCost() {
       return this.price * this.quantity;
   }
   
   // Method to display the item details
   public void displayItem() {
       System.out.println("Item: " + this.itemName + ", Price: $" + this.price + ", Quantity: " + this.quantity);
   }
   
   // Main method to test the CartItem class
   public static void main(String[] args) {
       CartItem item1 = new CartItem("Laptop", 999.99, 1);
       item1.displayItem();
       
       item1.addItem(2);
       item1.removeItem(1);
       System.out.println("Total cost: $" + item1.totalCost());
   }
}

