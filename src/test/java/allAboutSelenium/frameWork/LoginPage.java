package allAboutSelenium.frameWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    SeleniumActions seleniumActions;

    public LoginPage(WebDriver driver){
        seleniumActions=new SeleniumActions(driver);

    }

    private By userNameInputBox=By.xpath("//input[@id='user-name'");
    private  By passwordBox=By.xpath("//input[@id='password'");
    private By loginButton=By.xpath("//input[@id='login-button'");

    public void login(String userName,String pasword){
        seleniumActions.enterValue(userNameInputBox,userName);
        seleniumActions.enterValue(passwordBox,pasword);
        seleniumActions.clickOnElement(loginButton);
    }


}
