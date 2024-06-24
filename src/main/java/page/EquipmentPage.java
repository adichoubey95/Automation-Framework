package page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import tesebase.WebTestbase;
import utility.WebdriverUtil;

public class EquipmentPage extends WebTestbase {

    @FindBy(xpath = "(//a[@class='product-card product-card--margins'])[1]")
    WebElement eqipment;

    public EquipmentPage(){
        PageFactory.initElements(driver,this);// initialization of WebElement.
    }
    public void clickOnEquipmentKeyword(){
        WebdriverUtil.waitUntilElementToBeClickable(eqipment);
    }

}

