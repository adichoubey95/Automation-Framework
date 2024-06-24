package page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import tesebase.WebTestbase;
import utility.WebdriverUtil;

public class ProductPage extends WebTestbase {
    @FindBy(xpath="//a[@class='button add-to-cart__button button--primary']")
    WebElement addToCardBtn;

    @FindBy(xpath="//a[text()='Checkout']")
    WebElement checkoutBtn;


    public ProductPage(){
        PageFactory.initElements(driver,this);// initialization of WebElement.
    }
    public String  getTextMethodOfAccount(){
        return WebdriverUtil.getTextOfElement(addToCardBtn);
    }
    public void AddToCardBtn(){
        WebdriverUtil.waitUntilElementToBeClickable(addToCardBtn);
    }
    public void clickOnCheckOutBtn(){
        WebdriverUtil.waitUntilElementToBeClickable(checkoutBtn);
    }
}
