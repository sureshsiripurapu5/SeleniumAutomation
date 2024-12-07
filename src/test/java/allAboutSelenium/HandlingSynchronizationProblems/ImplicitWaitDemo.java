package allAboutSelenium.HandlingSynchronizationProblems;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import java.time.Duration;

public class ImplicitWaitDemo {

    WebDriver driver;

    @Test
    public void implicitWaitCommand() throws InterruptedException {
        driver = new EdgeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5)); //implicit wait
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().maximize();


        //the web page is taking more time to load, so thats why we are having the exceptoion:NoSuchElementException
        //to solve this type od issue we have to give the wait for that webelement
        driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");

        driver.quit();
    }
}
