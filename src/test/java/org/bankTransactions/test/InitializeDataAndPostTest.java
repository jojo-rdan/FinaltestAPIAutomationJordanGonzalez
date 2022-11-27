package org.bankTransactions.test;

import org.apache.log4j.Logger;
import org.bankTransactions.API.APIHandler;
import org.bankTransactions.pojo.Bank;
import org.bankTransactions.pojo.DataInitializer;
import org.hamcrest.MatcherAssert;
import org.testng.annotations.Test;

import java.util.Objects;

public class InitializeDataAndPostTest {
    Logger log = Logger.getLogger(InitializeDataAndPostTest.class);
    @Test
    public void postDataTest(){
        log.info("Initialize users data");
        Bank myBank = DataInitializer.loadBank();
        log.info("Validate that users don´t have duplicate email's");
        for (int i = 0; i < myBank.getUsers().size(); i++) {
            for (int j = 1; j < myBank.getUsers().size(); j++) {
                MatcherAssert.assertThat(String.valueOf(Objects.equals(myBank.getUsers().get(i).getEmail(), myBank.getUsers().get(j).getEmail())), true);
            }
        }
        log.info("Post users to the API");
        APIHandler.postUsers();
    }
}
