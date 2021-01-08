package com.cigna.pages;

import com.base.TestBase;
import com.report.ExtentTestManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class ProductPage extends TestBase {
    @FindBy(linkText = "Plans and Services Overview")
    private WebElement clickOnPlansAndServicesOverview;

    @FindBy(linkText = "Dental Insurance Plans")
    private WebElement clickOnDentalInsurancePlans;


    @FindBy(id = "plans-services-1-tab")
    private WebElement clickOnPlansAndServices;


    public void ValidateMouseHoverOverIndividualsAndFamilies() {
        WebElement user = driver.findElement(By.id("individuals-families-level-one-link"));
        Actions actions = new Actions(driver);
        actions.moveToElement(user).build().perform();
        ExtentTestManager.log("User hover over Individuals and Families");
        sleepFor(2);
    }

    public void checkTheirProducts() {
        ValidateMouseHoverOverIndividualsAndFamilies();
        clickOnPlansAndServices.click();
        ExtentTestManager.log("licked on Plans and Services");
        clickOnPlansAndServicesOverview.click();
        ExtentTestManager.log("Clicked on Plans and Services Overview");
    }

    public void checkProductForDentalPlans() {
        checkTheirProducts();
        clickOnDentalInsurancePlans.click();
        ExtentTestManager.log("Clicked on Dental Insurance Plans");
    }
}
