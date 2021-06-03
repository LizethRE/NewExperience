package pageobjects.pages;

import functions.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegisterPage extends Base {
    private final By SIGN_IN_LINK = By.className("login");

    private final By ACCOUNT_LINK = By.className("account");

    // Formulario "CREATE AN ACCOUNT"
    private final By EMAIL_ADDRESS_INPUT = By.id("email_create");
    private final By CREATE_ACCOUNT_BUTTON = By.id("SubmitCreate");

    // Formulario "YOUR PERSONAL INFORMATION"
    private final By FIRST_NAME_INPUT = By.id("customer_firstname");
    private final By LAST_NAME_INPUT = By.id("customer_lastname");
    private final By PASSWORD_INPUT = By.id("passwd");
    private final By ADDRESS_INPUT = By.id("address1");
    private final By CITY_INPUT = By.id("city");
    private final By STATE_SELECT = By.id("id_state");
    private final By POSTAL_CODE_INPUT = By.id("postcode");
    private final By COUNTRY_SELECT = By.id("id_country");
    private final By MOBILE_PHONE_INPUT = By.id("phone_mobile");
    private final By ADDRESS_ALIAS_INPUT = By.id("alias");
    private final By REGISTER_BUTTON = By.id("submitAccount");

    public RegisterPage (WebDriver webDriver) {
        super(webDriver);
    }

    public void goToRegister(){
        if (waitElement(SIGN_IN_LINK, 5)){
            click(SIGN_IN_LINK);
        }else{
            System.out.print("Ocurrio un error externo");
        }
    }

    public void createAccount(String email) throws InterruptedException {
        if (waitElement(EMAIL_ADDRESS_INPUT, 10)){
            type(EMAIL_ADDRESS_INPUT, email);
            click(CREATE_ACCOUNT_BUTTON);
            Thread.sleep(3000);
        }else{
            System.out.print("Ocurrio un error externo");
        }
    }

    public void personalInformation(String firstName, String lastName, String password, String address, String city, String state, String code, String country, String phone, String addressAlias){
        if (waitElement(FIRST_NAME_INPUT, 10)){
            type(FIRST_NAME_INPUT, firstName);
            type(LAST_NAME_INPUT, lastName);
            type(PASSWORD_INPUT, password);
            type(ADDRESS_INPUT, address);
            type(CITY_INPUT, city);
            selectByVisibleText(STATE_SELECT, state);
            type(POSTAL_CODE_INPUT, code);
            selectByVisibleText(COUNTRY_SELECT, country);
            type(MOBILE_PHONE_INPUT, phone);
            type(ADDRESS_ALIAS_INPUT, addressAlias);
            click(REGISTER_BUTTON);
        }else{
            System.out.print("Ocurrio un error externo");
        }
    }

    public Boolean successfulRegistration(){
        if (waitElement(ACCOUNT_LINK, 5)){
            return true;
        }else{
            System.out.print("Ocurrio un error externo");
            return false;
        }
    }
}
