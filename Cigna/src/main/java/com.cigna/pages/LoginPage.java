package com.cigna.pages;

import com.base.TestBase;
import com.report.ExtentTestManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends TestBase {
    @FindBy(linkText = "Get an ID card")
    private WebElement clickLogIn;

    @FindBy(id = "username")
    private WebElement clickUsername;

    @FindBy(id = "password")
    private WebElement clickPassword;


    public void userUnableToLogInWithInvalidCredentials() {

        WebElement element = driver.findElement(By.linkText("Get an ID card"));

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", element);
        ExtentTestManager.log("User Scroll to Get an ID card");
        clickLogIn.click();
        ExtentTestManager.log("Clicked Get an ID card");
        clickUsername.sendKeys("alnassiryahmed5@gmail.com");
        ExtentTestManager.log("User put email address");
        clickPassword.sendKeys("Alnassiry87");
        ExtentTestManager.log("User put password");

    }

}
