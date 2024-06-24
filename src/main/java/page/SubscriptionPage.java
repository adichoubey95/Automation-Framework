package page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import tesebase.WebTestbase;
import utility.ActionUtil;
import utility.DropdownUtil;
import utility.RadioBTnUtil;
import utility.WebdriverUtil;

public class SubscriptionPage extends WebTestbase {
    @FindBy(xpath="//select[@class='pa_weight']")
    WebElement bagSizeTextBox;///1
    @FindBy(xpath="//div[text()='Ground']")
    WebElement groundBtn;//2
    @FindBy(xpath="//select[@class='pa_coffee']")
    WebElement coffeeTextBox;//3
    @FindBy(xpath="//label[@for='pa_grind-espresso-home']")
    WebElement GrindRadioBTn;//done
    @FindBy(xpath="//label[@for='pa_frequency-weekly']")
    WebElement weeklyRadioBtn;//4
    @FindBy(xpath="//select[@class='pa_subscription-length']")
    WebElement subscriptionTextBox;//5
    @FindBy(xpath="//a[@class='button add-to-cart__button']")
    WebElement frequencyBtn;

    public SubscriptionPage(){
        PageFactory.initElements(driver,this);
    }
    public void bagSizeDropdown(){
        DropdownUtil.dropdown(bagSizeTextBox, "500g");
    }
    public void groundBtnClick(){
        WebdriverUtil.waitUntilElementToBeClickable(groundBtn);
    }
    public void coffeeDropdown(){
        DropdownUtil.dropdown(coffeeTextBox,"Coffee of the Month");
    }
    public void subscribeBtnClick(){
        WebdriverUtil.waitUntilElementToBeClickable(frequencyBtn);
    }
    public void GrindRadiobtnClick(){
        WebdriverUtil.waitUntilElementToBeClickable(GrindRadioBTn);
    }
    public void weeklyBtnClick(){
        WebdriverUtil.waitUntilElementToBeClickable(weeklyRadioBtn);
    }
    public void subscribeTextClick(){
        DropdownUtil.dropdown(subscriptionTextBox,"6 months");
    }

    public String  getTextMethodOfSubscribeBtnClick(){
        return WebdriverUtil.getTextOfElement(frequencyBtn);
    }


    }

