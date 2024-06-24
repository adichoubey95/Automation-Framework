package page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import tesebase.WebTestbase;
import utility.ActionUtil;
import utility.WebdriverUtil;

public class MyAccoutPage extends WebTestbase {

    @FindBy(xpath="//h2[text()='My Account']")
    WebElement myAccountText;

    @FindBy(xpath = "//a[text()='Shop']")
    WebElement shop;

    @FindBy(xpath="//a[text()='Equipment']")
    WebElement shopKeyword;

    public MyAccoutPage(){
        PageFactory.initElements(driver,this);
    }
    public String  getTextMethodOfAccount(){
        return WebdriverUtil.getTextOfElement(myAccountText);
    }
    public void clickOnShopKeyword(){
        WebdriverUtil.waitUntilElementToBeClickable(shopKeyword);
    }

    public void clickOnShopBtn(){
        ActionUtil.mouseHover(shop);
    }


}
