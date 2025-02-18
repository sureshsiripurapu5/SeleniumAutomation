package allAboutSelenium.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class BlogSpot {
    WebDriver driver;
    @Test(invocationCount = 30)
    public void verifyBlogs() throws InterruptedException {
        driver=new ChromeDriver();
        driver.get("https://how-to-learn-java.blogspot.com/2025/02/javascriptexecutor-in-selenium.html");
        driver.manage().window().maximize();
        Thread.sleep(3000);
        WebElement element=driver.findElement(By.xpath("//a[normalize-space()='Report Abuse'] "));
        JavascriptExecutor javascriptExecutor=(JavascriptExecutor)driver;

        javascriptExecutor.executeScript("arguments[0].scrollIntoView(true)",element);

        Thread.sleep(3000);
        driver.close();

    }
}
