package allAboutSelenium.checkBoxesAndAlerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class AtpConfirmationPopUp {

    WebDriver driver;

    @Test
    public void handlingConfirmationAlertWithOkAndCancelButton(){
        driver=new EdgeDriver();
        driver.get("https://testautomationpractice.blogspot.com/#");
        driver.manage().window().maximize();

        WebElement confirmationAlert=driver.findElement(By.xpath("//button[text()='Confirmation Alert']"));
        confirmationAlert.click();


        Alert alert=driver.switchTo().alert();
        alert.dismiss();

        driver.quit();
    }
}
