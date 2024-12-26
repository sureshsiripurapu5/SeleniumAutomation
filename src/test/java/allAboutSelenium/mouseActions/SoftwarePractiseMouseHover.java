package allAboutSelenium.mouseActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.time.Duration;

public class SoftwarePractiseMouseHover {

    WebDriver driver;

    @Test
    public void handlingMouseHower(){
        driver=new EdgeDriver();
        driver.get("https://thesoftwarepractice.com/");
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
        driver.manage().window().maximize();

        WebElement industries=driver.findElement(By.xpath("(//li/a[text()='Industries'])[2]"));

        WebElement transport=driver.findElement(By.xpath("(//li/a[text()='Transportation'])[2]"));

        Actions actions=new Actions(driver);

        actions.moveToElement(industries).perform();
        actions.moveToElement(transport).click().perform();
    }
}
