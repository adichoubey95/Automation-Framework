package testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import page.*;
import tesebase.WebTestbase;

public class LoginTest extends WebTestbase {

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


    @Test(description = "Verify login page with valid username and password")

    public void verifyLoginPage() {
        SoftAssert softAssert = new SoftAssert();
        homePage.closeHomeAdd();
        homePage.closeAd();
        homePage.clickOnLoginbtn();
        loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
        softAssert.assertEquals(myAccoutPage.getTextMethodOfAccount(), "MY ACCOUNT", "My account page should be display");
        softAssert.assertAll();
    }


    @Test(description = "verify product should be added in AddToCart Page,pop up should come")

    public void verifyProduct() {
        SoftAssert softAssert = new SoftAssert();
        homePage.closeHomeAdd();
        homePage.closeAd();
        //homePage.clickOnLoginbtn();
        //loginPage.login(prop.getProperty("username"),prop.getProperty("password"));
        myAccoutPage.clickOnShopBtn();
        myAccoutPage.clickOnShopKeyword();
        homePage.closeAd();
        equipmentPage.clickOnEquipmentKeyword();
        productPage.AddToCardBtn();
        softAssert.assertEquals(productPage.getTextMethodOfAccount(), "ADD TO CART", "pop up should be display");
        softAssert.assertAll();
    }

    @Test(description = "verify payment page should come")
    public void verifyPayment() {
        SoftAssert softAssert = new SoftAssert();
        homePage.closeHomeAdd();
        homePage.closeAd();
        myAccoutPage.clickOnShopBtn();
        myAccoutPage.clickOnShopKeyword();
        homePage.closeAd();
        equipmentPage.clickOnEquipmentKeyword();
        productPage.AddToCardBtn();
        productPage.clickOnCheckOutBtn();
        addToCartPage.emailId(prop.getProperty("username"));
        addToCartPage.deliverBtnClick();
        addToCartPage.passWord(prop.getProperty("password"));
        addToCartPage.deliverBtnClick();
        deliveryPage.name(prop.getProperty("first"), prop.getProperty("last"));
        deliveryPage.checkBoxClick();
        deliveryPage.name1( prop.getProperty("add"), prop.getProperty("sub"));
        deliveryPage.dropDownElement();
        deliveryPage.mobPost(prop.getProperty("mob"), prop.getProperty("post"));
        deliveryPage.paymentBtnClick();
        softAssert.assertEquals(deliveryPage.getTextMethodOfAccount(),"","payment page should display");
        softAssert.assertAll();
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
