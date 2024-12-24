package allAboutSelenium.mouseActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class Example {

    WebDriver driver;

    @Test
    public void verifyDynamicDropDownIsHandled() throws InterruptedException {
        driver=new EdgeDriver();
        driver.get("https://thesoftwarepractice.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        WebElement parentElement = driver.findElement(By.xpath("(//li/a[text()='Industries'])[2]"));

        //WebElement childElement = driver.findElement(By.xpath("(//a[text()='Transportation'])[2]"));

        Actions action = new Actions(driver);
        action.moveToElement(parentElement);
        action.perform();
        action.click(driver.findElement(By.xpath("(//a[text()='Transportation'])[2]")));
        action.perform();
        action.release();

        wait.until(ExpectedConditions.textToBe(By.cssSelector(".title"), "TRANSPORTATION"));

        Assert.assertEquals(driver.getTitle(), "TSP : Industries - Transportation");

    }
}
