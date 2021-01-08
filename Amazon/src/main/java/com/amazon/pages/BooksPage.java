package com.amazon.pages;

import com.report.ExtentTestManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BooksPage {
    private static Logger LOGGER = Logger.getLogger(BooksPage.class);
    @FindBy(xpath = "//span[text()='BARACK OBAMA: A Barack Obama Biography']")
    private WebElement clickOnBook;

    @FindBy(xpath = "//span[text()='BARACK OBAMA: A Barack Obama Biography']")
    private WebElement clickAddToCart;

    public void clickOnObamaBook() {
        clickOnBook.click();
        ExtentTestManager.log("Clicked on Barack Obama Book ");

    }

    public void clickOnAddToCartBtn() {
        clickAddToCart.click();
        ExtentTestManager.log("Clicked on Add To Cart ");

    }
}
