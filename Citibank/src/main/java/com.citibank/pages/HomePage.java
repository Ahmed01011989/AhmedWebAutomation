package com.citibank.pages;

import com.base.TestBase;
import com.report.ExtentTestManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends TestBase {
    private static Logger LOGGER = Logger.getLogger(HomePage.class);
    @FindBy(linkText = "Special Offers")
    private WebElement clickOnSpecialOffers;

    @FindBy(linkText = "Our Story")
    private WebElement clickOnOurStory;

    public void chekoutTheirSpecialOffers() {
        WebElement element = driver.findElement(By.linkText("Special Offers"));

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", element);
        ExtentTestManager.log("User Scroll to Special Offers");
        sleepFor(3);
        clickOnSpecialOffers.click();
        ExtentTestManager.log("Clicked Special Offers");
        sleepFor(3);
    }

    public void scrollToElement() {
        WebElement element = driver.findElement(By.linkText("Our Story"));

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", element);
        ExtentTestManager.log("User Scroll to Our Story");
        sleepFor(3);
    }

    public void seeTheirStory() {
        scrollToElement();
        clickOnOurStory.click();
        ExtentTestManager.log("Clicked on Our Story");
        sleepFor(3);
    }
}
