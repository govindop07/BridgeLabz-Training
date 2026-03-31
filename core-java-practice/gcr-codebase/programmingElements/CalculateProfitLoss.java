package programmingElements;

public class CalculateProfitLoss {
	public static void main(String[] args) {
		int costPrice = 129;
		int sellingPrice = 191;
		
		System.out.println("The cost price is INR " + costPrice + " and selling price is INR " + sellingPrice);
		
		int profit = sellingPrice - costPrice;
		float profitPercentage = (float)profit / costPrice * 100;
		System.out.println("The profit is INR " + profit + " and profit percentage is " + profitPercentage);
	}
}
