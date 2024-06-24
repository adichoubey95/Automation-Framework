package utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import tesebase.WebTestbase;

public class ActionUtil extends WebTestbase {
    public static void mouseHover( WebElement element) {
        Actions a=new Actions(driver);
        a.moveToElement(element).perform();
    }
}
