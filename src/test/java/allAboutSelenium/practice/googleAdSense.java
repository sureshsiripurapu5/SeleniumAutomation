package allAboutSelenium.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class googleAdSense {
    WebDriver driver;

    @Test(invocationCount = 40)
    public void verifyNetlify() throws InterruptedException {
        driver=new ChromeDriver();
        driver.get("https://magical-belekoy-d46632.netlify.app/");
        driver.manage().window().maximize();
        Thread.sleep(3000);
        JavascriptExecutor javascriptExecutor=(JavascriptExecutor)driver;
        WebElement quantum=driver.findElement(By.xpath("//h2[contains(text(),'Quantum Computing')]"));
        javascriptExecutor.executeScript("arguments[0].scrollIntoView(true)",quantum);
        Thread.sleep(3000);
        WebElement colonization =driver.findElement(By.xpath("//h2[contains(text(),'Colonization')]"));
        javascriptExecutor.executeScript("arguments[0].scrollIntoView(true)",colonization);
        Thread.sleep(3000);

        driver.quit();
    }
}
