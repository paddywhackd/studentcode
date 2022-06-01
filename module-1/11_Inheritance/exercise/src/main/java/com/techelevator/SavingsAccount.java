package com.techelevator;

    public class SavingsAccount extends BankAccount {
        public SavingsAccount(String accountHolderName, String accountNumber) {
            super(accountHolderName, accountNumber);
        }

        public SavingsAccount(String accountHolderName, String accountNumber, int balance) {
            super(accountHolderName, accountNumber, balance);
        }

        int serviceFee = 2;

        @Override
        public int withdraw(int amountToWithdraw) {
            int newBalance = super.withdraw(amountToWithdraw);

            if (newBalance < 150) { //if balance is less than 150
                newBalance = super.withdraw(serviceFee); //charge service fee
            }
            if (newBalance < 0) {
                newBalance = super.deposit(amountToWithdraw + serviceFee);
            }
            return newBalance;
        }
    }

