package page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import tesebase.WebTestbase;
import utility.DropdownUtil;
import utility.WebdriverUtil;

public class DeliveryPage extends WebTestbase {
    @FindBy(name="billing_first_name")
    WebElement firstname;
    @FindBy(id="billing_last_name")
    WebElement lastname;
    @FindBy(xpath="//label[@for='billing_autocomplete_off'] ")
    WebElement checkBox;
    @FindBy(id="billing_address_1")
    WebElement addressStreet;
    @FindBy(id="billing_city")
    WebElement suburb;
    @FindBy(name="billing_state")
    WebElement stateTextbox;
    @FindBy(id="billing_postcode")
    WebElement postalCode;
    @FindBy(id="billing_phone")
    WebElement phoneNo;
    @FindBy(xpath="//a[text()='Continue to payment']")
    WebElement paymentBtn;

    public DeliveryPage() {
        PageFactory.initElements(driver, this);
    }

    public void name(String first, String last)

    {
        WebdriverUtil.sendKeysByElement(firstname, first);
        WebdriverUtil.sendKeysByElement(lastname, last);
    }
    public void name1(String add, String sub)
    {
        WebdriverUtil.sendKeysByElement(addressStreet, add);
        WebdriverUtil.sendKeysByElement(suburb, sub);
    }
    public void mobPost(String  post, String mob){
        WebdriverUtil.sendKeysByElement(postalCode, post);
        WebdriverUtil.sendKeysByElement(phoneNo, mob);
    }

    public void dropDownElement() {
        DropdownUtil.dropdown(stateTextbox, "Tasmania");

    }

    public void paymentBtnClick() {
        WebdriverUtil.waitUntilElementToBeClickable(paymentBtn);
    }
    public void checkBoxClick(){
        WebdriverUtil.waitUntilElementToBeClickable(checkBox);
    }

    public String getTextMethodOfAccount() {
        return WebdriverUtil.getTextOfElement(paymentBtn);
    }


}
