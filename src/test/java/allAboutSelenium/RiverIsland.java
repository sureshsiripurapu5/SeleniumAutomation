package allAboutSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import java.time.Duration;

public class RiverIsland {
    WebDriver driver;

    @Test
    public void test1(){
        driver=new EdgeDriver();
        driver.get("https://www.riverisland.com/");
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5));
        String a=driver.getPageSource();
        System.out.println(a);
    }
}
