package allAboutSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import java.time.Duration;

public class ShadowDomElement {
    WebDriver driver;
    @Test
    public void accesingShadowDomElement(){
        driver=new EdgeDriver();
        driver.get("https://www.salesforce.com/in/?ir=1");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        WebElement mainRootElement=driver.findElement(By.cssSelector("hgf-c360nav[origin*='sfdcdigital']"));
        SearchContext mainshadowElement=mainRootElement.getShadowRoot();

        mainshadowElement.findElement(By.cssSelector("[data-tracking-type='cta-utility']")).click();
    }



    @Test
    public void verifyingSadowDom(){
        driver=new EdgeDriver();
        driver.get("https://books-pwakit.appspot.com/");

        SearchContext shadowRoot=driver.findElement(By.cssSelector("[apptitle='BOOKS']")).getShadowRoot();
        shadowRoot.findElement(By.cssSelector("[aria-label='Search Books']")).sendKeys("welcome");
    }

    @Test
    public void automationTestingPractiseShadowDom(){
        driver=new EdgeDriver();
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();

        SearchContext shadowDom=driver.findElement(By.cssSelector("[id='shadow_host']")).getShadowRoot();
        System.out.println(shadowDom);
        shadowDom.findElement(By.cssSelector("[type='text']")).sendKeys("selenium");
    }

}
