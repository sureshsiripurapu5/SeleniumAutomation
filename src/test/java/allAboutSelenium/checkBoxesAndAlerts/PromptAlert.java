package allAboutSelenium.checkBoxesAndAlerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PromptAlert {

    WebDriver driver;

    @Test
    public void handlingPromptAlert() throws InterruptedException {
        driver = new EdgeDriver();
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        driver.manage().window().maximize();

        //prompt alert with sending text to the alert
        driver.findElement(By.xpath("//button[normalize-space()='Click for JS Prompt']")).click();

        Thread.sleep(3000);

        Alert promptAlert=driver.switchTo().alert();
        promptAlert.sendKeys("Selenium");
        promptAlert.accept();

       String alertTextMsg= driver.findElement(By.xpath("//h4[text()='Result:']/following-sibling::p[@id='result']")).getText();
        System.out.println(alertTextMsg);

        Assert.assertEquals(alertTextMsg,"You entered: Selenium");

        driver.quit();
    }
}
