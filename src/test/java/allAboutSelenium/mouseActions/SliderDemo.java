package allAboutSelenium.mouseActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class SliderDemo {

    WebDriver driver;
    @Test
    public void verfyingSlider() throws InterruptedException {
        driver=new ChromeDriver();
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.get("https://the-internet.herokuapp.com/horizontal_slider");
        driver.manage().window().maximize();

        //horizontal slider
        WebElement minSlider=driver.findElement(By.xpath("//input[@type='range' and @onchange='showValue(this.value)']"));

        System.out.println("Default location of minSlider::"+minSlider.getLocation());//(59,251)=(x,y)

        Actions actions=new Actions(driver);
        actions.dragAndDropBy(minSlider,157,160).build().perform();

        System.out.println("location of minSlider after sliding::"+minSlider.getLocation());

        //maximumSlider
//        WebElement maxSlider=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//span[@class='ui-slider-handle ui-corner-all ui-state-default'])[2]")));
//        //WebElement maxSlider=driver.findElement(By.xpath("//span[@class='ui-slider-handle ui-corner-all ui-state-default'][2]"));
//        System.out.println("Default location of maximum slider:;"+maxSlider.getLocation());



    }
}
