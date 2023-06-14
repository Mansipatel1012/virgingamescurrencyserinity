package com.virgingames.currencyinfo;

import com.virgingames.testbase.TestBase;
import com.virgingames.utils.TestUtils;
import io.restassured.response.ValidatableResponse;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.annotations.Title;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(SerenityRunner.class)
public class BingoCurdSteps extends TestBase {
    static  String name = "Bluesea" + TestUtils.getRandomValue();
    static  double amount = 123.33 ;
    static  String currency = "GBP";
    static int id;

    @Steps
    BingoSteps bingoSteps;

    @Title("Getting all jackport inforamtion")
    @Test
    public void test001(){
        ValidatableResponse response = bingoSteps.getAllJackPort();
        response.log().all().statusCode(200);

    }
    @Title("Getting all jackport by currency GBP ")
    @Test
    public void test002(){
        ValidatableResponse response = bingoSteps.getAllJackPortCurrencyGBP();
        response.log().all().statusCode(200);
    }

    @Title("Getting all information by currency EUR")
    @Test
    public void test003(){
        ValidatableResponse response = bingoSteps.getAllJackPortCurrencyEUR();
        response.log().all().statusCode(200);

    }

    @Title("Getting all information by currency SEK")
    @Test
    public void test004(){
        ValidatableResponse response = bingoSteps.getAllJackPortCurrencySEK();
        response.log().all().statusCode(200);
    }
}
