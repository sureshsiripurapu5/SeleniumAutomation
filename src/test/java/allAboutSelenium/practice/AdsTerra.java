package allAboutSelenium.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AdsTerra {

    WebDriver driver;

    @Test(invocationCount = 20)
    public void test() throws InterruptedException {
        driver=new ChromeDriver();
        driver.get("https://blogsbysuresh.netlify.app/");
        driver.manage().window().maximize();

        driver.findElement(By.xpath("//a[text()='About']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//a[text()='Contact']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//a[text()='Terms']")).click();
        Thread.sleep(3000);
        driver.quit();

    }
}
