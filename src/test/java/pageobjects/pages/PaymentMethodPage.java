package pageobjects.pages;

import org.openqa.selenium.By;

public class PaymentMethodPage {
    private final By PAY_BY_BANK_WIRE_BUTTON = By.className("bankwire");
    private final By PAY_BY_CHECK_BUTTON = By.className("cheque");
    private final By CONTINUE_SHOPPING_BUTTON = By.linkText("Continue shopping");
}
