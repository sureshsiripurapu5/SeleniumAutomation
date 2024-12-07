package allAboutSelenium.NavigationalMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class NavigationMethodsDemo {

    WebDriver driver;

    @Test
    public void navigationMethods() throws MalformedURLException {
        driver=new EdgeDriver();

        URL url=new URL("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.navigate().to(url); // navigate().to() accepts the url in string format and URL object format

        driver.navigate().to("https://www.flipkart.com/");

        driver.navigate().back();
        System.out.println("The url of orange hrm::"+driver.getCurrentUrl());

        driver.navigate().forward();
        System.out.println("The url of flipkart::"+driver.getCurrentUrl());

        driver.navigate().refresh();


    }
}
