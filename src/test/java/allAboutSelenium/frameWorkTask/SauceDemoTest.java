package allAboutSelenium.frameWorkTask;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SauceDemoTest extends BaseTest{
    LoginPage loginPage;
    ProductsPage productsPage;
    CartPage cartPage;
    CheckOutUserInformation checkOutPage;
    CheckOutOverViewPage checkOutOverViewPage;
    CheckOutComplete checkOutComplete;

    @BeforeClass
    public void initializePages(){
        loginPage=new LoginPage(driver);
        productsPage=new ProductsPage(driver);
        cartPage=new CartPage(driver);
        checkOutPage=new CheckOutUserInformation(driver);
        checkOutOverViewPage=new CheckOutOverViewPage(driver);
        checkOutComplete=new CheckOutComplete(driver);

    }
    String orderMsg="Thank you for your order!";
    String title;
    String price;
    String cartProductTitle;
    String cartProductPrice;
    String checkOutTitle;
    String checkOutPrice;

    @Test
    public void verifyLoginTest() {
        loginPage.login("standard_user", "secret_sauce");

    }
    @Test(dependsOnMethods = "verifyLoginTest")
    public void verifyProductsPage() {
        productsPage.selectPriceFilter("hilo");
        title = productsPage.getHighestProductTitle();
        price = productsPage.getHighestProductPrice();

        productsPage.clickProductToCart();
        productsPage.clickCart();
    }
    @Test(dependsOnMethods = "verifyProductsPage")
    public void verifyCartPage() {

        cartProductTitle = cartPage.getCartProductTitle();
        cartProductPrice = cartPage.getCartProductPrice();

        Assert.assertEquals(title, cartProductTitle);
        Assert.assertEquals(price, cartProductPrice);

        cartPage.clickOnCheckOutBtn();
    }
    @Test(dependsOnMethods = "verifyCartPage")
    public void verifyCheckOutInformationPage() {

        checkOutPage.enterFirstName();
        checkOutPage.enterLastName();
        checkOutPage.enterPostalCode();
        checkOutPage.clickOncontinueButton();
    }
    @Test(dependsOnMethods = "verifyCheckOutInformationPage")
    public void verifyingCheckOutOverViewPage() {


        checkOutTitle = checkOutOverViewPage.checkoutOverViewProductTitle();
        checkOutPrice = checkOutOverViewPage.checkOutOverViewProductPrice();
        Assert.assertEquals(title, checkOutTitle);
        Assert.assertEquals(price, checkOutPrice);
        checkOutOverViewPage.clickOnfinishButton();
    }
    @Test(dependsOnMethods = "verifyingCheckOutOverViewPage")
    public void verifyingCheckOutSuccessMessage(){

        String checkOutSucessMsg=checkOutComplete.getSuccessMessage();
        Assert.assertEquals(checkOutSucessMsg,orderMsg);

    }
}
