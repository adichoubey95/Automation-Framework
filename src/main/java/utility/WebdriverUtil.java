package utility;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import tesebase.WebTestbase;

import java.time.Duration;

public class WebdriverUtil extends WebTestbase {
    public static final long PAGE_LOAD_TIMEOUT=40; // constant wait is applied
    public static final long IMPLICIT_WAIT=40;// constant wait is applied

    public static WebDriverWait webDriverWait;

    public static final long explicitwait=40;

    public static void waitUntilElementToBeClickable(WebElement element){
        webDriverWait=new WebDriverWait(driver, Duration.ofSeconds(explicitwait));
        webDriverWait.until(ExpectedConditions.elementToBeClickable(element)).click();

    }
    public static void sendKeysByElement(WebElement element,String text){
        element.sendKeys(text);
    }

    public static String getTextOfElement(WebElement element) {
        return element.getText();
    }

    }




