package com.cydeo.step_definitions;

import com.cydeo.pages.DicePage;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;

public class Dice_StepDefinitions {

    DicePage dicePage = new DicePage();

    @Given("User is on the dice homepage")
    public void user_is_on_the_dice_homepage() {
        System.out.println("User is going to Dice Home Page");
        Driver.getDriver().get(ConfigurationReader.getProperty("dice.url"));
    }
    @When("User enters keyword and zipcode")
    public void user_enters_keyword_and_zipcode() {
        System.out.println("User is entering Java and 22102 and click search button");
        dicePage.keywordBox.sendKeys("java");
        dicePage.zipCodeBox.sendKeys("22102"+ Keys.ENTER);
    }
    @Then("User should see search results")
    public void user_should_see_search_results() {
        System.out.println("User is getting the results and verify");
        System.out.println("Job Count = " + dicePage.totalJobs.getText());
    }

}
