package com.cydeo.step_definitions;

import com.cydeo.pages.CalculatorPage;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Calculator_Stepdefs {
    @Given("User is on calculator page")
    public void userIsOnCalculatorPage() {
        Driver.getDriver().get(ConfigurationReader.getProperty("calculator.url"));

    }

    @When("User clicks {string} on calculator")
    public void userClicksOnCalculator(String button) {
        new CalculatorPage().button(button).click();
    }

    @Then("result {string} should be seen")
    public void resultShouldBeSeen(String expectedResult) {
        String actualResult = new CalculatorPage().outPut.getText().trim();
        Assert.assertEquals("Wrong Calculation", expectedResult,actualResult);
    }
}
