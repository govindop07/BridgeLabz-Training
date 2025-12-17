package leetCode;

public class IsPrime {
	public static void main(String[] args) {
		int num = 5;
		
		boolean isPrime = checkIfPrime(num);
		if(isPrime) System.out.println(num + " is a prime number");
		else System.out.println(num + " is not a prime number");
	}

	private static boolean checkIfPrime(int num) {
		for(int i=1; i<num/2; i++) {
			if(num % i == 0) return false;
		}
		return true;
	}
}
