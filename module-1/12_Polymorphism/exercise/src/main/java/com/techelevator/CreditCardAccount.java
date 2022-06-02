package com.techelevator;

public class CreditCardAccount implements Accountable {
    private String accountHolder = "";
    private String accountNumber = "";
    private int debt = 0;


    public CreditCardAccount(String accountHolder, String accountNumber) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
    }

    public CreditCardAccount(String accountHolder, String accountNumber, int debt) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.debt = debt;
    }


    public int pay(int amountToPay) {
        debt = debt - amountToPay;     //-= is okay
        return debt;
    }

    public int charge(int amountToCharge) {
        debt = amountToCharge + debt; //+= is also ... debt += amountToChange
        return debt;
    }


    public String getAccountHolder() {
        return accountHolder;
    }
    public String getAccountNumber() {
        return accountNumber;
    }
    public int getDebt() {
        return debt;
    }
    public int getBalance() {
        return -debt;
    }
}
