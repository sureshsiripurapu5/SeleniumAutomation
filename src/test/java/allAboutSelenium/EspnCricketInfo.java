package allAboutSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class EspnCricketInfo {
    WebDriver driver;
    @Test
    public void cricketMatches(){
        driver=new EdgeDriver();
        driver.get("https://www.espncricinfo.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));



        List<WebElement> matches =driver.findElements(By.xpath("//preceding::span[text()='RESULT']/following::div[@class='ds-flex ds-items-center ds-min-w-0 ds-mr-1']/p"));
        List<String> text=new ArrayList<>();

        for(int i=0;i<matches.size();i++){
            text.add(matches.get(i).getText());
        }
        System.out.println(text);




    }
}
