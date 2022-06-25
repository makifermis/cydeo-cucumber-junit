package com.cydeo.step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;
import java.util.Map;

public class netflix_StepDefinitions {

    @Given("I like {string}")
    public void i_like(String string) {
        System.out.println("This is from Given String Param");
    }

    @Given("I like")
    public void i_like(List<String> movieTypes) {
        System.out.println("This is from Given List of StringDataTable" + movieTypes);
    }

    @Given("I like below favorite movei with certain type")
    public void i_like_below_favorite_movei_with_certain_type(Map<String, String> favoriteMovie) {
        System.out.println(favoriteMovie);
        System.out.println("favoriteMovie.get(\"actions\") = " + favoriteMovie.get("actions"));
    }


    @When("I go to homepage")
    public void i_go_to_homepage() {

    }
    @Then("I should get right recommendation")
    public void i_should_get_right_recommendation() {

    }

}
