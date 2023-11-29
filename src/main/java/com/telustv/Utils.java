package com.telustv;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Utils {
    public static void setImplicitWait(WebDriver driver, int seconds) {
        driver.manage().timeouts().implicitlyWait(seconds, TimeUnit.SECONDS);
    }

    public static void waitForPageToLoad(WebDriver driver) {
        WebDriverWait wait = new WebDriverWait(driver, 30);

        wait.until((ExpectedCondition<Boolean>) webDriver ->
                ((JavascriptExecutor) webDriver).executeScript("return document.readyState").equals("complete"));

        setImplicitWait(driver, 10); // Reset implicit wait to its default value after the page is loaded
    }
    
}
