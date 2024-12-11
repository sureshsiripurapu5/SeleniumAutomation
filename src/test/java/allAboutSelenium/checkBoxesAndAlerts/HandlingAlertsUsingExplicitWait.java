package allAboutSelenium.checkBoxesAndAlerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class HandlingAlertsUsingExplicitWait {

    WebDriver driver;

    @Test
    public void verifyAlertUsingExplicitWaits() throws InterruptedException {
        driver= new EdgeDriver();

        WebDriverWait myWait=new WebDriverWait(driver, Duration.ofSeconds(5));
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        driver.manage().window().maximize();

        driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();

        Thread.sleep(4000);

       Alert alert= myWait.until(ExpectedConditions.alertIsPresent());
        System.out.println(alert.getText());
        alert.accept();




    }

}
