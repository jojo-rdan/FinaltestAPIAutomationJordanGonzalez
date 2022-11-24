package org.bankTransactions.pojo;

import java.util.ArrayList;
import java.util.List;

public class Bank {

    private String name;
    private List<User> users;

    public Bank(String name) {
        this.name = name;
        this.users = new ArrayList<>();
    }

    public void registerUser(User user){
        this.users.add(user);
    }
}
