package allAboutSelenium.mouseActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ActionsVsAction {

    WebDriver driver;

    @Test
    public void differenceBetweenActionsAndAction(){
        driver=new EdgeDriver();
        driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
        driver.manage().window().maximize();

        WebElement button= driver.findElement(By.xpath("//span[contains(@class,'context-menu') and text()='right click me']"));

        Actions actions=new Actions(driver);

        Action myAction=actions.contextClick(button).build(); //building/creating action and storing in Action(interface) reference
        myAction.perform(); //completing /performing action
    }
}
