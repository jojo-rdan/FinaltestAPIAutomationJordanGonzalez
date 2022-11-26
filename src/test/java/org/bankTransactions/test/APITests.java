package org.bankTransactions.test;

import org.apache.http.HttpStatus;
import org.apache.log4j.Logger;
import org.bankTransactions.API.APIHandler;
import org.testng.annotations.Test;

import static org.bankTransactions.API.APIHandler.deleteAllUsers;
import static org.hamcrest.Matchers.containsString;

public class APITests {
    Logger log = Logger.getLogger(APITests.class);
    @Test
    public void endPointVerifier(){
        log.info("Test that the endpoint is empty, and if there are records, delete them all.");
        //APIHandler.postUsers();
        APIHandler.deleteAllUsers();
    }
//    @Test
//    public void
}
