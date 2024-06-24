package utility;

import org.openqa.selenium.WebElement;
import tesebase.WebTestbase;

public class RadioBTnUtil extends WebTestbase {
    public void radioBtn(WebElement element){
        System.out.println(element.isSelected());
        element.click();
    }

}
