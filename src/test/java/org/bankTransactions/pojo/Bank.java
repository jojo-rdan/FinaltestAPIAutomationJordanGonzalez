package org.bankTransactions.pojo;

import java.util.ArrayList;
import java.util.List;

public class Bank {

    private List<User> users;

    public Bank() {
        this.users = new ArrayList<>();
    }

    public void registerUser(User user){
        this.users.add(user);
    }
    public void removeUser(User user){
        this.users.remove(user);
    }

    public List<User> getUsers() {
        return users;
    }
}
