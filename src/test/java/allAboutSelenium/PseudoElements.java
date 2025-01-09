package allAboutSelenium;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class PseudoElements {
    WebDriver driver;
    @Test
    public void pseudoElements(){
        driver=new EdgeDriver();
        driver.get("https://play1.automationcamp.ir/advanced.html");
        driver.manage().window().maximize();

        JavascriptExecutor javascriptExecutor=(JavascriptExecutor) driver;
        String path="window.getComputedStyle(document.querySelector('.star-rating'),'::after').getPropertyValue('content')";
        String text=(String) javascriptExecutor.executeScript("return "+path+"").toString();
        System.out.println(text);
    }
}
