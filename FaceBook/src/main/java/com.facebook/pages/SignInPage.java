package com.facebook.pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignInPage {
    private static Logger LOGGER = Logger.getLogger(SignInPage.class);

    @FindBy(xpath = "//input[@id='email']")
    private WebElement typeOnEmailFiled;

    @FindBy(xpath = "//input[@id='pass']")
    private WebElement typeOnPasswordFiled;

    @FindBy(xpath = "//button[text()='Log In']")
    private WebElement clickSignInBtn;

    public void typeOnEmailField(String username) {
        typeOnEmailFiled.sendKeys(username);
    }

    public void typeOnPasswordField(String password) {
        typeOnPasswordFiled.sendKeys(password);
    }

    public void ClickOnSignInBtn() {
        clickSignInBtn.click();
    }
}
