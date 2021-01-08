package com.citibank.pages;

import com.base.TestBase;
import com.report.ExtentTestManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LogInPage extends TestBase {
    @FindBy(id = "username")
    private WebElement clickOnUsername;

    @FindBy(id = "password")
    private WebElement clickOnPassword;

    @FindBy(id = "signInBtn")
    private WebElement clickSignOnButton;


    public void userUnableToLogInWithInvalidCredentials() {
        clickOnUsername.sendKeys("test123@gmail.com");
        ExtentTestManager.log("User put email address");
        sleepFor(2);
        clickOnPassword.sendKeys("Test1234");
        ExtentTestManager.log("User put password");
        sleepFor(2);
        clickSignOnButton.click();
        ExtentTestManager.log("User clicked Sign On Button");
        sleepFor(2);

    }
}
