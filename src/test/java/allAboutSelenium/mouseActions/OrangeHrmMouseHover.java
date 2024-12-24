package allAboutSelenium.mouseActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.time.Duration;

public class OrangeHrmMouseHover {

    WebDriver driver;

    @Test
    public void veryingMouseHover(){
        driver=new EdgeDriver();
        driver.get("https://www.orangehrm.com/");
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
        driver.manage().window().maximize();

        WebElement resources=driver.findElement(By.xpath("//a[text()='Resources']"));

        WebElement ebooks=driver.findElement(By.xpath("(//a[text()='eBooks'])[1]"));

        Actions actions=new Actions(driver);

        actions.moveToElement(resources).moveToElement(ebooks).click().build().perform();
    }

}
