package allAboutSelenium.frameWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductsPage {

    SeleniumActions seleniumActions;

    public ProductsPage(WebDriver driver){
        seleniumActions=new SeleniumActions(driver);
    }

    By productsHeading=By.cssSelector(".title");
    public String getProductsPageHeading(){
        return seleniumActions.getTextMessage(productsHeading);
    }


}
