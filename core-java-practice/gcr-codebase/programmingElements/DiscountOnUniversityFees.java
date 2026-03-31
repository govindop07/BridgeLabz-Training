package programmingElements;

public class DiscountOnUniversityFees {
	public static void main(String[] args) {
		double fee = 125000;
		int discountPercentage = 10;
		
		double discount = fee * discountPercentage / 100;
		double discountedFee = fee - discount;
		
		System.out.println("The discount amount is INR " + discount + " and final discounted fee is INR " + discountedFee);
	}
}
