import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;
import java.util.Set;

public class SampleAssignment {

    WebDriver driver;

    @Test
    public void assignment() throws InterruptedException {
        driver=new EdgeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://testautomationpractice.blogspot.com/");

     WebElement searchBox=   driver.findElement(By.xpath("//input[@class='wikipedia-search-input']"));
     searchBox.sendKeys("selenium");


     driver.findElement(By.xpath("//input[@type='submit']")).click();
     //Thread.sleep(4000);

     List<WebElement> elements=driver.findElements(By.cssSelector("#wikipedia-search-result-link >a"));
        System.out.println(elements.size());


     for(WebElement webElement:elements) {
         webElement.click();
     }
         Set<String> windowHandles =driver.getWindowHandles();
         //System.out.println(windowHandles);
         for (String winId:windowHandles){
           String title=  driver.switchTo().window(winId).getTitle();
           if(title.equals("Selenium in biology - Wikipedia")|| title.equals("Selenium disulfide - Wikipedia")){
               driver.close();
           }
         }






    }
}
