package allAboutSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import java.time.Duration;

public class HandlingSvgElements {
    WebDriver driver;

    @Test
    public void verifyingsvgelements(){
        driver=new EdgeDriver();
        driver.get("https://www.west-wind.com/wconnect/wcscripts/fileupload.wwd");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        //div[text()='My Device']/preceding-sibling::*[name()='svg']
        driver.findElement(By.xpath("//button[@id='UppyImageUploader']")).click();
        driver.findElement(By.xpath("//div[text()='My Device']/preceding-sibling::*[name()='svg']")).click();



    }

}
