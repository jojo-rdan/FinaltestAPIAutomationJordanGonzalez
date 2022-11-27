package org.bankTransactions.test;

import org.apache.log4j.Logger;
import org.bankTransactions.API.APIHandler;
import org.testng.annotations.Test;

public class UpdateExistingAccountTest {
    Logger log = Logger.getLogger(UpdateExistingAccountTest.class);
    @Test
    public void UpdateAccountNumber(){
        log.info("Updating existing account number from an user");
        APIHandler.updateUser();
    }
}
