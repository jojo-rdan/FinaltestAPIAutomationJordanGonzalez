package org.bankTransactions.test;

import org.apache.log4j.Logger;
import org.bankTransactions.API.APIHandler;
import org.testng.annotations.Test;

public class EndPointVerificationTest {
    Logger log = Logger.getLogger(EndPointVerificationTest.class);
    @Test
    public void endPointVerifier(){
        log.info("Test that the endpoint is empty, and if there are records, delete them all.");
        APIHandler.deleteAllUsers();
    }
}
