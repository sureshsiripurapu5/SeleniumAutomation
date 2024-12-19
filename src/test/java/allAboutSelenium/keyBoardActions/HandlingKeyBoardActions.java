package allAboutSelenium.keyBoardActions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import javax.swing.*;
import java.time.Duration;

public class HandlingKeyBoardActions {

    WebDriver driver;

    @Test
    public void verfyingkeyBoardActionKeys(){
        driver= new EdgeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://text-compare.com/");
        driver.manage().window().maximize();

        WebElement textBox1=driver.findElement(By.xpath("//textarea[@id='inputText1']"));
        textBox1.sendKeys("suresh siripurapu");

        Actions actions= new Actions(driver);

        //ctrl+A --selects the text in the textbox
          actions.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();



        //ctrl+c-- copy the text to the clipboard
        actions.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).build().perform();

        //tab-- tab key used to jump to the second textbox
         //actions.keyDown(Keys.TAB).keyUp(Keys.TAB).build().perform();

         WebElement textBox2=driver.findElement(By.xpath("//textarea[@id='inputText2']"));
        //ctrl+v -- paste the clipboard text to textbox
        actions.keyDown(textBox2,Keys.CONTROL).sendKeys("v").keyUp(textBox2,Keys.CONTROL).perform();
        //actions.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build().perform();

    }

}
