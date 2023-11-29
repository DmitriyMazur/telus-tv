package com.telustv;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TelusTVTest {
    private WebDriver driver;
    private HomePage homePage;
    private OnDemandPage ondemandPage;
    private MoviesPage moviesPage;
    private SingleMoviePage singleMoviePage;

    @BeforeClass
    public void setUp() {
        // Set up WebDriver
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        driver = new ChromeDriver();
        // Maximize the browser window
        driver.manage().window().maximize();
        homePage = new HomePage(driver);
        ondemandPage = new OnDemandPage(driver);
        moviesPage = new MoviesPage(driver);
        singleMoviePage = new SingleMoviePage(driver);
        
    }

    @Test
    public void testTelusTV() {
        // 1. Launch TELUS TV+ URL
        driver.get(Config.getProperty("app.base.url"));

        // 2. Close the welcome popup
        homePage.closeWelcomePopup();

        // 3. Click On Demand
        homePage.clickOnMenuItem("On Demand", homePage.onDemandMenu);

        // 4. Scroll to Movies
        ondemandPage.scrollToSection("Movies", ondemandPage.moviesSectionSelector);

        // 5. Click Movies > View All
        ondemandPage.clickViewAll("Movies", ondemandPage.moviesViewAllSelector);

        // 6. Click Filter and Select Animated
        moviesPage.clickFilterAndSeelectCategory(moviesPage.moviesFilterSelector, moviesPage.moviesCategorySelector);

        // 7. Click the Apply option
        moviesPage.clickApplyFilter(moviesPage.moviesApplyFilterSelector);

        // 8. Loop through the list and find and click on asset with rating 18+
        WebElement asset = moviesPage.findAssetWithRating("18+");

        // 9. Click the asset to open the details page
        asset.click();

        // 10. The asset rating 18+ should be displayed
        singleMoviePage.assertRatingOnAssetPage("18+");
    }

    @AfterClass
    public void tearDown() {
        // Close the browser
        driver.quit();
    }
}
