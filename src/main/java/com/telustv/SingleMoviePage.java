package com.telustv;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class SingleMoviePage {

    private WebDriver driver;

    // Constructor
    public SingleMoviePage(WebDriver driver) {
        this.driver = driver;
    }

    // Add methods for interacting with elements on the single movie page

    public void assertRatingOnAssetPage(String rating) {
        // Find the asset on the asset page using the rating
        By assetRatingLocator = By.xpath(
                "//span[contains(@class, 'no-scores-line-metadata') or contains(@class, 'line-metadata') and contains(text(), '"
                        + rating + "')]");

        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement ratingElement = wait.until(ExpectedConditions.visibilityOfElementLocated(assetRatingLocator));

        // Perform your assertion here, for example:
        Assert.assertTrue(ratingElement.isDisplayed(), "Rating (" + rating + ") is not displayed on the asset page.");
    }

}
