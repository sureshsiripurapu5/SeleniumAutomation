package allAboutSelenium.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import java.time.Duration;

public class Sample {
    WebDriver driver;
    @Test
    public void b() throws InterruptedException {
        driver=new EdgeDriver();
        driver.get("https://www.poundland.co.uk/food-and-drink/chocolates-and-sweets");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().window().maximize();

//        Thread.sleep(5000);

        driver.findElement(By.xpath("(//button[normalize-space()='Accept All Cookies'])[1]")).click();

        String text=driver.findElement(By.xpath("//span[contains(@id,'323559')]")).getText();
        System.out.println(text);

        driver.findElement(By.xpath("(//span[@class='basket-amount']/span/span[@class='price'])[2]")).click();
//        JavascriptExecutor javascriptExecutor=(JavascriptExecutor) driver;
//        javascriptExecutor.executeScript("arguments[0].click();",args);
    }
}
