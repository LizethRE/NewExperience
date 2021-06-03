package pageobjects.pages;

import functions.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends Base {
    // Buscador
    private final By SEARCH_INPUT = By.id("search_query_top");
    private final By SEARCH_BUTTON = By.name("submit_search");
    private final By RESULT_SEARCH_INPUT = By.className("product-count");

    public HomePage (WebDriver webDriver) {
        super(webDriver);
    }

    public void searchProduct(String keyword)  {
        if (waitElement(SEARCH_INPUT, 10)){
            type(SEARCH_INPUT, keyword);
            click(SEARCH_BUTTON);
            System.out.print("ESTO:" + getText(RESULT_SEARCH_INPUT));
        }else{
            System.out.print("Ocurrio un error externo");
        }
    }

    public Boolean successfulSearch(){
        if (isDisplayed(RESULT_SEARCH_INPUT)){
            return true;
        }else{
            System.out.print("Ocurrio un error externo");
            return false;
        }
    }
}
