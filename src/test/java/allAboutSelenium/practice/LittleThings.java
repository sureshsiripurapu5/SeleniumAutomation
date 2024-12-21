package allAboutSelenium.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class LittleThings {

    WebDriver driver;

    @Test
    public void isEnabled() throws InterruptedException {
        driver = new EdgeDriver();
        driver.manage().window().maximize();
      //  driver.findElement(By.xpath("//button[text()='Accept All']")).click();


        driver.get("https://www.prettylittlething.com/burgundy-croc-textured-curved-cross-body-bag.html");
        Thread.sleep(4000);
        driver.findElement(By.xpath("//button[text()='Accept All']")).click();

        WebElement button= driver.findElement(By.xpath("//button[@id='add-to-bag-button']"));
        System.out.println(button.isEnabled());
        button.click();
    }
}
