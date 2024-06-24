package page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import tesebase.WebTestbase;
import utility.WebdriverUtil;

public class LoginPage extends WebTestbase {

    @FindBy(id="username")
    WebElement usernameText;

    @FindBy(id="password")
    WebElement passwordText;

    @FindBy(name="login")
    WebElement loginBTn;

    public LoginPage(){
        PageFactory.initElements(driver,this );
    }
    public void login(String username,String password ){
        WebdriverUtil.sendKeysByElement(usernameText,username);
        WebdriverUtil.sendKeysByElement(passwordText,password);
        WebdriverUtil.waitUntilElementToBeClickable(loginBTn);

    }

    }

