package allAboutSelenium.bddFrameWorkTask;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class ProductsPage {

    SeleniumActions seleniumActions;

    public ProductsPage(WebDriver driver){
        seleniumActions=new SeleniumActions(driver);
        PageFactory.initElements(driver,this);

    }

    @FindBy(xpath = "//h5[@data-qa='product-title' and contains(text(),'Black Faux Leather Bomber Jacket')]/../button[@name='Wishlist']")
    List<WebElement> wishList;

    @FindBy(xpath = "//h5[@data-qa='product-title' and contains(text(),'Black Faux Leather Bomber Jacket')]")
    WebElement product;

    @FindBy(xpath = "//div[@role='button' and text()='S']")
    WebElement size;

    @FindBy(xpath = "//h1[text()='Black Faux Leather Bomber Jacket']")
    WebElement productText;

    @FindBy(xpath = "//span[contains(@class,'current-price') and text()='£85.00']")
    WebElement productPrice;

    @FindBy(xpath = "//span[@id='basket-value' and text()='Bag']")
    WebElement bag;

    @FindBy(xpath = "//p[contains(@class,'description')]")
    List<WebElement> addeadItemProductText;

    @FindBy(xpath = "//p[contains(@class,'price--list')]")
    WebElement addeadProductPrice;

    @FindBy(xpath = "//a[@title='VIEW BAG']")
    WebElement viewBagBtn;



}
