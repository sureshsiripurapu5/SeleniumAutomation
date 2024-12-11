package allAboutSelenium.checkBoxesAndAlerts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class AuthenticationAlert {

    WebDriver driver;

    @Test
    public void handlingAutheniticationPopups(){
        driver= new EdgeDriver();
        driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
        driver.quit();
    }
}
