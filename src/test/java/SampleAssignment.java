import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class SampleAssignment {

    WebDriver driver;

    @Test
    public void assignment(){
        driver=new EdgeDriver();
        driver.get("https://testautomationpractice.blogspot.com/");

     WebElement searchBox=   driver.findElement(By.xpath("//input[@class='wikipedia-search-input']"));
     searchBox.sendKeys("selenium");


     driver.findElement(By.xpath("//input[@type='submit']")).click();

     List<WebElement> elements=driver.findElements(By.xpath("//div[@class='wikipedia-search-results']/child::div"));
     System.out.println(elements.size());
    }
}
