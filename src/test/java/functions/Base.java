package functions;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Base {
    protected WebDriver webDriver;

    public Base(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public WebDriver initializeWebDriver(){
        System.setProperty("webdriver.chrome.driver", "./src/test/resources/drivers/chromedriver.exe");
        webDriver = new ChromeDriver();
        webDriver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);

        return webDriver;
    }

    public void visit(String url) {
        webDriver.get(url);
    }

    public void maximize() {
        webDriver.manage().window().maximize();
    }

    public WebElement findElement(By locator) {
        return webDriver.findElement(locator);
    }

    public List<WebElement> findElements(By locator) {
        return webDriver.findElements(locator);
    }

    public Boolean waitElement(By locator, int timeout) {
        WebDriverWait webDriverWait = new WebDriverWait(webDriver, timeout);
        webDriverWait.until(ExpectedConditions.visibilityOf(webDriver.findElement(locator)));
        return true;
    }

    public String getText(By locator) {
        return webDriver.findElement(locator).getText();
    }

    public void click(By locator) {
        webDriver.findElement(locator).click();
    }

    public void submit(By locator) {
        webDriver.findElement(locator).submit();
    }

    public void clear(By locator) {
        webDriver.findElement(locator).clear();
    }

    public void type(By locator, String text) {
        webDriver.findElement(locator).sendKeys(text);
    }

    public void selectByIndex(By locator, int index) {
        Select select = new Select(webDriver.findElement(locator));
        select.selectByIndex(index);
    }

    public void selectByValue(By locator, String value) {
        Select select = new Select(webDriver.findElement(locator));
        select.selectByValue(value);
    }

    public void selectByVisibleText(By locator, String value) {
        Select select = new Select(webDriver.findElement(locator));
        select.selectByVisibleText(value);
    }

    public Boolean isDisplayed(By locator) {
        try {
            return webDriver.findElement(locator).isDisplayed();
        } catch (NoSuchElementException e) {
            return false;
        }
    }
}
