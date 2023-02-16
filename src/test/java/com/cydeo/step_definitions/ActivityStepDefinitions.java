package com.cydeo.step_definitions;

import com.cydeo.pages.ActivityPage;
import com.cydeo.pages.DashboardPage;
import com.cydeo.pages.LogInPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.Arrays;

public class ActivityStepDefinitions {

    @Given("user is on dashboard page")
    public void user_is_on_dashboard_page() {
        LogInPage.login();
    }
    @When("user clicks on activity link")
    public void user_clicks_on_activity_link() {
        DashboardPage.clickOnActivity();
    }
    @Then("user should see {int} app navigators")
    public void user_should_see_app_navigators(Integer int1) {
        ActivityPage.verifyAppNavigators(Arrays.asList("By you", "Bu others", "Circles", "Favorites", "File changes",
                "Calendar", "Todos", "Comments", "Deck"));
    }

}
