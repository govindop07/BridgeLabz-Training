package multithreading;

import java.time.LocalDateTime;

class BankAccount {
	private int balance = 10000;

	public synchronized boolean withdraw(int amount) {
		if (amount <= balance) {
			balance -= amount;
			return true;
		}
		return false;
	}

	public int getBalance() {
		return balance;
	}
}

class Transaction implements Runnable {
	private BankAccount account;
	private String customerName;
	private int amount;

	public Transaction(BankAccount account, String customerName, int amount) {
		this.account = account;
		this.customerName = customerName;
		this.amount = amount;
	}

	@Override
	public void run() {
		System.out.println("[" + Thread.currentThread().getName() + "] Attempting to withdraw " + amount);
		boolean success = account.withdraw(amount);

		if (success) {
			System.out.println("Transaction successful: " + customerName + ", Amount: " + amount + ", Balance: "
					+ account.getBalance() + ", Time: " + LocalDateTime.now());
		} else {
			System.out.println(
					"Transaction failed: " + customerName + ", Insufficient balance, Time: " + LocalDateTime.now());
		}
	}
}

public class BankingSystem {
	public static void main(String[] args) {
		BankAccount account = new BankAccount();

		int[] amounts = { 3000, 4000, 2000, 5000, 1500 };

		for (int i = 0; i < amounts.length; i++) {
			Thread t = new Thread(new Transaction(account, "Customer-" + (i + 1), amounts[i]), "Customer-" + (i + 1));
			System.out.println(t.getName() + " state before start: " + t.getState());
			t.start();
		}
	}
}
