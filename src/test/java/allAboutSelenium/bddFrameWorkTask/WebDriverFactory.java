package allAboutSelenium.bddFrameWorkTask;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class WebDriverFactory {
    public static WebDriver driver;
    public static void initializeDriver(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    public static void openApp(){
        driver.get("https://www.riverisland.com/women");
    }

    public static void killWebDriver(){
        driver.quit();
    }
}
