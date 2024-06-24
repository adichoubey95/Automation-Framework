package utility;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import tesebase.WebTestbase;

import static java.awt.SystemColor.text;

public class DropdownUtil extends WebTestbase {

    public static void dropdown(WebElement element,String text) {
        Select select = new Select(element);
        select.selectByVisibleText(text);
    }
}


