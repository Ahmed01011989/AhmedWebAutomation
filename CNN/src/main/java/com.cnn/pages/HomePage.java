package com.cnn.pages;

import com.base.TestBase;
import com.report.ExtentTestManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class HomePage extends TestBase {
    @FindBy(xpath = "//div[@id='edition-picker-toggle-desktop']")
    private WebElement clickEdition;

    @FindBy(xpath = "//div[@id='edition-picker-desktop']//ul//a[@name='arabic']")
    private WebElement clickArabic;

    @FindBy(linkText = "US")
    private WebElement clickonUS;

    @FindBy(linkText = "LIVE TV")
    private WebElement clickLiveTv;


    public void changeLanguage() {
        clickEdition.click();
        ExtentTestManager.log("Clicked on Edition");
        clickArabic.click();
        ExtentTestManager.log("Clicked on Arabic");
    }

    public void newOnUS() {
        clickonUS.click();
        ExtentTestManager.log("Clicked on US");
        sleepFor(3);

        String currentUrl = TestBase.driver.getCurrentUrl();
        String expectedURL = "https://www.cnn.com/us";
        Assert.assertTrue(currentUrl.contains(expectedURL));
        ExtentTestManager.log("Able to verify the link is correct");
        sleepFor(3);
    }

    public void watchLiveTv() {
        clickLiveTv.click();
        ExtentTestManager.log("Clicked on LIVE TV");
        sleepFor(3);

    }

    public void pageCanGoBackward() {
        watchLiveTv();
        driver.navigate().back();
        ExtentTestManager.log("Page Goes Backword");
        sleepFor(2);
    }
}
