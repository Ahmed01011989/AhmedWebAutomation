package com.cnn.pages;

import com.base.TestBase;
import com.report.ExtentTestManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class NewsPage extends TestBase {
    @FindBy(linkText = "Asia")
    private WebElement clickOnAsia;

    @FindBy(id = "footer-search-bar")
    private WebElement clickOnSearchBox;


    public void scrollToNewsOnAfrica() {
        WebElement element = driver.findElement(By.linkText("Africa"));

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", element);
        ExtentTestManager.log("User Scroll to Africa");

    }

    public void scrollAndClickAsia() {
        scrollToNewsOnAfrica();
        clickOnAsia.click();
        sleepFor(3);
        ExtentTestManager.log("Clicked on Asia");
        sleepFor(2);

        String currentUrl = TestBase.driver.getCurrentUrl();
        String expectedURL = "https://www.cnn.com/asia";
        Assert.assertTrue(currentUrl.contains(expectedURL));
        ExtentTestManager.log("Able to verify the link is correct");
        sleepFor(3);
    }

    public void typeOnSearchBarForNews() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, 2100)");
        ExtentTestManager.log("Page scrolled down");
        clickOnSearchBox.sendKeys("Global Warming");
        ExtentTestManager.log("Clicked, typed and pressed entered in search box");

        String currentUrl = TestBase.driver.getCurrentUrl();
        String expectedURL = "https://www.cnn.com/search?q=Global+Warming";
        Assert.assertTrue(currentUrl.contains(expectedURL));
        ExtentTestManager.log("Able to verify the link is correct");
    }
}
