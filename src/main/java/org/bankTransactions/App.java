package org.bankTransactions;

import com.github.javafaker.Faker;

public class App {
    public static void main(String[] args) {
        Faker faker = Faker.instance();
        System.out.println(faker.funnyName().name());
    }
}
