package allAboutSelenium.checkBoxesAndAlerts;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;
import java.util.Set;

public class AtpNormalPopUP {


    WebDriver driver;

    @Test
    public void handlingNormalAlertWithOkButton() throws InterruptedException {
       driver=new EdgeDriver();
       driver.get("https://testautomationpractice.blogspot.com/#");
       driver.manage().window().maximize();

       WebElement simpleAlert=driver.findElement(By.xpath("//button[text()='Simple Alert']"));
       simpleAlert.click();

       Alert alert=driver.switchTo().alert();
       Thread.sleep(4000);
       String alertMsg=alert.getText();
        System.out.println("alertMessage::"+alertMsg);
       alert.accept();

        Assert.assertEquals(alertMsg,"I am an alert box!");


        driver.quit();

    }
}
