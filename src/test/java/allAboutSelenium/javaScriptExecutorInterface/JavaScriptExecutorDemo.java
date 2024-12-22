package allAboutSelenium.javaScriptExecutorInterface;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class JavaScriptExecutorDemo {

    WebDriver driver;

    @Test
    public void verfyingJavaScriptStatements(){
        driver=new EdgeDriver();
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();

        WebElement userInputBox=driver.findElement(By.xpath("//input[@id='name' and @placeholder='Enter Name']"));
        //userInputBox.sendKeys("suresh");

        JavascriptExecutor javascriptExecutor=(JavascriptExecutor) driver;
        //alternate of sendKeys() --
        javascriptExecutor.executeScript("arguments[0].setAttribute('value','suresh')",userInputBox);

        WebElement checkBoxBtn=driver.findElement(By.xpath("//input[@class='form-check-input' and @id='sunday']"));
        //checkBoxBtn.click();

        //alternate of click() method
        String arg="arguments[0].click()";

        javascriptExecutor.executeScript(arg,checkBoxBtn);
        driver.quit();


    }
}
