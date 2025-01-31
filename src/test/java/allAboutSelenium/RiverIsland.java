package allAboutSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import java.time.Duration;

public class RiverIsland {
    WebDriver driver;

    @Test
    public void test1(){
        driver=new EdgeDriver();
        driver.get("https://www.saucedemo.com/");

        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        WebElement pass =driver.findElement(By.id("password"));
        pass.sendKeys("secret_sauce");
        pass.submit();

    }
}
