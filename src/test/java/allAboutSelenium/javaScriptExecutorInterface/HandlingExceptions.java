package allAboutSelenium.javaScriptExecutorInterface;

import org.openqa.selenium.*;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class HandlingExceptions {

    WebDriver driver;

    @Test
    public void handlingElementClickInterceptedException(){
        driver=new EdgeDriver();
        driver.get("https://www.salesforce.com/in/form/signup/freetrial-salesforce-starter/?d=jumbo1-btn-ft");
        driver.manage().window().maximize();

        JavascriptExecutor jse=(JavascriptExecutor) driver;

        WebElement agreementCheckBox1 = driver.findElement(By.id("SubscriptionAgreement"));

        try{
            agreementCheckBox1.click();

        }
        catch (ElementClickInterceptedException ee){
            jse.executeScript("arguments[0].click()",agreementCheckBox1);
        }

    }

    @Test
    public void handlingStaleElementReferenceException(){
        driver=new EdgeDriver();
        driver.get("https://testautomationpractice.blogspot.com/");

        WebElement nameBox=driver.findElement(By.xpath("//input[@id='name']"));
        nameBox.sendKeys("selenium");

        driver.navigate().refresh();

        try{
            nameBox.sendKeys("selenium");

        }
        catch (StaleElementReferenceException ste){
            driver.findElement(By.xpath("//input[@id='name']")).sendKeys("selenium");
        }

    }


}
