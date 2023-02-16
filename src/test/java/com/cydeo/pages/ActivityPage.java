package com.cydeo.pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ActivityPage extends BasePage{

    @FindBy(xpath = "//div[@id='app-navigation']//li")
    public List<WebElement> appNavigators;

    public static void verifyAppNavigators(List<String> expectedAppNavigators) {
        List<String> actualAppNavigators = new ArrayList<>();
        ActivityPage activityPage = new ActivityPage();
        activityPage.appNavigators.stream().filter(p -> !p.getText().equals("All activities")).forEach(c -> actualAppNavigators.add(c.getText()));
        Assert.assertEquals(expectedAppNavigators,actualAppNavigators);
    }
}
