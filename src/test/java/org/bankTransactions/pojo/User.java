package org.bankTransactions.pojo;

import com.github.javafaker.Faker;
import com.github.javafaker.IdNumber;

public class User {
    private IdNumber id;
    private String name;
    private String lastName;
    private int accountNumber;
    private float amount;
    private TransactionType transactionType;
    private String email;
    private boolean active;
    private String country;
    private String telephone;

    public User(String name, String lastName, int accountNumber, float amount, TransactionType transactionType, String email, boolean active, String country, String telephone) {
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

    public IdNumber getId() {
        return id;
    }

    public void setId(IdNumber id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    public TransactionType getTransactionType() {
        return transactionType;
    }

    public void setTransactionType(TransactionType transactionType) {
        this.transactionType = transactionType;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }
}
