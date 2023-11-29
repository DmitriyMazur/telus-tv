package com.telustv;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;

public class MoviesPage {
    private WebDriver driver;

    // Constructor
    public MoviesPage(WebDriver driver) {
        this.driver = driver;
    }

    // Selectors for Movies page elements
    public By moviesFilterSelector = By.cssSelector("div.button-container:nth-child(1) > div:nth-child(1)");
    public By moviesCategorySelector = By.cssSelector("div.dropdownList:nth-child(2) > div:nth-child(2) > div:nth-child(4) > label:nth-child(1) > span:nth-child(3)");
    public By moviesApplyFilterSelector = By.cssSelector("div.filter-button:nth-child(3)");

    // Add methods for interacting with elements on the home page
    
    public void clickFilterAndSeelectCategory(By FilterSelector, By CategorySelector) {
        driver.findElement(FilterSelector).click();
        driver.findElement(CategorySelector).click();
    }

    public void clickApplyFilter(By moviesApplyFilterSelector) {
        driver.findElement(moviesApplyFilterSelector).click();
    }
    
    public WebElement findAssetWithRating(String rating) {
        // Implement logic to loop through the list and find an asset with the specified rating
        By assetLocator = By.xpath("//div[@class='item-container']//p[@class='subtitle' and text()='" + rating + "']");
        
        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement asset = wait.until(ExpectedConditions.visibilityOfElementLocated(assetLocator));
    
        // Scroll to the found asset
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", asset);
    
        return asset;
    }
}
