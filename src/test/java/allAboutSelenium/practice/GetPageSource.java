package allAboutSelenium.practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class GetPageSource {

    WebDriver driver;
    @Test
    public void gettingPageSource(){
        driver=new ChromeDriver();
        driver.get("https://www.tutorialspoint.com/selenium/practice/webtables.php");
        String source=driver.getPageSource();
        System.out.println(source);
    }
}
