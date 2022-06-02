package com.techelevator;

import java.util.*;
import java.util.ArrayList;
import java.util.List;

public class BankCustomer {


        private String name = "";
        private String address = "";
        private String phoneNumber = "";
        private List<Accountable> accounts = new ArrayList<>(); //returns an array, addAccount method requires a List to store the accounts


        public Accountable[] getAccounts() {
            return accounts.toArray(new Accountable[0]);
        }

        public void addAccount (Accountable newAccount) {
            accounts.add(newAccount);
        }

        public boolean isVip() {
            int accountBalances = 0;
            for (Accountable account : accounts) {
                accountBalances = accountBalances + account.getBalance();
            } if (accountBalances >= 25000) {
                return true;
            } return false;
        }


        public String getName() {
            return name;
        }
        public void setName(String name) {
            this.name = name;
        }
        public String getAddress() {
            return address;
        }
        public void setAddress(String address) {
            this.address = address;
        }
        public String getPhoneNumber() {
            return phoneNumber;
        }
        public void setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
        }
    }


