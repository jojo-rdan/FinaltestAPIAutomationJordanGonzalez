package org.bankTransactions.API;

import com.github.javafaker.Faker;
import io.restassured.response.Response;
import org.apache.http.HttpStatus;
import org.bankTransactions.pojo.Bank;
import org.bankTransactions.pojo.DataInitializer;
import org.hamcrest.MatcherAssert;
import org.testng.Assert;

import java.util.List;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.containsString;

public class APIHandler {

    /**
     * Get users and make a validation for duplicate emails
     *
     * @author Jordan.González
     */
    public static void getUsers(){
        Bank myBank = DataInitializer.loadBank();
        Response response = given().contentType("application/json").when().get("https://637d740b9c2635df8f8751d2.mockapi.io/users");
        List<String> usersEmails = response.jsonPath().get("email");
        response.then().extract().response();
        response.then().statusCode(HttpStatus.SC_OK);

        for (int i = 0; i < myBank.getUsers().size(); i++) {
            for (int j = i+1; j < usersEmails.size(); j++) {
                Assert.assertNotEquals(myBank.getUsers().get(i).getEmail(), usersEmails.get(j));
            }
        }
        Assert.assertEquals(response.getStatusCode(), HttpStatus.SC_OK);
    }

    /**
     * Post users in the mock API endpoint
     *
     * @author Jordan.González
     */
    public static void postUsers(){
        Bank myBank = DataInitializer.loadBank();
        Response response = given().contentType("application/json").when().get("https://637d740b9c2635df8f8751d2.mockapi.io/users");
        List<String> usersEmails = response.jsonPath().get("email");

        for (int i = 0; i < myBank.getUsers().size(); i++) {
            response = given().contentType("application/json").body(myBank.getUsers().get(i)).when().post("https://637d740b9c2635df8f8751d2.mockapi.io/users");
        }

        for (int i = 0; i < myBank.getUsers().size(); i++) {
            for (int j = i+1; j < usersEmails.size(); j++) {
                Assert.assertNotEquals(myBank.getUsers().get(i).getEmail(), usersEmails.get(j));
            }
        }
        response.then().extract().response();
        response.then().statusCode(HttpStatus.SC_CREATED);

        Assert.assertEquals(response.getStatusCode(), HttpStatus.SC_CREATED);
    }

    /**
     * Update a given user in the mock API endpoint
     *
     * @author Jordan.González
     */
    public static void updateUser(){
        Faker fakerData = Faker.instance();
        Bank myBank = DataInitializer.loadBank();
        myBank.getUsers().get(1).setAccountNumber(fakerData.number().numberBetween(0, 1000));

        Response response = given().contentType("application/json").body(myBank.getUsers().get(1)).when().put("https://637d740b9c2635df8f8751d2.mockapi.io/users/1");
        response.then().extract().response();
        response.prettyPrint();
        response.then().statusCode(HttpStatus.SC_OK);

        Assert.assertEquals(response.getStatusCode(), HttpStatus.SC_OK);
    }

    /**
     * Delete users in the mock API endpoint, validates if it is empty or not
     *
     * @author Jordan.González
     */
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

        Assert.assertEquals(response.getStatusCode(), HttpStatus.SC_OK);
    }
}
