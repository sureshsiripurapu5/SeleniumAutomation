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

    @Test
    public void test()  {
        String orderMsg="Thank you for your order!";

        loginPage.login("standard_user","secret_sauce");


        productsPage.selectPriceFilter("hilo");
        String title=productsPage.getHighestProductTitle();
        String price= productsPage.getHighestProductPrice();

        productsPage.clickProductToCart();
        productsPage.clickCart();


        String cartProductTitle=cartPage.getCartProductTitle();
        String cartProductPrice=cartPage.getCartProductPrice();

        Assert.assertEquals(title,cartProductTitle);
        Assert.assertEquals(price,cartProductPrice);

        cartPage.clickOnCheckOutBtn();

        checkOutPage.enterFirstName();
        checkOutPage.enterLastName();
        checkOutPage.enterPostalCode();
        checkOutPage.clickOncontinueButton();


        String checkOutTitle=checkOutOverViewPage.checkoutOverViewProductTitle();
        String checkOutPrice=checkOutOverViewPage.checkOutOverViewProductPrice();
        Assert.assertEquals(title,checkOutTitle);
        Assert.assertEquals(price,checkOutPrice);
        checkOutOverViewPage.clickOnfinishButton();

        String checkOutSucessMsg=checkOutComplete.getSuccessMessage();
        Assert.assertEquals(checkOutSucessMsg,orderMsg);







    }
}
