package com.cydeo.step_definitions;

import com.cydeo.pages.ActivityPage;
import com.cydeo.pages.DashboardPage;
import com.cydeo.pages.FilePage;
import com.cydeo.pages.LogInPage;

import static com.cydeo.utilities.ConfigurationReader.*;

import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.time.Duration;
import java.util.List;

public class MeetSky_StepDefinitions {

    ActivityPage activityPage = new ActivityPage();
    LogInPage logInPage = new LogInPage();
    DashboardPage dashboardPage = new DashboardPage();
    FilePage filePage = new FilePage();

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

    @Given("user is on login page")
    public void user_is_on_login_page() {
        Driver.getDriver().get(getProperty("env"));
    }

    @When("user enters valid username")
    public void user_enters_valid_username() {
        logInPage.userNameInput.sendKeys(getProperty("username"));
    }

    @When("user enters valid password")
    public void user_enters_valid_password() {
        logInPage.passwordInput.sendKeys(getProperty("password"));
    }

    @When("user clicks on Log in button")
    public void user_clicks_on_log_in_button() {
        logInPage.logInButton.click();
    }

    @Then("user should land on {string} page")
    public void user_should_land_on_page(String textInTitle) {
        Assert.assertTrue(Driver.getDriver().getTitle().contains(textInTitle));
    }

    @When("user enters invalid password")
    public void user_enters_invalid_password() {
        logInPage.passwordInput.sendKeys("123");
    }

    @Then("user should see {string} message")
    public void user_should_see_message(String expectedMessage) {
        Assert.assertEquals(expectedMessage, logInPage.credentialsWarningMsg.getText());
    }

    @Then("user should see {string} validation message")
    public void user_should_see_pop_up_message(String expectedValidationMessage) {
        /*
        In order to verify if validation message is shown for the field that left blank:
            1. Locate that web element that will be left blank
            2. Get value of the attribute validationMessage
            3. Assert if it is equal to the expected validation message
         */
        Assert.assertEquals(expectedValidationMessage, logInPage.passwordInput.getAttribute("validationMessage"));
    }

    @Then("user should see characters as bullet point")
    public void user_should_see_characters_as_bullet_point() {
        Assert.assertTrue(logInPage.passwordInput.getAttribute("type").equals("password"));
    }

    @When("user clicks on profile info")
    public void user_clicks_on_profile_info() {
        dashboardPage.profileInfoButton.click();
    }

    @When("user clicks on logout button")
    public void user_clicks_on_logout_button() {
        dashboardPage.logOutButton.click();
    }

    @Then("user should end up in Login page")
    public void user_should_end_up_in_login_page() {
        BrowserUtils.verifyUrlContains("login");
    }

    @When("user clicks step back button")
    public void user_clicks_step_back_button() {
        Driver.getDriver().navigate().back();
    }

    @Then("user should stay in login page")
    public void user_should_stay_in_login_page() {
        BrowserUtils.verifyUrlContains("login");
    }

    @When("user is away from keyboard for {int} minutes")
    public void user_is_away_from_keyboard_for_minutes(Integer minutes) {
        BrowserUtils.sleep(minutes * 61);
    }

    @Then("user is logged out")
    public void user_is_logged_out() {
        BrowserUtils.verifyUrlContains("login");
    }

    @When("user clicks on Customize button")
    public void user_clicks_on_button() {
        dashboardPage.customizeButton.click();
    }

    @Then("user should see {int} widgets")
    public void user_should_see_widgets(int numberOfWidgets) {
        Assert.assertEquals(numberOfWidgets, dashboardPage.getWidgetCount());
    }

    @When("user clicks on {string} widget")
    public void user_clicks_on_widget(String widget) {
        dashboardPage.clickOnWidget(widget);
    }

    @Then("user should see the {string} widget is selected")
    public void user_can_see_the_widget_is_selected(String widget) {
        Assert.assertTrue(dashboardPage.weatherWidget.isSelected());
    }

    @Then("user should see {string} widget is not selected")
    public void user_should_see_widget_is_not_selected(String widget) {
        Assert.assertTrue(!dashboardPage.weatherWidget.isSelected());
    }

    @Given("user is on the Files page")
    public void user_is_on_the_page() {
        LogInPage.login();
        dashboardPage.filesApp.click();
    }

    @Then("user should see {int} options in the Files page")
    public void user_should_see_options_in_the_files_page(int expectedOptions) {
    }

    @When("user clicks three dots in a any file")
    public void user_clicks_dots_in_a_any_file() {
        filePage.threeDots.click();
    }

    @Then("user should see {int} options")
    public void user_should_see_options(int numOfOptions) {
        Assert.assertEquals(numOfOptions, filePage.threeDotsOptions.size() - 2);
    }

    @When("user clicks plus icon")
    public void user_clicks_plus_icon() {
        filePage.plusButton.click();
    }

    @When("user clicks Upload file")
    public void user_clicks_upload_file() {
        filePage.uploadFileButton.sendKeys("/Users/hamidalakbarov/Desktop/file to upload by me5");
    }

    @Then("user should see file name on the screen")
    public void user_should_see_file_name_on_the_screen() {
        Assert.assertEquals("file to upload by me5",filePage.firstRow.getText());
    }







}
