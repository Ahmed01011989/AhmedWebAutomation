package com.facebook.pages;

import com.base.TestBase;
import com.report.ExtentTestManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.FindBy;

public class FrindsPage extends TestBase {
    private static Logger LOGGER = Logger.getLogger(FrindsPage.class);

    @FindBy(xpath = "//input[@placeholder='Search Facebook']")
    private WebElement typeOnSearchBar;

    @FindBy(xpath = "(//div[@role='button'])[2]")
    private WebElement clickOnSearchBtn;

    @FindBy(xpath = "(//span[text()='Add Friend'])[2]")
    private WebElement clickOnAddFrindBtn;

    @FindBy(xpath = "(//span[text()='Find Friends'])[1]")
    private WebElement findfrindsbtn;

    public void typeOnsearchFiled() {
        typeOnSearchBar.sendKeys("Ansar Jon");
        ExtentTestManager.log("Type On Search Bar Filed ");

    }

    public void clickOnsearchBtn() {
        clickOnSearchBtn.click();
        ExtentTestManager.log("Click On Search Button ");

    }

    public void clickOnAddFrindBtn() {
        clickOnAddFrindBtn.click();
        ExtentTestManager.log("Click On Add Frind Button ");

    }

    public void ChromeOption() {
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("disable notifactions");
        driver = new ChromeDriver(chromeOptions);
        driver.switchTo().alert().accept();
        driver.manage().window().maximize();
    }

    public void clickOnFindFrindsbtn() {
        findfrindsbtn.click();
        ExtentTestManager.log("Click On Find Friends Button ");

    }

    public void validateScrollPage() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,1000)");
        ExtentTestManager.log("Scroll Window");
    }

}
