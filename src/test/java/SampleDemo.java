import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class SampleDemo {

    @Test
    public void launchApplication() throws InterruptedException {
        WebDriver driver = new EdgeDriver();
        driver.get("https://www.saucedemo.com/v1/");
        driver.manage().window().maximize();

        Thread.sleep(3000);
        driver.findElement(By.cssSelector("input#user-name")).sendKeys("standard_user");
        Thread.sleep(2000);
        driver.findElement(By.id("password")).sendKeys("secret_sauce");

        driver.findElement(By.cssSelector("input#login-button")).click();

        driver.quit();

    }

}
