package allAboutSelenium.mouseActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class DragAndDropAction {

    WebDriver driver;

    @Test
    public void verfyingDragAndDrop(){
        driver=new EdgeDriver();
        driver.get("http://dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
        driver.manage().window().maximize();

        //drag and drop
        WebElement romeSourceElement=driver.findElement(By.xpath("//div[@id='box6' and text()='Rome']"));
        WebElement italyTargetElement=driver.findElement(By.xpath("//div[@id='box106' and text()='Italy']"));

        WebElement copennghenSourceElement= driver.findElement(By.xpath("//div[@id='box4' and text()='Copenhagen']"));
        WebElement denmarkTargetElement=driver.findElement(By.xpath("//div[@id='box104' and text()='Denmark']"));


        Actions actions=new Actions(driver);

        actions.dragAndDrop(romeSourceElement,italyTargetElement).build().perform();

        actions.dragAndDrop(copennghenSourceElement,denmarkTargetElement).build().perform();

        driver.quit();

    }
}
