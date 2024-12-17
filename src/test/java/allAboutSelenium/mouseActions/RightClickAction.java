package allAboutSelenium.mouseActions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class RightClickAction {

    WebDriver driver;

    @Test
    public void verfyingRightClick(){
        driver=new EdgeDriver();
        driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
        driver.manage().window().maximize();

        WebElement button= driver.findElement(By.xpath("//span[contains(@class,'context-menu') and text()='right click me']"));

        Actions actions=new Actions(driver);

        //right click-- contextClick()
        actions.contextClick(button).build().perform();

        WebElement copy=driver.findElement(By.xpath("//span[text()='Copy']"));
        copy.click();

        Alert alert=driver.switchTo().alert();
        alert.accept();

        driver.quit();
    }
}
