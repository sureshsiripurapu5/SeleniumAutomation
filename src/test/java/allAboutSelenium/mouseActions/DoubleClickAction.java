package allAboutSelenium.mouseActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DoubleClickAction {

    WebDriver driver;

    @Test
    public void verfyingDoubleClick(){
        driver=new EdgeDriver();
        driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick3");
        driver.manage().window().maximize();
        //switching to frame
        WebElement frame=driver.findElement(By.xpath("//iframe[@id='iframeResult']"));
        driver.switchTo().frame(frame);

        WebElement box1=driver.findElement(By.xpath("//input[@id='field1']"));
        WebElement box2=driver.findElement(By.xpath("//input[@id='field2']"));
        WebElement button=driver.findElement(By.xpath("//button[normalize-space()='Copy Text']"));

        box1.clear();
        box1.sendKeys("suresh");

        Actions actions=new Actions(driver);
        //double-click
        actions.doubleClick(button).build().perform();
        //getText() doesnt works beacuse it doesnt have inner texts
        String box2Text=box2.getAttribute("value");
        System.out.println(box2Text);

        Assert.assertEquals(box2Text,"suresh","Both are not equal");


        driver.quit();


    }
}
