package allAboutSelenium.framesAndIframes;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class Frame5 {

    WebDriver driver;
    @Test
    public void handlingFrame5(){
        driver=new EdgeDriver();
        driver.get("https://ui.vision/demo/webtest/frames/frame_5.html");

        driver.findElement(By.xpath("//input[@name='mytext5']")).sendKeys("suresh11");

        JavascriptExecutor javascriptExecutor=(JavascriptExecutor) driver;

        WebElement link=driver.findElement(By.xpath("//center/a[text()='https://a9t9.com']"));
        javascriptExecutor.executeScript("arguments[0].click()",link);


    }
}
