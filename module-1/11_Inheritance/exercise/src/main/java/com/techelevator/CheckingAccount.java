package com.techelevator;

public class CheckingAccount extends BankAccount {
    public CheckingAccount(String accountHolderName, String accountNumber) {
        super(accountHolderName, accountNumber);
    }

    public CheckingAccount(String accountHolderName, String accountNumber, int balance) {
        super(accountHolderName, accountNumber, balance);
    }

    @Override


    public int withdraw(int amountToWithdraw) {
        int overDraft = 10;
        int checkingAccountBalance;

        if ((getBalance() - amountToWithdraw) < 0) {
            if (getBalance() - amountToWithdraw <= -100) {
                return getBalance();
            } else {
                checkingAccountBalance = super.withdraw(amountToWithdraw + overDraft);
            }
        } else {
            checkingAccountBalance = super.withdraw(amountToWithdraw);
        } return checkingAccountBalance;
    }
    
}
