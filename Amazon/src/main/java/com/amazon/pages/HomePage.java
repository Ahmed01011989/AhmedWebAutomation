package com.amazon.pages;

import com.base.TestBase;
import com.report.ExtentTestManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class HomePage extends TestBase {
    private static Logger LOGGER = Logger.getLogger(HomePage.class);
    @FindBy(xpath = "//span[@class='nav-line-2 nav-long-width']")
    private WebElement SingInBtn;

    @FindBy(xpath = "//input[@id='twotabsearchtextbox']")
    private WebElement searchBar;

    @FindBy(xpath = "(//span[@id='nav-search-submit-text'])[1]")
    private WebElement searchBtn;

    @FindBy(xpath = "//div[@id='nav-cart-text-container']")
    private WebElement cartBtn;
    @FindBy(linkText = "Sell apps on Amazon")
    private WebElement elementSellAppsOnAmazon;


    public void clickOnSignInButton() {
        SingInBtn.click();
        ExtentTestManager.log("Clicked on Sign In Button");

    }

    public void typeOnSearchBar(String data) {
        LOGGER.info("sending keys : " + data);
        searchBar.sendKeys(data);
        ExtentTestManager.log("Type On Search Bar");
    }

    public void clickOnSearchButton() {
        searchBtn.click();
        ExtentTestManager.log("Clicked on Search Button");

    }

    public void clickOnCartButton() {
        cartBtn.click();
        ExtentTestManager.log("Clicked on Cart Button");

    }

    public void validateDropDown() {


        WebElement element = driver.findElement(By.id("searchDropdownBox"));
        Select select = new Select(element);
        select.selectByVisibleText("Books");


    }

    public void validateDragAndDrop() {


        WebElement source = driver.findElement(By.xpath("//a[text()='Gift Cards']"));
        WebElement destination = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));

        Actions actions = new Actions(driver);
        actions.dragAndDrop(source, destination).build().perform();
        ExtentTestManager.log("Success Pass Data To Search Bar");
    }

    public void validateMouseHoverAccontAndList() {
        WebElement accountAndlist = driver.findElement(By.xpath("//a[@id='nav-link-accountList']"));
        Actions actions = new Actions(driver);
        actions.moveToElement(accountAndlist).build().perform();
        driver.findElement(By.xpath("//span[text()='Sign Out']")).click();
        ExtentTestManager.log("Clicked on Sign Out");
    }

    public void scrollToElement() {
        JavascriptExecutor js = (JavascriptExecutor) TestBase.driver;

        js.executeScript("arguments[0].scrollIntoView(true);", elementSellAppsOnAmazon);
        ExtentTestManager.log("The page scrolled down to sell apps on Amazon");

        js.executeScript("window.scrollTo(0,-document.body.scrollHeight)");
        ExtentTestManager.log("Scrolled back to the top of the page");
    }


}
