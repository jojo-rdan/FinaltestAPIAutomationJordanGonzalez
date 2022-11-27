package org.bankTransactions.pojo;

import java.util.ArrayList;
import java.util.List;

public class Bank {
    private List<User> users;

    /**
     * Constructor method.
     *
     * @author Jordan.González
     */
    public Bank() {
        this.users = new ArrayList<>();
    }

    /**
     * Register user in the users list.
     *
     * @author Jordan.González
     */
    public void registerUser(User user){
        this.users.add(user);
    }

    /**
     * Get all the users on the list.
     *
     * @author Jordan.González
     */
    public List<User> getUsers() {
        return users;
    }
}
