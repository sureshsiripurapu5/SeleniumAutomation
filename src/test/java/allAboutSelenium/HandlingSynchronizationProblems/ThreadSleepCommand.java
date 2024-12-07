package allAboutSelenium.HandlingSynchronizationProblems;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class ThreadSleepCommand {

    WebDriver driver;

    @Test
    public void sleepCommand() throws InterruptedException {
        driver= new EdgeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().maximize();

        Thread.sleep(4000);

        //the web page is taking more time to load, so thats why we are having the exceptoion:NoSuchElementException
        //to solve this type od issue we have to give the wait for that webelement
        driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");

        driver.quit();
    }
}
