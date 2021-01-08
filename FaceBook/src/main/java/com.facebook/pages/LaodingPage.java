package com.facebook.pages;

import com.base.TestBase;
import com.report.ExtentTestManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class LaodingPage {
    private static Logger LOGGER = Logger.getLogger(LaodingPage.class);

    @FindBy(xpath = "//*[@id=\"mount_0_0\"]/div/div[1]/div[1]/div[3]/div/div/div[1]/div[1]/div/div[2]/div/div/div[3]/div/div[2]/div/div/div/div[1]/div/div[1]/span")
    private WebElement clickOnstatusTextArea;

    @FindBy(xpath = "//*[@id=\"mount_0_0\"]/div/div[1]/div[1]/div[2]/div[3]/div/div[1]/div[1]/ul/li[1]/span/div/a")
    private WebElement clickOnHomeBtn;

    @FindBy(xpath = "(//span[text()='Events'])[1]")
    private WebElement clickOnEventsBtn;


    public void ClickOnHomeButton() {
        clickOnHomeBtn.click();
    }

    public void ClickOnStatusTextArea() {
        clickOnstatusTextArea.click();
    }

    public void ClickOnEventsBtn() {
        clickOnEventsBtn.click();
    }

    public void ChromeOption() {
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("disable notifactions");
        WebDriver driver = new ChromeDriver(chromeOptions);
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
    }

    public void validateURL() {
        String actualURL = TestBase.driver.getCurrentUrl();
        String expectedURL = "https://www.facebook.com/";
        Assert.assertTrue(actualURL.contains(expectedURL));
        ExtentTestManager.log("URL has been validated : " + actualURL);

    }

}
