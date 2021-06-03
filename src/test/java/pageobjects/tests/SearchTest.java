package pageobjects.tests;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import pageobjects.pages.HomePage;

public class SearchTest {
    private WebDriver webDriver;
    HomePage homePage;

    private final String KEYWORD = "Short";

    @Before
    public void setUp(){
        homePage = new HomePage(webDriver);
        webDriver = homePage.initializeWebDriver();
        homePage.maximize();
        homePage.visit("http://automationpractice.com/index.php");
    }

    @Test
    public void test(){
        homePage.searchProduct(KEYWORD);
        Assert.assertTrue(homePage.successfulSearch());
    }

    @After
    public void tearDown(){
        //webDriver.quit();
    }

}
