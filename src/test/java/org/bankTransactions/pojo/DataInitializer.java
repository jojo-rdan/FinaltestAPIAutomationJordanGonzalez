package org.bankTransactions.pojo;

import com.github.javafaker.Faker;

public class DataInitializer {
    public static Bank loadBank(){
        Bank bank = new Bank("API Bank");
        loadUsersIntoBank(bank);
        return bank;
    }
    public static void loadUsersIntoBank(Bank bank){
        Faker fakerData = Faker.instance();
        User user1 = new User(fakerData.name().firstName(),
                fakerData.name().lastName(),
                fakerData.number().randomDigitNotZero(),
                fakerData.number().randomDigitNotZero(),
                TransactionType.DEPOSIT,
                fakerData.internet().emailAddress(),
                true, fakerData.country().name(),
                fakerData.phoneNumber().cellPhone());
        User user2 = new User(fakerData.name().firstName(),
                fakerData.name().lastName(),
                fakerData.number().randomDigitNotZero(),
                fakerData.number().randomDigitNotZero(),
                TransactionType.TRANSFER,
                fakerData.internet().emailAddress(),
                false, fakerData.country().name(),
                fakerData.phoneNumber().cellPhone());
        User user3 = new User(fakerData.name().firstName(),
                fakerData.name().lastName(),
                fakerData.number().randomDigitNotZero(),
                fakerData.number().randomDigitNotZero(),
                TransactionType.WITHDRAW,
                fakerData.internet().emailAddress(),
                true, fakerData.country().name(),
                fakerData.phoneNumber().cellPhone());
        User user4 = new User(fakerData.name().firstName(),
                fakerData.name().lastName(),
                fakerData.number().randomDigitNotZero(),
                fakerData.number().randomDigitNotZero(),
                TransactionType.DEPOSIT,
                fakerData.internet().emailAddress(),
                false, fakerData.country().name(),
                fakerData.phoneNumber().cellPhone());
        User user5 = new User(fakerData.name().firstName(),
                fakerData.name().lastName(),
                fakerData.number().randomDigitNotZero(),
                fakerData.number().randomDigitNotZero(),
                TransactionType.TRANSFER,
                fakerData.internet().emailAddress(),
                true, fakerData.country().name(),
                fakerData.phoneNumber().cellPhone());
        User user6 = new User(fakerData.name().firstName(),
                fakerData.name().lastName(),
                fakerData.number().randomDigitNotZero(),
                fakerData.number().randomDigitNotZero(),
                TransactionType.WITHDRAW,
                fakerData.internet().emailAddress(),
                false, fakerData.country().name(),
                fakerData.phoneNumber().cellPhone());
        User user7 = new User(fakerData.name().firstName(),
                fakerData.name().lastName(),
                fakerData.number().randomDigitNotZero(),
                fakerData.number().randomDigitNotZero(),
                TransactionType.DEPOSIT,
                fakerData.internet().emailAddress(),
                true, fakerData.country().name(),
                fakerData.phoneNumber().cellPhone());
        User user8 = new User(fakerData.name().firstName(),
                fakerData.name().lastName(),
                fakerData.number().randomDigitNotZero(),
                fakerData.number().randomDigitNotZero(),
                TransactionType.TRANSFER,
                fakerData.internet().emailAddress(),
                false, fakerData.country().name(),
                fakerData.phoneNumber().cellPhone());
        User user9 = new User(fakerData.name().firstName(),
                fakerData.name().lastName(),
                fakerData.number().randomDigitNotZero(),
                fakerData.number().randomDigitNotZero(),
                TransactionType.WITHDRAW,
                fakerData.internet().emailAddress(),
                true, fakerData.country().name(),
                fakerData.phoneNumber().cellPhone());
        User user10 = new User(fakerData.name().firstName(),
                fakerData.name().lastName(),
                fakerData.number().randomDigitNotZero(),
                fakerData.number().randomDigitNotZero(),
                TransactionType.DEPOSIT,
                fakerData.internet().emailAddress(),
                false, fakerData.country().name(),
                fakerData.phoneNumber().cellPhone());
        bank.registerUser(user1);
        bank.registerUser(user2);
        bank.registerUser(user3);
        bank.registerUser(user4);
        bank.registerUser(user5);
        bank.registerUser(user6);
        bank.registerUser(user7);
        bank.registerUser(user8);
        bank.registerUser(user9);
        bank.registerUser(user10);
    }
}
