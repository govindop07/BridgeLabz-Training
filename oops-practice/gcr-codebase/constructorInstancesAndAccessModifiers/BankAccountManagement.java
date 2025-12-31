package com.constructorInstancesAndAccessModifiers;

//Problem 3: Bank Account Management
//Create a BankAccount class with:
//accountNumber (public).
//accountHolder (protected).
//balance (private).
//Write methods to:
//Access and modify balance using public methods.
//Create a subclass SavingsAccount to demonstrate access to accountNumber and accountHolder.

class BankAccount {
    public String accountNumber;
    protected String accountHolder;
    private double balance;
    
    public BankAccount(String accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }
    
    public double getBalance() {
        return balance;
    }
    
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }
    
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        }
    }
}

class SavingsAccount extends BankAccount {
    private double interestRate;
    
    public SavingsAccount(String accountNumber, String accountHolder, double balance, double interestRate) {
        super(accountNumber, accountHolder, balance);
        this.interestRate = interestRate;
    }
    
    public void displaySavings() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolder);
        System.out.printf("Balance: $%.2f%n", getBalance());
        System.out.println("Interest Rate: " + interestRate + "%\n");
    }
}

public class BankAccountManagement {
    public static void main(String[] args) {
        SavingsAccount sa = new SavingsAccount("SA12345", "Govind", 5000, 4.5);
        sa.displaySavings();
    }
}