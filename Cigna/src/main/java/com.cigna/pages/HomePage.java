package com.cigna.pages;

import com.base.TestBase;
import com.report.ExtentTestManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class HomePage extends TestBase {
    private static Logger LOGGER = Logger.getLogger(HomePage.class);

    @FindBy(linkText = "Health and Wellness")
    private WebElement clickHealthAndWellness;

    @FindBy(id = "search-desktop")
    private WebElement clickSearchBar;


    public void scrollToElement() {
        WebElement element = driver.findElement(By.linkText("Health and Wellness"));

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", element);
        ExtentTestManager.log("User Scroll to Element");
    }

    public void clickOnElementAfterScrollDown() {
        scrollToElement();
        clickHealthAndWellness.click();
        ExtentTestManager.log("User click Health And Wellness");

    }

    public void searchForMedicalTools() {
        clickSearchBar.sendKeys("Medical Tools");
    }

    public void ValidateMousseHover() {
        WebElement user = driver.findElement(By.id("individuals-families-level-one-link"));
        Actions actions = new Actions(driver);
        actions.moveToElement(user).build().perform();
        ExtentTestManager.log("User hover over Individuals and Families");
        sleepFor(2);
    }

    public void validateURL() {
        String actualURL = TestBase.driver.getCurrentUrl();
        String expectedURL = "https://www.cigna.com/";
        Assert.assertTrue(actualURL.contains(expectedURL));
        ExtentTestManager.log("URL has been validated : " + actualURL);

    }
}
