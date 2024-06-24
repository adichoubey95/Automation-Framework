package page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import tesebase.WebTestbase;
import utility.ActionUtil;
import utility.WebdriverUtil;

public class HomePage extends WebTestbase {

    @FindBy(xpath="//a[@class='user-controls__ul__li__a']")// WebElement declaration.
    WebElement userLoginBTn;

    @FindBy(xpath="//a[@class='newsletter__close newsletter__trigger']")
    WebElement firstAd;

    @FindBy(xpath="//button[@title='Close']")
    WebElement homeAdd;

    @FindBy(id="menu-item-359695")
    WebElement subscriptionBTn;

    @FindBy(xpath = "//a[text()='Beans and Ground']")
    WebElement BeansAndGroundBtn;







    public HomePage(){
        PageFactory.initElements(driver,this);// initialization of WebElement.
    }

    public void closeAd(){
        WebdriverUtil.waitUntilElementToBeClickable(firstAd);
    }
    public void clickOnLoginbtn(){
        WebdriverUtil.waitUntilElementToBeClickable(userLoginBTn);
    }
    public void closeHomeAdd(){
        WebdriverUtil.waitUntilElementToBeClickable(homeAdd);
    }
    public void subcribeMousehover(){
        ActionUtil.mouseHover(subscriptionBTn);
    }
    public void beansGround(){
        WebdriverUtil.waitUntilElementToBeClickable(BeansAndGroundBtn);
    }


}
