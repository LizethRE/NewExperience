package pageobjects.tests;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import pageobjects.pages.ContactUsPage;

public class ContactUsTest{
    private WebDriver webDriver;
    ContactUsPage contactUsPage;
    private final String SUBJECT = "Customer service";
    private final String EMAIL_ADDRESS = "maria_1@hotmail.com";
    private final String  MESSAGE = "Mi pedido no ha llegado";

    @Before
    public void setUp(){
        contactUsPage = new ContactUsPage(webDriver);
        webDriver = contactUsPage.initializeWebDriver();
        contactUsPage.maximize();
        contactUsPage.visit("http://automationpractice.com/index.php");
    }

    @Test
    public void test(){
        contactUsPage.goToContactUs();
        contactUsPage.contactUs(SUBJECT, EMAIL_ADDRESS, MESSAGE);
        Assert.assertTrue(contactUsPage.successfulContact());
    }

    @After
    public void tearDown(){
        webDriver.quit();
    }

}
