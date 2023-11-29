package com.telustv;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.JavascriptExecutor;

public class OnDemandPage {
    private WebDriver driver;

    // Selector for the Movies section
    public By moviesSectionSelector = By.cssSelector("#root > div.home > div:nth-child(17) > div.header > div > a");
    public By moviesViewAllSelector = By.xpath("/html/body/div/div[2]/div[17]/div[1]/div");

    // Constructor
    public OnDemandPage(WebDriver driver) {
        this.driver = driver;
    }

    // Add methods for interacting with elements on the onDemand page
    
    public void scrollToSection(String sectionName, By sectionSelector) {
        // Find the section
        WebElement section = driver.findElement(sectionSelector);

        JavascriptExecutor js = (JavascriptExecutor) driver;

        // Scroll the page to the section
        js.executeScript("arguments[0].scrollIntoView();", section);
    }
    
    public void clickViewAll(String sectionName, By sectionSelector) {
        driver.findElement(sectionSelector).click();
    }
}
