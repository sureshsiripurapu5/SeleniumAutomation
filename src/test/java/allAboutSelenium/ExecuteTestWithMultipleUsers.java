package allAboutSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.time.Duration;

public class ExecuteTestWithMultipleUsers {
    WebDriver driver;

    WebDriverWait wait;

    @BeforeTest
    public void initilization(){
        driver=new EdgeDriver();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
        wait=new WebDriverWait(driver,Duration.ofSeconds(10));
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();

    }

    @AfterTest
    public void tearDownSession(){
        driver.quit();
    }

    @DataProvider(name ="loginUsers")
    public Object[][] sauceDemoUsers(){
        return new Object[][]{
            {"standard_user", "secret_sauce"},
            {"locked_out_user", "secret_sauce"},
            {"problem_user", "secret_sauce"},
            {"performance_glitch_user", "secret_sauce"},
            {"error_user", "secret_sauce"}
        };
    }

    @Test(dataProvider = "loginUsers")
    public void loginWithMultipleUsers(String userName,String password) throws InterruptedException {
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        WebElement userNameField= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='user-name']")));
        //WebElement userNameField=driver.findElement(By.xpath("//input[@id='user-name']"));
        userNameField.clear();
        //Thread.sleep(5000);
        userNameField.sendKeys(userName);

        WebElement passwordField= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='password']")));
        //WebElement passwordField=driver.findElement(By.xpath("//input[@id='password']"));
        passwordField.clear();
       // Thread.sleep(5000);
        passwordField.sendKeys(password);


        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='login-button']"))).click();
       // WebElement loginButton=driver.findElement(By.xpath("//input[@id='login-button']"));


        String title=wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[@data-test='title']"))).getText();
        Assert.assertEquals(title,"Products");

        driver.findElement(By.xpath("//button[@id='react-burger-menu-btn']")).click();

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@id='logout_sidebar_link' and text()='Logout']"))).click();

        //driver.findElement(By.xpath("//a[@id='logout_sidebar_link' and text()='Logout']")).click();




    }
}
