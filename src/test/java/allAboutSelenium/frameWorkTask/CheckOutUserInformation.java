package allAboutSelenium.frameWorkTask;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckOutUserInformation {

    SeleniumAct seleniumActions;

    public CheckOutUserInformation(WebDriver driver){
        seleniumActions=new SeleniumAct(driver);
        PageFactory.initElements(driver,this);
    }


    @FindBy(css = "#first-name")
    WebElement firstName;

    @FindBy(css = "#last-name")
    WebElement lastName;

    @FindBy(css = "#postal-code")
    WebElement postalCode;

    @FindBy(css = "#continue")
    WebElement continueBtn;

    public void enterFirstName(){
        seleniumActions.enterValue(firstName,"suresh");
    }

    public void enterLastName(){
        seleniumActions.enterValue(lastName,"siripurapu");
    }

    public void enterPostalCode(){
        seleniumActions.enterValue(postalCode,"520008");
    }

    public void setDetails(){
        seleniumActions.enterValue(firstName,"suresh");
        seleniumActions.enterValue(lastName,"siripurapu");
        seleniumActions.enterValue(postalCode,"520008");
    }

    public void clickOncontinueButton(){
        seleniumActions.clickOnElement(continueBtn);
    }
}
