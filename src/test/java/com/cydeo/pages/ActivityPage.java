package com.cydeo.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;
import java.util.stream.Collectors;

public class ActivityPage extends BasePage {

    @FindBy(xpath = "//div[@id='app-navigation']//li")
    public List<WebElement> appNavigators;

    public List<String> actualAppNavigators() {
        return appNavigators.stream().filter(p -> !p.getText().equals("All activities"))
                .map(f -> f.getText()).collect(Collectors.toList());
    }

    public int actualAppNavsCount() {
        return appNavigators.size();
    }
}
