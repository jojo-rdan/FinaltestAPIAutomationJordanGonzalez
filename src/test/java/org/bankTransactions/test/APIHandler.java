package org.bankTransactions.test;

import io.restassured.response.Response;
import org.bankTransactions.pojo.Bank;
import org.bankTransactions.pojo.DataInitializer;

import static io.restassured.RestAssured.given;

public class APIHandler {
    public void getUsers(){
        Response response = given().contentType("application/json").when().get("https://637d740b9c2635df8f8751d2.mockapi.io/users");
        response.then().extract().response();
        response.prettyPrint();
        response.then().statusCode(200);
    }
    public void postUser(){
        Bank myBank = DataInitializer.loadBank();
    }
}
