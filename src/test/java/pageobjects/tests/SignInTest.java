package pageobjects.tests;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import pageobjects.pages.SignInPage;

public class SignInTest {
    private WebDriver webDriver;
    SignInPage signInPage;

    private final String EMAIL_ADDRESS = "maria_1@hotmail.com";
    private final String PASSWORD = "Perez";

    @Before
    public void setUp(){
        signInPage = new SignInPage(webDriver);
        webDriver = signInPage.initializeWebDriver();
        signInPage.maximize();
        signInPage.visit("http://automationpractice.com/index.php");
    }

    @Test
    public void test(){
        signInPage.goToSignIn();
        signInPage.signIn(EMAIL_ADDRESS, PASSWORD);
        Assert.assertTrue(signInPage.successfulSignIn());
    }

    @After
    public void tearDown(){
        webDriver.quit();
    }

}
