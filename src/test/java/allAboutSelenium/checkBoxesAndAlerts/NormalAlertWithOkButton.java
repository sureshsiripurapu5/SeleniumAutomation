package allAboutSelenium.checkBoxesAndAlerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NormalAlertWithOkButton {

    WebDriver driver;

    @Test
    public void verifyAlerts() throws InterruptedException {
        driver=new EdgeDriver();
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        driver.manage().window().maximize();

        //1) Handling normal alert with ok button
        driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
        //switching driver window to alert window
        Thread.sleep(4000);
        //driver.switchTo().alert().accept();
        Alert myAlert=driver.switchTo().alert();
        String alertMessage=myAlert.getText();

        //Assertion
        Assert.assertEquals(alertMessage,"I am a JS Alert");
        myAlert.accept(); //which will accept the alert(ok)
    }
}
