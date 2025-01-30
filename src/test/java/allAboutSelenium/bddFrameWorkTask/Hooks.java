package allAboutSelenium.bddFrameWorkTask;

import io.cucumber.java.AfterAll;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import org.openqa.selenium.WebDriver;

import static allAboutSelenium.bddFrameWorkTask.WebDriverFactory.*;

public class Hooks {
    public static WebDriver driver;
    @BeforeAll
    public static void initializingReportDrivers(){
        initializeDriver();
    }
    @Before
    public static void launchApplication(){
        openApp();
    }

    @AfterAll
    public static void killSession(){
        killWebDriver();
    }
}
