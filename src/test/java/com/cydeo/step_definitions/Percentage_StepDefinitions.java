package com.cydeo.step_definitions;

import com.cydeo.pages.PercentageCalculatorPage;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;

import java.util.Map;

public class Percentage_StepDefinitions {

    @Given("User is on percentage calculator page")
    public void user_is_on_percentage_calculator_page() {
        System.out.println("User is on the percentage page");
        Driver.getDriver().get(ConfigurationReader.getProperty("percentage.url"));
    }
    @Then("User should see fallowing calculation results")
    public void user_should_see_fallowing_calculation_results(Map<Integer,Integer> valuesMap) {
        System.out.println("valuesMap = " + valuesMap);
        PercentageCalculatorPage page = new PercentageCalculatorPage();
        page.percent.sendKeys("5");

        for (Integer inputKey : valuesMap.keySet()){
            page.input.clear();
            page.input.sendKeys(""+inputKey+ Keys.ENTER);

            System.out.println("input value = " + inputKey);
            System.out.println("Expected value of %5 is = " + valuesMap.get(inputKey));

            System.out.println("Actual value from webpage = " + page.result.getAttribute("value"));
            Assert.assertEquals(valuesMap.get(inputKey),Integer.valueOf(page.result.getAttribute("value")));
        }
    }

}
