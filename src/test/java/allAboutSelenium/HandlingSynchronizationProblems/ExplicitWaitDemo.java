package allAboutSelenium.HandlingSynchronizationProblems;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import java.time.Duration;

public class ExplicitWaitDemo {

    WebDriver driver;

    @Test
    public void explicitWaitDemoExample(){
        driver= new EdgeDriver();

        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(5)); //declaration

        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().maximize();


        //the web page is taking more time to load, so thats why we are having the exceptoion:NoSuchElementException
        //to solve this type od issue we have to give the wait for that webelement

       WebElement username=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='username']")));
       username.sendKeys("Admin");
        //driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");

       WebElement password= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@type='password']")));
       password.sendKeys("admin123");

      WebElement button= wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@type='submit']")));
      button.click();

      driver.quit();

    }
}
