package allAboutSelenium.javaScriptExecutorInterface;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import java.time.Duration;

public class SalesForceSendKeys {

    WebDriver driver;
    @Test
    public void sendingTextUsingJavaScriptExecutor(){
        driver=new ChromeDriver();
        driver.get("https://www.salesforce.com/in/form/signup/freetrial-salesforce-starter/?d=jumbo1-btn-ft");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();

        WebElement firstName=driver.findElement(By.xpath("//input[@name='UserFirstName']"));
        firstName.clear();

        JavascriptExecutor js=(JavascriptExecutor) driver;
        String args="arguments[0].setAttribute('value','suresh')";
        js.executeScript(args,firstName);
    }
}
