package allAboutSelenium.javaScriptExecutorInterface;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class JavaScriptExecutorDemo1 {

    WebDriver driver;
    JavascriptExecutor jse;

    @Test
    public void changeAttributeValue(){
        driver=new EdgeDriver();
        driver.get("https://the-internet.herokuapp.com/windows");
        driver.manage().window().maximize();

        WebElement clickHereElement=driver.findElement(By.xpath("//a[text()='Click Here']"));

        String attributeValue=clickHereElement.getAttribute("target"); //deprrecated
        String attributeValue1=clickHereElement.getDomAttribute("target");
        String attributeValue2=clickHereElement.getDomProperty("target");
        System.out.println(attributeValue);
        System.out.println(attributeValue1);
        System.out.println(attributeValue2);

        jse=(JavascriptExecutor)driver;

        String arg="arguments[0].setAttribute('target','_self')";
        jse.executeScript(arg,clickHereElement);
        clickHereElement.click();

        Assert.assertEquals(driver.findElement(By.xpath("//h3[text()='New Window']")).getText(),"New Window");
    }

    @Test
    public void scrollToElement(){
        driver=new EdgeDriver();
        driver.get("https://the-internet.herokuapp.com/");
        driver.manage().window().maximize();

        WebElement multipleWindowLink=driver.findElement(By.xpath("//a[@href='/windows']"));
        jse=(JavascriptExecutor) driver;
       jse.executeScript("arguments[0].scrollIntoView(true)",multipleWindowLink);
    }

    @Test
    public void typeValueUsingJsId() throws InterruptedException {
        driver=new EdgeDriver();
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();

        jse=(JavascriptExecutor) driver;

        jse.executeScript("document.getElementById(\"user-name\").value='standard_user'");
        jse.executeScript("document.getElementById(\"password\").value='secret_sauce'");
        jse.executeScript("document.getElementById(\"login-button\").click()");
    }

    @Test
    public void typeValueUsingQuerySelector(){
        driver=new EdgeDriver();
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();

        jse=(JavascriptExecutor) driver;

        jse.executeScript("document.querySelector('[name=\"user-name\"]').value='suresh'");


    }

    @Test
    public void getTextUsingJs(){
        driver=new EdgeDriver();
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();

        jse=(JavascriptExecutor) driver;

        String text=jse.executeScript("return document.querySelector('[class=\"login_logo\"]').innerText").toString();
        System.out.println(text);

    }
    @Test
    public void alertPopUpUsingJs(){
        driver=new EdgeDriver();
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();

        jse=(JavascriptExecutor) driver;
        jse.executeScript("alert('Hi this is suresh')");

    }
}
