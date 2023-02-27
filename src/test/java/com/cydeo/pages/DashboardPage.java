package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class DashboardPage extends BasePage {

    @FindBy(xpath = "//a[@aria-label='Activity']")
    public WebElement activityLink;

    @FindBy(xpath = "//div[@class='modal__content']//li")
    public List<WebElement> widgets;

    @FindBy(linkText = "Customize")
    public WebElement customizeButton;

    @FindBy(css = "input#status-checkbox-weather")
    public WebElement weatherWidget;

    public int getWidgetCount() {
        return widgets.size();
    }

    public void clickOnWidget(String widget) {
        for (WebElement eachWidget : widgets) {
            if (eachWidget.getText().contains(widget)) {
                eachWidget.click();
                break;
            }
        }
    }

    public static void clickOnActivity() {
        DashboardPage dashboardPage = new DashboardPage();
        dashboardPage.activityLink.click();
    }
}
