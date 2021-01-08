package com.amazon.pages;

import com.base.TestBase;
import com.report.ExtentTestManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;


public class SignInPage extends TestBase {
    private static Logger LOGGER = Logger.getLogger(SignInPage.class);

    @FindBy(xpath = "//input[@id='ap_email']")
    private WebElement typeOnEmailFiled;

    @FindBy(xpath = "//input[@id='continue']")
    private WebElement clickOnContinueBtn;

    @FindBy(xpath = "//input[@id='ap_password']")
    private WebElement typeOnPasswordFiled;

    @FindBy(xpath = "//input[@id='signInSubmit']")
    private WebElement clickOnSignInBtn;


    @FindBy(xpath = "//a[@id='createAccountSubmit']")
    private WebElement CreateAnAccountBtn;

    @FindBy(xpath = "//input[@id='ap_customer_name']")
    private WebElement yourname;

    @FindBy(xpath = "//input[@id='ap_email']")
    private WebElement email;

    @FindBy(xpath = "//input[@id='ap_password']")
    private WebElement password;

    @FindBy(xpath = "//input[@id='ap_password_check']")
    private WebElement reenterpassword;

    @FindBy(xpath = "//input[@id='continue']")
    private WebElement getCreateAnAccountBtn;

    public void clickOnCreateAnAccountBtn() {
        CreateAnAccountBtn.click();
        ExtentTestManager.log("Clicked on Create An Account Button");

    }

    public void setCreateAnAccountBtn() {
        yourname.sendKeys("Ahmed");
        email.sendKeys("test1@gmail.com");
        password.sendKeys("test1234");
        reenterpassword.sendKeys("test1234");
    }

    public void clickOnCreateyourAmazonAccountBtn() {
        getCreateAnAccountBtn.click();
        ExtentTestManager.log("Clicked on Create your Amazon Account Button");

    }

    public void setClickOnSignInBtn() {
        typeOnEmailFiled.sendKeys("alnassiryahmed677@gmail.com");
        clickOnContinueBtn.click();
        typeOnPasswordFiled.sendKeys("AliSaleh89");
        clickOnSignInBtn.click();
    }

    public void validateCreateAccountURL() {
        String actualURL = TestBase.driver.getCurrentUrl();
        String expectedURL = "https://www.amazon.com/ap/register";

        Assert.assertTrue(actualURL.contains(expectedURL));
        ExtentTestManager.log("Validated Create Account URL is displayed " + actualURL);
    }

}
