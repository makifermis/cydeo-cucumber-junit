package com.cydeo.step_definitions;

import com.cydeo.pages.CloudTablesPage;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class CloudTables_StepDefinitions {

    CloudTablesPage cloudTablesPage = new CloudTablesPage();

    @Given("User is on cloudTables homepage")
    public void user_is_on_cloud_tables_homepage() {
        Driver.getDriver().get(ConfigurationReader.getProperty("cloudtables.url"));
    }
    @When("User clicks on New button")
    public void user_clicks_on_new_button() {
        cloudTablesPage.newButton.click();
    }
    @When("User enters {string} to firstname field")
    public void user_enters_to_firstname_field(String firstName) {
        cloudTablesPage.firstNameBox.sendKeys(firstName);
    }
    @When("User enters {string} to lastname field")
    public void user_enters_to_lastname_field(String lastName) {
        cloudTablesPage.lastNameBox.sendKeys(lastName);
    }
    @When("User enters {string} to position field")
    public void user_enters_to_position_field(String position) {
        cloudTablesPage.positionBox.sendKeys(position);
    }
    @When("User enters {string} to salary field")
    public void user_enters_to_salary_field(String salary) {
        cloudTablesPage.salaryBox.sendKeys(salary);
    }
    @When("User clicks on create button")
    public void user_clicks_on_create_button() {
        cloudTablesPage.createButton.click();
    }

    @Then("User should be able to find {string} at the search box")
    public void userShouldBeAbleToFindAtTheSearchBox(String fullName) {
        cloudTablesPage.searchBox.sendKeys(fullName);
        Assert.assertTrue(cloudTablesPage.tableFirstRawName.getText().equals(fullName));
    }


    @And("User deletes the person created")
    public void userDeletesThePersonCreated() {
        //BrowserUtils.waitFor(2);
        cloudTablesPage.tableFirstRawName.click();
        cloudTablesPage.deleteButton.click();
        cloudTablesPage.deleteVerificationButton.click();
        //BrowserUtils.waitFor(2);
        Assert.assertTrue(cloudTablesPage.errorMessage.isDisplayed());

    }
}
