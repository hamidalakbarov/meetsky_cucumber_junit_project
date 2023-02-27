package com.cydeo.pages;

import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LogInPage extends BasePage{

    @FindBy(id = "user")
    public WebElement userNameInput;

    @FindBy(id = "password")
    public WebElement passwordInput;

    @FindBy(id = "submit-form")
    public WebElement logInButton;

    public static void login() {
        Driver.getDriver().get(ConfigurationReader.getProperty("env"));
        LogInPage logInPage = new LogInPage();
        logInPage.userNameInput.sendKeys(ConfigurationReader.getProperty("username"));
        logInPage.passwordInput.sendKeys(ConfigurationReader.getProperty("password"));
        logInPage.logInButton.click();
    }

    @FindBy(xpath = "//p[contains(@class,'warning')]")
    public WebElement credentialsWarningMsg;

}
