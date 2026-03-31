package lambdaExpressions;
import java.util.*;

class Product {
	String name;
	double price;
	double rating;
	int discount;
	
	Product(String name, double price, double rating, int discount) {
		this.name = name;
		this.price = price;
		this.rating = rating;
		this.discount = discount;
	}
	
	public String toString() {
		return "Name: " + this.name + ", price: " + this.price + ", rating: " + this.rating + ", discount: " + discount;
	}
}

public class CustomSortingInECommerce {
	public static void main(String[] args) {

        List<Product> products = new ArrayList<>();
        products.add(new Product("Laptop", 50000, 4.5, 10));
        products.add(new Product("Phone", 20000, 4.8, 15));
        products.add(new Product("Headphones", 2000, 4.0, 5));
                
        System.out.println("Sorted according to price - ");
        products.sort((p1, p2) -> Double.compare(p2.price, p1.price));
        products.forEach(p -> System.out.println(p));
        System.out.println();
        
        // Sort by rating
        System.out.println("Sorted according to rating - ");
        products.sort((p1, p2) -> Double.compare(p2.rating, p1.rating));
        products.forEach(p -> System.out.println(p));
        System.out.println();

        // Sort by discount
        System.out.println("Sorted according to discount - ");
        products.sort((p1, p2) -> Double.compare(p2.discount, p1.discount));
        products.forEach(p -> System.out.println(p));
	}
}








