package allAboutSelenium.frameWorkTask;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckOutComplete {
    SeleniumAct seleniumActions;

    public CheckOutComplete(WebDriver driver){
        seleniumActions=new SeleniumAct(driver);
        PageFactory.initElements(driver,this);
    }

    @FindBy(css = ".complete-header")
    WebElement productSuccessMessage;

    public String getSuccessMessage(){
        return seleniumActions.getTextMessage(productSuccessMessage);
    }

}
