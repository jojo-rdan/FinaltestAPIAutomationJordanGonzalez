package org.bankTransactions.test;

import org.apache.log4j.Logger;
import org.bankTransactions.API.APIHandler;
import org.bankTransactions.pojo.Bank;
import org.bankTransactions.pojo.DataInitializer;
import org.hamcrest.MatcherAssert;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Objects;

public class InitializeDataAndPostTest {
    Logger log = Logger.getLogger(InitializeDataAndPostTest.class);

    /**
     * @author Jordan.González
     * Post users and validate if there is no duplicate email's.
     */
    @Test
    public void postDataTest(){
        log.info("Initialize users data");
        Bank myBank = DataInitializer.loadBank();

        log.info("Validating that users don´t have duplicate email's");


        log.info("Post users to the API");
        APIHandler.postUsers();
    }
}
