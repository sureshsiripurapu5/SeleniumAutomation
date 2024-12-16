package allAboutSelenium.framesAndIframes;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class HandlingFrames {

    WebDriver driver;

    @BeforeSuite
    public void initialization(){
        driver=new EdgeDriver();
    }

    @Test
    public void verifyingFramesAndIframes(){
        driver.get("https://ui.vision/demo/webtest/frames/");
        driver.manage().window().maximize();

        //frame1
        WebElement frame1=driver.findElement(By.xpath("//frame[@src='frame_1.html']"));
        driver.switchTo().frame(frame1); //switching to frame1

        //doing operations in frame1
        driver.findElement(By.xpath("//input[normalize-space(text()='Frame1')]")).sendKeys("selenium");

        driver.switchTo().defaultContent();  //go back to the webpage

        //frame2
        WebElement frame2=driver.findElement(By.xpath("//frame[@src='frame_2.html']"));

        driver.switchTo().frame(frame2);

        driver.findElement(By.xpath("//input[@name='mytext2']")).sendKeys("suresh");

        driver.switchTo().defaultContent();

        //frame3
        WebElement frame3=driver.findElement(By.xpath("//frame[@src='frame_3.html']"));

        driver.switchTo().frame(frame3);

        driver.findElement(By.xpath("//input[@name='mytext3']")).sendKeys("suresh");

        //we are switching iframe(inner frame0) which is there in frame3

        driver.switchTo().frame(0);

        //this is one way, if we get exception like ElementInterpectionException, ElementNotClickableException we can use javascript executor interface
       // driver.findElement(By.xpath("(//div[@class='vd3tt']/child::div[@class='AB7Lab Id5V1'])[2]")).click();
        WebElement radioButton=driver.findElement(By.xpath("(//div[@class='vd3tt']/child::div[@class='AB7Lab Id5V1'])[2]"));


        JavascriptExecutor javascriptExecutor=(JavascriptExecutor) driver;
        javascriptExecutor.executeScript("arguments[0].click()",radioButton);

        driver.switchTo().defaultContent();

        //Assignment on frame5
        WebElement frame5= driver.findElement(By.xpath("//frame[@src='frame_5.html']"));
        driver.switchTo().frame(frame5);

        driver.findElement(By.xpath("//input[@name='mytext5']")).sendKeys("suresh11");

        //driver.switchTo().frame(0);

        WebElement link=driver.findElement(By.xpath("//center/a[text()='https://a9t9.com']"));
        javascriptExecutor.executeScript("arguments[0].click()",link);

        driver.quit();

    }
}
