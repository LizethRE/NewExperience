package pageobjects.pages;

import org.openqa.selenium.By;

public class ShoppingCartSummaryPage {
    private final By PRODUCT_ROW = By.id("product_");
    private final By QUANTITY_PRODUCT_INPUT = By.className("quantity_");
    private final By QUANTITY_PRODUCT_PLUS_BUTTON = By.className("cart_quantity_up_");
    private final By QUANTITY_PRODUCT_DEDUCT_BUTTON = By.id("cart_quantity_down_");
    private final By PRICE_PRODUCT_LABEL = By.id("total_product_price_");
    private final By REMOVE_PRODUCT_BUTTON = By.id("_");
    private final By PROCEED_TO_CHECKOUT_BUTTON = By.linkText("Proceed to checkout");
    private final By PROCEED_TO_CHECKOUT_BUTTON2 = By.className("standard-checkout");
}
