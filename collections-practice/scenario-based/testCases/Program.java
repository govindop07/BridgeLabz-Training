package collections.testCases;

public class Program {
    public double Balance;

    public Program(double initialBalance) {
        this.Balance = initialBalance;
    }

    public void Deposit(double amount) throws Exception {
        if (amount < 0) throw new Exception("Deposit amount cannot be negative");
        this.Balance += amount;
    }

    public void Withdraw(double amount) throws Exception {
        if (amount > this.Balance) throw new Exception("Insufficient funds");
        this.Balance -= amount;
    }
}