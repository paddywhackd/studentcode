package com.techelevator;

public class BankAccount implements Accountable {

    private String accountHolder = "";
    private String accountNumber = "";
    private int balance;

    public BankAccount(String accountHolder, String accountNumber) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = 0;
    }

    public BankAccount(String accountHolder, String accountNumber, int balance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public String getAccountHolderName() {
        return accountHolder;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public int getBalance() {
        return balance;
    }

    public int deposit(int amountToDeposit) {
        balance = balance + amountToDeposit;
        return balance;
    }

    public int withdraw(int amountToWithdraw) {
        balance = balance - amountToWithdraw;
        return balance;
    }

    public int transferTo (BankAccount destinationAccount, int transferAmount) {
        //method to transfer between acounts
        withdraw(transferAmount);
        destinationAccount.deposit(transferAmount);
        return balance;
    }


}
