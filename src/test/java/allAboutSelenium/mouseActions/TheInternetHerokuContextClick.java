package allAboutSelenium.mouseActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class TheInternetHerokuContextClick {
    WebDriver driver;
    @Test
    public void handlingRightclickFunctionality(){
        driver=new EdgeDriver();
        driver.get("https://the-internet.herokuapp.com/context_menu");
        driver.manage().window().maximize();

        WebElement rightClickBox=driver.findElement(By.xpath("//div[@oncontextmenu='displayMessage()']"));

        Actions actions=new Actions(driver);

        actions.contextClick(rightClickBox).build().perform();

        driver.switchTo().alert().accept();
    }
}
