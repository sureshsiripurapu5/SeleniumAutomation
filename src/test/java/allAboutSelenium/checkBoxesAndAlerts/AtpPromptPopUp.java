package allAboutSelenium.checkBoxesAndAlerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class AtpPromptPopUp {

    WebDriver driver;

    @Test
    public void handlingPromptAlertBySendingMessage(){
        driver=new EdgeDriver();
        driver.get("https://testautomationpractice.blogspot.com/#");
        driver.manage().window().maximize();

        WebElement promptAlert= driver.findElement(By.xpath("//button[text()='Prompt Alert']"));
        promptAlert.click();


        Alert alert =driver.switchTo().alert();
        alert.sendKeys("Suresh");
        alert.accept();

        driver.close();
    }
}
