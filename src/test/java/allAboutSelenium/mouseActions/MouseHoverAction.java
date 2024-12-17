package allAboutSelenium.mouseActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class MouseHoverAction {

    WebDriver driver;

    @Test
    public void verfyingMouseHover() throws InterruptedException {
        driver=new EdgeDriver();
        driver.get("https://demo.opencart.com/");
        driver.manage().window().maximize();

        WebElement desktops=driver.findElement(By.xpath("//a[text()='Desktops']"));

        WebElement mac=driver.findElement(By.xpath("//a[@class='nav-link' and text()='Mac (1)']"));

        Actions actions=new Actions(driver);

        Thread.sleep(3000);
        //mouse hover
        //actions.moveToElement(desktops).moveToElement(mac).click().build().perform();

        //the other way is we can remove build()
        actions.moveToElement(desktops).moveToElement(mac).click().perform();

        driver.quit();





    }
}
