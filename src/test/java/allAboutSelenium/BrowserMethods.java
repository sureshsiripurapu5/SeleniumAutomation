package allAboutSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class BrowserMethods {


    WebDriver driver;

    @Test
    public void browserMethods() throws InterruptedException {
        driver=new EdgeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        Thread.sleep(5000);
        driver.findElement(By.xpath("//a[text()='OrangeHRM, Inc']")).click();

        Thread.sleep(5000);

        //driver.close();  //single browser window gets closed ,second browser gets retained

        driver.quit(); //it closes all the browser windows

    }
}
