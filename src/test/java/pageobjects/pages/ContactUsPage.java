package pageobjects.pages;

import functions.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ContactUsPage extends Base {
    private By CONTACT_US_LINK = By.id("contact-link");
    private final By FORM_TITLE = By.className("page-subheading");
    private final By SUBJECT_SELECT = By.id("id_contact");
    private final By EMAIL_ADDRESS_INPUT = By.id("email");
    private final By ORDER_REFERENCE_INPUT = By.id("id_order");
    private final By ATTACH_FILE_INPUT = By.id("fileUpload");
    private final By MESSAGE_TEXTAREA = By.id("message");
    private final By SEND_BUTTON = By.id("submitMessage");
    private final By ERROR_ALERT = By.className("alert-danger");
    private final By SUCCESS_ALERT = By.className("alert-success");
    private final By WARNING_ALERT = By.className("alert-warning");

    public ContactUsPage(WebDriver webDriver) {
        super(webDriver);
    }

    public void goToContactUs(){
        if (waitElement(CONTACT_US_LINK, 5)){
            click(CONTACT_US_LINK);
        }else{
            System.out.print("Ocurrio un error externo");
        }
    }

    public void contactUs(String subject, String email, String message){
        if (waitElement(FORM_TITLE, 10)){
            selectByVisibleText(SUBJECT_SELECT, subject);
            type(EMAIL_ADDRESS_INPUT, email);
            type(MESSAGE_TEXTAREA, message);
            click(SEND_BUTTON);
        }else{
            System.out.print("Ocurrio un error externo");
        }
    }

    public Boolean successfulContact(){
        if (waitElement(SUCCESS_ALERT, 5)){
            return true;
        }else{
            System.out.print("Ocurrio un error externo");
            return false;
        }
    }
}
