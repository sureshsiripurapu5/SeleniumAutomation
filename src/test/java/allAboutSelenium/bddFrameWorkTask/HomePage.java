package allAboutSelenium.bddFrameWorkTask;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    SeleniumActions seleniumActions;

    public HomePage(WebDriver driver){
        seleniumActions=new SeleniumActions(driver);
        PageFactory.initElements(driver,this);

    }

    @FindBy(xpath = "//span[text()='men']")
    WebElement men;

    @FindBy(xpath = "//a[normalize-space()='All Menswear']")
    WebElement allMenClothing;

    public void searchingCategoryByMouseAction(){
        seleniumActions.moveToElement(men,allMenClothing);
    }

}
