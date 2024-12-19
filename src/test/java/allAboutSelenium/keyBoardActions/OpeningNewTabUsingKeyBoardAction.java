package allAboutSelenium.keyBoardActions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class OpeningNewTabUsingKeyBoardAction {

    WebDriver driver;

    @Test
    public void verfyingNewTab(){
        driver=new EdgeDriver();
        driver.get("https://www.orangehrm.com/");
        driver.manage().window().maximize();

        WebElement pricingTab=driver.findElement(By.xpath("//a[@class='nav-link-hed' and text()='Pricing']"));

        Actions actions=new Actions(driver);

        actions.keyDown(Keys.CONTROL).click(pricingTab).keyUp(Keys.CONTROL).build().perform();

        List<String> ids= new ArrayList<>(driver.getWindowHandles());

        driver.switchTo().window(ids.get(1));

        driver.findElement(By.xpath("//input[@placeholder='Your Full Name*']")).sendKeys("suresh siripurapu");
        //driver.close();

        driver.switchTo().window(ids.get(0));

        driver.findElement(By.xpath("//input[@name='EmailHomePage']")).sendKeys("suresh");
        //driver.close();

        driver.quit();




    }
}
