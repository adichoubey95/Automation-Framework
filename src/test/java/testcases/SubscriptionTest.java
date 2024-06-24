package testcases;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import page.*;
import tesebase.WebTestbase;

public class SubscriptionTest extends WebTestbase {
    public HomePage homePage;
    public LoginPage loginPage;
    public MyAccoutPage myAccoutPage;
    public EquipmentPage equipmentPage;
    public ProductPage productPage;
    public AddToCartPage addToCartPage;
    public DeliveryPage deliveryPage;
    public SubscriptionPage subscriptionPage;



    @BeforeMethod
    public void prerequiste() {
        intialization();
        homePage = new HomePage();
        loginPage = new LoginPage();
        myAccoutPage = new MyAccoutPage();
        equipmentPage = new EquipmentPage();
        productPage = new ProductPage();
        addToCartPage = new AddToCartPage();
        deliveryPage = new DeliveryPage();
        subscriptionPage=new SubscriptionPage();


    }

    @Test
    public void verifyAddProduct(){
        SoftAssert softAssert = new SoftAssert();
        homePage.closeHomeAdd();
        homePage.closeAd();
        homePage.subcribeMousehover();
        homePage.beansGround();
        homePage.closeAd();
        subscriptionPage.bagSizeDropdown();
        subscriptionPage.groundBtnClick();
        subscriptionPage.GrindRadiobtnClick();
        subscriptionPage.coffeeDropdown();
        subscriptionPage.weeklyBtnClick();
        subscriptionPage.subscribeTextClick();
        subscriptionPage.subscribeBtnClick();
        softAssert.assertEquals(subscriptionPage.getTextMethodOfSubscribeBtnClick(),"JUST A MOMENT...","pop up should display");
        softAssert.assertAll();
    }

    @AfterMethod
    public void tearDown() {
        driver.close();
    }
}
