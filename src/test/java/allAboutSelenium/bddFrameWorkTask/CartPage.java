package allAboutSelenium.bddFrameWorkTask;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage {

    SeleniumActions seleniumActions;
    public CartPage(WebDriver driver){
        seleniumActions=new SeleniumActions(driver);
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//h3[@data-qa='cart-item-name']")
    WebElement cartProductTitle;

    @FindBy(xpath = "//p[@data-qa='price']/span")
    WebElement cartProductPrice;

    @FindBy(xpath = "//button[@data-qa='remove-item-test']")
    WebElement removeProduct;
}
