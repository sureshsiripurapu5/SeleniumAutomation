package allAboutSelenium.frameWorkTask;

import allAboutSelenium.frameWork.SeleniumActions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class ProductsPage {
    SeleniumAct seleniumActions;

    public ProductsPage(WebDriver driver){
        seleniumActions=new SeleniumAct(driver);
        PageFactory.initElements(driver,this);
    }

    @FindBy(css = ".product_sort_container")
    WebElement pricesDropDown;


    @FindBy(css = ".inventory_item_name ")
    List<WebElement> itemName;

    @FindBy(css = ".inventory_item_price")
    List<WebElement> itemPrice;

    @FindBy(xpath = "//button[text()='Add to cart']")
    List<WebElement> addTocart;

    @FindBy(css = ".shopping_cart_link")
    WebElement cart;

    public String getHighestProductTitle(){
       return seleniumActions.getTextMessage(itemName.get(0));
    }

    public String getHighestProductPrice(){
        return seleniumActions.getTextMessage(itemPrice.get(0));
    }

    public void clickProductToCart(){
        seleniumActions.clickOnElement(addTocart.get(0));
    }

    public void clickCart(){
        seleniumActions.clickOnElement(cart);
    }

    public void selectPriceFilter(String value) {
        seleniumActions.selectByValue1(pricesDropDown, value);
    }


}
