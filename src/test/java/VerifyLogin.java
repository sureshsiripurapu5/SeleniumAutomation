import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class VerifyLogin {

    WebDriver driver;


    @BeforeMethod
    public void launchDriver(){
        driver=new ChromeDriver();

    }

    @Test
    public void VerifyLoginMsg() throws InterruptedException {
        driver.get("https://www.saucedemo.com/v1/");

        driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("suresh");
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("input[placeholder='Password']")).sendKeys("suresh@123");
        Thread.sleep(1000);

        driver.findElement(By.cssSelector("#login-button")).click();

      String errorMsg=  driver.findElement(By.xpath("//h3")).getText();
        System.out.println(errorMsg);

        Assert.assertEquals(errorMsg,"Epic sadface: Username and password do not match any user in this service");



    }
    @AfterClass
    public void termoinate(){
        driver.quit();
    }
}
