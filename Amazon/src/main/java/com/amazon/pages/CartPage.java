package com.amazon.pages;

import com.base.TestBase;
import com.report.ExtentTestManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class CartPage extends TestBase {
    private static Logger LOGGER = Logger.getLogger(CartPage.class);

    @FindBy(xpath = "(//input[@class='a-button-input'])[1]")
    private WebElement clickproceedToCheckout;

    @FindBy(xpath = "(//i[@class='a-icon a-icon-checkbox'])[1]")
    private WebElement clickOnCheckBox;


    @FindBy(xpath = "(//span[@class='a-size-base-plus'])[1]")
    private WebElement clickSignInToYourAccount;

    public void clickproceedToCheckout() {
        clickproceedToCheckout.click();
        ExtentTestManager.log("Clicked on proceed To Checkout ");
    }

    public void clickSignInToYourAccount() {
        clickSignInToYourAccount.click();
        ExtentTestManager.log("Clicked on SignIn ToYour Account ");
    }

    public void setClickOnCheckBox() {
        clickOnCheckBox.click();
        ExtentTestManager.log("Clicked on CheckBox ");
    }

    public void validateDropDown() {


        WebElement element = driver.findElement(By.xpath("//select[@class='a-native-dropdown a-declarative sc-update-quantity-select']"));
        Select select = new Select(element);
        select.selectByVisibleText("2");
    }

}
