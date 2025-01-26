package allAboutSelenium.frameWorkTask;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage {

    SeleniumAct seleniumActions;

    public CartPage(WebDriver driver){
        seleniumActions=new SeleniumAct(driver);
        PageFactory.initElements(driver,this);
    }



    @FindBy(css = ".inventory_item_name")
    WebElement cartItemProductText;

    @FindBy(css = ".inventory_item_price")
    WebElement cartItemProductPrice;

    @FindBy(css = "#checkout")
    WebElement checkOut;

    public String getCartProductTitle(){
        return seleniumActions.getTextMessage(cartItemProductText);
    }

    public String getCartProductPrice(){
        return seleniumActions.getTextMessage(cartItemProductPrice);
    }

    public void clickOnCheckOutBtn(){
        seleniumActions.clickOnElement(checkOut);
    }
}
