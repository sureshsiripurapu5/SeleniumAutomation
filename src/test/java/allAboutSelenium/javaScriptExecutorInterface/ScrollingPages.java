package allAboutSelenium.javaScriptExecutorInterface;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class ScrollingPages {

    WebDriver driver;
    @Test
    public void scrollDownSpecificnumberOfPixels(){
        driver=new EdgeDriver();
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();

        String arg="window.scrollBy(0,1000)"; //scroll down to 1000pixels

        JavascriptExecutor js=(JavascriptExecutor) driver;
        js.executeScript(arg,"");
    }

    @Test
    public void scrollUpSpecificNumberOfPixels(){
        driver=new EdgeDriver();
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();

        String arg="window.scrollBy(0,-10000)"; //scroll up to

        JavascriptExecutor js=(JavascriptExecutor) driver;
        js.executeScript(arg,"");

    }
    @Test
    public void scrollToTopOfThePage(){
        driver=new EdgeDriver();
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();

        String arg="window.scrollTo(0,0)"; //scroll up to

        JavascriptExecutor js=(JavascriptExecutor) driver;
        js.executeScript(arg,"");
        driver.close();

    }

    @Test
    public void scrollToSpecificElement(){
        driver=new EdgeDriver();
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();

        WebElement fileUploadBtn=driver.findElement(By.xpath("//button[text()='Upload Single File']"));

        String arg="arguments[0].scrollIntoView(true)";
        JavascriptExecutor js=(JavascriptExecutor) driver;
        js.executeScript(arg,fileUploadBtn);
        driver.close();

    }


}
