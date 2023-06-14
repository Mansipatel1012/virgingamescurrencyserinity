package com.virgingames.cucumber.steps;

import com.virgingames.currencyinfo.BingoSteps;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.response.ValidatableResponse;
import net.thucydides.core.annotations.Steps;

public class BingoSteps1 {
    static ValidatableResponse response;
    @Steps
    BingoSteps bingoSteps;

    @When("^User sends a GET request to list endpoint$")
    public void userSendsAGETRequestToListEndpoint() {
        response = bingoSteps.getAllJackPortCurrencyGBP();

    }

    @Then("^User must get back a valid status code 200$")
    public void userMustGetBackAValidStatusCode() {
        response.statusCode(200);
    }
}
