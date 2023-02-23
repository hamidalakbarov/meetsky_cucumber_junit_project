package com.cydeo.step_definitions;

import com.cydeo.pages.ActivityPage;
import com.cydeo.pages.DashboardPage;
import com.cydeo.pages.LogInPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.Arrays;
import java.util.List;

public class ActivityStepDefinitions {

    ActivityPage activityPage = new ActivityPage();

    @Given("user is on dashboard page")
    public void user_is_on_dashboard_page() {
        LogInPage.login();
    }

    @When("user clicks on activity link")
    public void user_clicks_on_activity_link() {
        DashboardPage.clickOnActivity();
    }

    @Then("user should see {int} app navigators")
    public void user_should_see_app_navigators(int expectedAppNavsCount) {
        Assert.assertEquals(expectedAppNavsCount, activityPage.actualAppNavsCount());
    }

    @Then("user should see given app navigators")
    public void user_should_see_given_app_navigators(List<String> expectedAppNavs) {
        System.out.println(activityPage.actualAppNavigators());
      Assert.assertEquals(expectedAppNavs, activityPage.actualAppNavigators());
    }


}
