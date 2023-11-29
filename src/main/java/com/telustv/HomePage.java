
package com.telustv;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

// import java.util.NoSuchElementException;
// import org.openqa.selenium.JavascriptExecutor;

public class HomePage {
    private WebDriver driver;

    // Constructor
    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    // Selector for page elements
    public By welcomePopupCloseButton = By.cssSelector("div.welcome-slide-container button.imageButton");
    public By onDemandMenu = By.cssSelector("a[href='#/PAGE/1798']");

    // Add methods for interacting with elements on the home page

    public void closeWelcomePopup() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement popup = wait.until(ExpectedConditions
                .elementToBeClickable(welcomePopupCloseButton));
        // Click on the popup
        popup.click();
    }

       public void scrollToBottom() {
        // Scroll to the bottom of the page using JavaScript
        ((JavascriptExecutor) driver).executeScript("window.scrollTo(0, document.body.scrollHeight);");
    }
    
    public void clickOnMenuItem(String menuItem, By selector) {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(selector));
        element.click();
        Utils.waitForPageToLoad(driver);
    
    }
    
}