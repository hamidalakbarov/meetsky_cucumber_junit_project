package com.cydeo.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DashboardPage extends BasePage{

    @FindBy(xpath = "//a[@aria-label='Activity']")
    public WebElement activityLink;

    public static void clickOnActivity() {
        DashboardPage dashboardPage = new DashboardPage();
        dashboardPage.activityLink.click();
    }
}
