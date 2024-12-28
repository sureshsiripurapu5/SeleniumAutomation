package allAboutSelenium.mouseActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class TheInternetHerokuDragAndDrop {
    WebDriver driver;

    @Test
    public void dragAndDropFunctionality(){
        driver= new EdgeDriver();
        driver.get("https://the-internet.herokuapp.com/drag_and_drop");
        driver.manage().window().maximize();

        WebElement columnA=driver.findElement(By.xpath("//div[@id='column-a']"));
        WebElement columnB=driver.findElement(By.xpath("//div[@id='column-b']"));

        Actions actions=new Actions(driver);
        //Action action=actions.dragAndDrop(columnA,columnB).build();
        //action.perform();
        actions.dragAndDrop(columnA,columnB).build().perform();




    }
}
