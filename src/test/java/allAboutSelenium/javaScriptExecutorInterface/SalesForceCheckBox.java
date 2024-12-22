package allAboutSelenium.javaScriptExecutorInterface;

import org.openqa.selenium.*;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class SalesForceCheckBox {

    WebDriver driver;

    @Test
    public void verfyingCheckBoxUsingJavaScriptExecutor(){
        driver= new EdgeDriver();
        driver.get("https://www.salesforce.com/in/form/signup/freetrial-salesforce-starter/?d=jumbo1-btn-ft");
        driver.manage().window().maximize();

        WebElement agreementCheckBox=driver.findElement(By.xpath("//input[@id='SubscriptionAgreement']/following-sibling::div[@class='checkbox-ui']"));

        String argument="arguments[0].click()";
        JavascriptExecutor jse=(JavascriptExecutor) driver;
        jse.executeScript(argument,agreementCheckBox);

    }

    @Test
    public void verfyingCheckBoxUsingJavaScriptExecutorById() {
        driver = new EdgeDriver();
        driver.get("https://www.salesforce.com/in/form/signup/freetrial-salesforce-starter/?d=jumbo1-btn-ft");
        driver.manage().window().maximize();

        WebElement agreementCheckBox1 = driver.findElement(By.id("SubscriptionAgreement"));

        String arguments = "arguments[0].click()";
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript(arguments, agreementCheckBox1);
    }

    @Test
    public void staleElementReferenceException(){
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
