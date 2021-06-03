package pageobjects.tests;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import pageobjects.pages.RegisterPage;

public class ShoppingTest {
    private WebDriver webDriver;
    RegisterPage registerPage;

    private final String EMAIL_ADDRESS = "maria_1@hotmail.com";
    private final String FIRST_NAME = "Maria";
    private final String LAST_NAME = "Perez";
    private final String PASSWORD = "Perez";
    private final String ADDRESS = "4073 Holly CT";
    private final String CITY = "Weston";
    private final String STATE = "Washington";
    private final String POSTAL_CODE = "33331";
    private final String COUNTRY = "United States";
    private final String MOBILE_PHONE = "310456789";
    private final String ADDRESS_ALIAS = "My address";

    @Before
    public void setUp(){
        registerPage = new RegisterPage(webDriver);
        webDriver = registerPage.initializeWebDriver();
        registerPage.maximize();
        registerPage.visit("http://automationpractice.com/index.php");
    }

    @Test
    public void test() throws InterruptedException {
        registerPage.goToRegister();
        registerPage.createAccount(EMAIL_ADDRESS);
        registerPage.personalInformation(FIRST_NAME, LAST_NAME, PASSWORD, ADDRESS, CITY, STATE, POSTAL_CODE, COUNTRY, MOBILE_PHONE, ADDRESS_ALIAS);
        Assert.assertTrue(registerPage.successfulRegistration());
    }

    @After
    public void tearDown(){
        webDriver.quit();
    }

}
