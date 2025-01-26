package allAboutSelenium.frameWorkTask;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckOutOverViewPage {

    SeleniumAct seleniumActions;

    public CheckOutOverViewPage(WebDriver driver){
        seleniumActions=new SeleniumAct(driver);
        PageFactory.initElements(driver,this);
    }

    @FindBy(css = ".inventory_item_name")
    WebElement checkOutOverviewProductName;

    @FindBy(css=".inventory_item_price")
    WebElement checkOutOverViewProductPrice;

   @FindBy(css = "#finish")
    WebElement finishBtn;

   public String checkoutOverViewProductTitle(){
       return seleniumActions.getTextMessage(checkOutOverviewProductName);
   }

   public String checkOutOverViewProductPrice(){
       return seleniumActions.getTextMessage(checkOutOverViewProductPrice);
   }

   public void clickOnfinishButton(){
       seleniumActions.clickOnElement(finishBtn);
   }
}
