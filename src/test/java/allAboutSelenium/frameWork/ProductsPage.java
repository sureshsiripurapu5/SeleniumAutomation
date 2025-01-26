package allAboutSelenium.frameWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductsPage {

    SeleniumActions seleniumActions;

    public ProductsPage(WebDriver driver){
        seleniumActions=new SeleniumActions(driver);
    }

//    By productsHeading=By.cssSelector(".title");
//    public String getProductsPageHeading(){
//        return seleniumActions.getTextMessage(productsHeading);
//    }

    @FindBy(xpath = "//select[@class='product_sort_container']")
    WebElement pricesDropDown;

    public void productFilter(String v){
        seleniumActions.filterProducts(pricesDropDown,v);
    }


}
