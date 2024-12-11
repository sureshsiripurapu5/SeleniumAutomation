package allAboutSelenium.checkBoxesAndAlerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class ConfirmationAlertWithOkAndCancelButton {

    WebDriver driver;

    @Test
    public void handleAlerts() throws MalformedURLException, InterruptedException {
        driver= new EdgeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        URL url=new URL("https://the-internet.herokuapp.com/javascript_alerts");
        driver.navigate().to(url);
        driver.manage().window().maximize();

        //Confirmation alert with ok & cancel button
        driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();

        Alert myAlert=driver.switchTo().alert();
        myAlert.dismiss();

        driver.quit();



    }
}
