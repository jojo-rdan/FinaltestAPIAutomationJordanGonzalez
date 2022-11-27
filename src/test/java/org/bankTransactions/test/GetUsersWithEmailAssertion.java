package org.bankTransactions.test;

import org.apache.log4j.Logger;
import org.bankTransactions.API.APIHandler;
import org.testng.annotations.Test;
public class GetUsersWithEmailAssertion {
    Logger log = Logger.getLogger(EndPointVerificationTest.class);
    @Test
    public void getUsersNoEmailDuplicates(){
        log.info("Getting users..");
        log.info("Validate that users don´t have duplicate email's");
        APIHandler.getUsers();
    }
}
