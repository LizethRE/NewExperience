package pageobjects.pages;

import functions.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignInPage extends Base {
    private final By SIGN_IN_LINK = By.className("login");

    private final By ACCOUNT_LINK = By.className("account");

    private final By EMAIL_ADDRESS_INPUT = By.id("email");
    private final By PASSWORD_INPUT = By.id("passwd");
    private final By FORGOT_PASSWORD_LINK = By.linkText("Forgot your password?");
    private final By FORGOT_PASSWORD_LINK2 = By.xpath("//*[@id=\"login_form\"]/div/p[1]/a");
    private final By SIGN_IN_BUTTON = By.id("SubmitLogin");

    public SignInPage (WebDriver webDriver) {
        super(webDriver);
    }

    public void goToSignIn(){
        if (waitElement(SIGN_IN_LINK, 5)){
            click(SIGN_IN_LINK);
        }else{
            System.out.print("Ocurrio un error externo");
        }
    }

    public void signIn(String email, String password)  {
        if (waitElement(EMAIL_ADDRESS_INPUT, 10)){
            type(EMAIL_ADDRESS_INPUT, email);
            type(PASSWORD_INPUT, password);
            click(SIGN_IN_BUTTON);
        }else{
            System.out.print("Ocurrio un error externo");
        }
    }

    public Boolean successfulSignIn(){
        if (waitElement(ACCOUNT_LINK, 5)){
            return true;
        }else{
            System.out.print("Ocurrio un error externo");
            return false;
        }
    }
}
