package org.bankTransactions.pojo;

import com.github.javafaker.IdNumber;

public class User {
    private String name;
    private String lastName;
    private int accountNumber;
    private float amount;
    private String transactionType;
    private String email;
    private boolean active;
    private String country;
    private String telephone;

    public User(String name, String lastName, int accountNumber, float amount, String transactionType, String email, boolean active, String country, String telephone) {
        this.name = name;
        this.lastName = lastName;
        this.accountNumber = accountNumber;
        this.amount = amount;
        this.transactionType = transactionType;
        this.email = email;
        this.active = active;
        this.country = country;
        this.telephone = telephone;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

}
