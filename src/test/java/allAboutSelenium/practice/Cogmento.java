package allAboutSelenium.practice;

import org.apache.poi.ss.formula.functions.T;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

public class Cogmento {

    private static final Logger log = LoggerFactory.getLogger(Cogmento.class);
    WebDriver driver;

    @Test
    public void verify() throws InterruptedException {
        driver=new ChromeDriver();
        driver.get("https://ui.cogmento.com/tasks/new");
        driver.manage().window().maximize();

        driver.findElement(By.xpath("//input[@name='email']")).sendKeys("yashwanthganesh360@gmail.com");
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Yashwanth@123");
        driver.findElement(By.xpath("//div[text()='Login']")).click();
        Thread.sleep(5000);

        WebElement element=driver.findElement(By.xpath("(//div[@role='listbox'])[3]"));
        element.click();
        WebElement option=driver.findElement(By.xpath("(//div[@role='option' and @class='selected item']/span)[2]"));
        JavascriptExecutor javascriptExecutor=(JavascriptExecutor) driver;
        javascriptExecutor.executeScript("arguments[0].click()",option);
        Thread.sleep(3000);
        driver.findElement(By.xpath("(//div[contains(@class,'input-container')])[1]")).click();
        WebElement date=driver.findElement(By.xpath("//div[contains(@aria-label,'16 February 2025')]"));
        date.click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//ul[@role='listbox']/li[contains(text(),'10:30')]")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("(//input[@aria-autocomplete='list' and @class='search'])[1]")).sendKeys("6309092819");
        Thread.sleep(5000);
        driver.findElement(By.xpath("//div[@role=\"listbox\"]/div[@role='option']")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("(//input[@aria-autocomplete='list' and @class='search'])[2]")).sendKeys("wipro");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//div[@role='option' and @class='selected item']")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("(//input[@aria-autocomplete='list' and @class='search'])[3]")).sendKeys("50");
        Thread.sleep(5000);
        driver.findElement(By.xpath("//div[@role='listbox' and contains(@class,'visible')]/div")).click();
        Thread.sleep(5000);

        driver.quit();
    }
}
