package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class BasePage {

    public BasePage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(css = "div#expand")
    public WebElement profileInfoButton;

    @FindBy(css = "li[data-id='logout']")
    public WebElement logOutButton;

    @FindBy(xpath = "//ul[@id='appmenu']//a[@aria-label='Files']")
    public WebElement filesApp;




}
