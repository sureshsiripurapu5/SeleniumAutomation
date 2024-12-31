package allAboutSelenium.frameWork;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LoginTests extends BaseTest {

    LoginPage loginPage;
    ProductsPage productsPage;

    @BeforeClass
    public void initialiazePages(){
        loginPage=new LoginPage(driver);
        productsPage=new ProductsPage(driver);

    }

    @Test
    public void verifyLoginTests(){
        loginPage.login("standard_user","secret_sauce");
        Assert.assertEquals(productsPage.getProductsPageHeading(),"Products");
    }


}
