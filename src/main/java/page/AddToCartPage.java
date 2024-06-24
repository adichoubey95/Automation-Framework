package page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import tesebase.WebTestbase;
import utility.WebdriverUtil;

public class AddToCartPage extends WebTestbase {

    @FindBy(id="username")
    WebElement emailIdText;

    @FindBy(id="password")
    WebElement passwordText;

    @FindBy(name="login")
    WebElement deliverBtn;

    public AddToCartPage(){
        PageFactory.initElements(driver,this);
    }
    public void deliverBtnClick(){

        WebdriverUtil.waitUntilElementToBeClickable(deliverBtn);
    }
    public void emailId(String username)

    {
        WebdriverUtil.sendKeysByElement(emailIdText, username);
    }
    public void passWord(String password){
        WebdriverUtil.sendKeysByElement(passwordText,password);


}}

