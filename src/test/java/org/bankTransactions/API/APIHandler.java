package org.bankTransactions.API;

import io.restassured.response.Response;
import org.apache.http.HttpStatus;
import org.bankTransactions.pojo.Bank;
import org.bankTransactions.pojo.DataInitializer;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.containsString;

public class APIHandler {
    public static void getUsers(){
            Response response = given().contentType("application/json").when().get("https://637d740b9c2635df8f8751d2.mockapi.io/users");
            response.then().extract().response();
            response.prettyPrint();
            response.then().statusCode(HttpStatus.SC_NO_CONTENT);
    }
    public static void postUsers(){
        Bank myBank = DataInitializer.loadBank();
        Response response = given().contentType("application/json").when().get("https://637d740b9c2635df8f8751d2.mockapi.io/users");
        for (int i = 0; i < myBank.getUsers().size(); i++) {
            response = given().contentType("application/json").body(myBank.getUsers().get(i)).when().post("https://637d740b9c2635df8f8751d2.mockapi.io/users");
            //response.prettyPrint();
        }
        response.then().extract().response();
        response.then().statusCode(HttpStatus.SC_CREATED);
    }
    public static void updateUser(){
        Bank myBank = DataInitializer.loadBank();
        Response response = given().contentType("application/json").body(myBank.getUsers().get(1).getAccountNumber()).when().put("https://637d740b9c2635df8f8751d2.mockapi.io/users/1");
        try{
            myBank.getUsers().get(1).setAccountNumber(123456);
            response.then().extract().response();
            response.prettyPrint();
            response.then().statusCode(HttpStatus.SC_NO_CONTENT);
        }catch (Exception error){
            response.then().statusCode(HttpStatus.SC_BAD_REQUEST);
            error.getCause();
        }
    }
    public static void deleteAllUsers(){
        Bank myBank = DataInitializer.loadBank();
        Response response = given().contentType("application/json").when().get("https://637d740b9c2635df8f8751d2.mockapi.io/users");
        response.then().body(containsString("id"));
        for (int i = 0; i < myBank.getUsers().size(); i++) {
            int userId = i + 1;
            response = given().contentType("application/json").when().delete("https://637d740b9c2635df8f8751d2.mockapi.io/users/"+userId);
        }
        response.then().extract().response();
        response.then().statusCode(HttpStatus.SC_OK);
    }
}
