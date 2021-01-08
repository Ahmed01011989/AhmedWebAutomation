package com.citibank.pages;

import com.base.TestBase;
import com.report.ExtentTestManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class BankingPage extends TestBase {
    @FindBy(linkText = "Banking")
    private WebElement clickOnBanking;

    @FindBy(linkText = "Checking")
    private WebElement clickOnChecking;

    @FindBy(linkText = "PREMIUM BANKING")
    private WebElement clickPremiumBanking;

    public void checkTheirBankingOptions() {
        clickOnBanking.click();
        ExtentTestManager.log("Clicked on Banking");
        sleepFor(3);

        String currentUrl = TestBase.driver.getCurrentUrl();
        String expectedURL = "https://online.citi.com/US/login.do";
        Assert.assertTrue(currentUrl.contains(expectedURL));
        ExtentTestManager.log("Able to verify the link is correct");
        sleepFor(3);
    }

    public void seeCheckingDetails() {
        clickOnBanking.click();
        ExtentTestManager.log("Clicked on Banking");
        sleepFor(3);
        clickOnChecking.click();
        ExtentTestManager.log("Clicked on Checking");
        sleepFor(3);

        String currentUrl = TestBase.driver.getCurrentUrl();
        String expectedURL = "https://online.citi.com/US/ag/banking/checking-account";
        Assert.assertTrue(currentUrl.contains(expectedURL));
        ExtentTestManager.log("Able to verify the link is correct");
        sleepFor(3);
    }

    public void seeTheirPremiumBankingOffer() {
        seeCheckingDetails();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, 300)");
        ExtentTestManager.log("Page scrolled down");
        sleepFor(3);
        clickPremiumBanking.click();
        ExtentTestManager.log("CLicked on PREMIUM BANKING");
        sleepFor(3);

    }
}
