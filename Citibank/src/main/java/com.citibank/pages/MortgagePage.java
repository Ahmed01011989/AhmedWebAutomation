package com.citibank.pages;

import com.base.TestBase;
import com.report.ExtentTestManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MortgagePage extends TestBase {
    @FindBy(linkText = "Lending")
    private WebElement clickOnLending;

    @FindBy(linkText = "Mortgage Calculators")
    private WebElement clickOnMortgageCalculators;

    @FindBy(linkText = "Go to monthly mortgage payment calculator")
    private WebElement clickOnGoToMonthlyMortgagePaymentCalculator;


    public void findMortgageCalculator() {
        clickOnLending.click();
        ExtentTestManager.log("Clicked on Lending");
        sleepFor(3);
        clickOnMortgageCalculators.click();
        ExtentTestManager.log("Clicked on Mortgage Calculators");
        sleepFor(3);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, 200)");
        ExtentTestManager.log("Page scrolled down");
        sleepFor(3);
        clickOnGoToMonthlyMortgagePaymentCalculator.click();
        ExtentTestManager.log("Clicked on Go to monthly mortgage payment calculator");
        sleepFor(3);

    }
}
