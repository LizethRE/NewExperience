package pageobjects.pages;

import org.openqa.selenium.By;

public class ShippingPage {
    private final By TERMS_CHECK = By.id("cgv");
    private final By CONTINUE_SHOPPING_BUTTON = By.linkText("Continue shopping");
    private final By PROCEED_TO_CHECKOUT_BUTTON = By.name("processCarrier");
}
