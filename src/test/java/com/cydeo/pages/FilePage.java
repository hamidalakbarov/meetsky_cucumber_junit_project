package com.cydeo.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class FilePage extends BasePage {

    @FindBy(xpath = "//a[contains(@data-action,'menu')]")
    public WebElement threeDots;

    @FindBy(xpath = "//div[contains(@class,'fileActionsMenu')]//a")
    public List<WebElement> threeDotsOptions;

    @FindBy(xpath = "//label[@data-action='upload']")
    public WebElement uploadFileButton;

    @FindBy(xpath = "//span[.='New']/preceding-sibling::span")
    public WebElement plusButton;


}
