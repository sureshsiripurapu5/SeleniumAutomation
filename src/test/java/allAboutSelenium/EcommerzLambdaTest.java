package allAboutSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class EcommerzLambdaTest {

    WebDriver driver;
    @Test
    public void selectingTheItemAndAddingToCart()  {
        driver=new EdgeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://ecommerce-playground.lambdatest.io/index.php?route=account/login");
        driver.manage().window().maximize();


        WebElement megaMenu =driver.findElement(By.xpath("//span[normalize-space()='Mega Menu']"));
        WebElement apple= driver.findElement(By.xpath("//h3[text()='Mobiles']/parent::div/descendant::li/a[@title='Apple']"));

        Actions actions=new Actions(driver);

        actions.moveToElement(megaMenu).moveToElement(apple).click().perform();
        //h4[@class='title']/a[text()='iPod Touch']

        String ipodText=driver.findElement(By.xpath("//h4[@class='title']/a[1]")).getText();
        System.out.println(ipodText);
        String ipodPrice=driver.findElement(By.xpath("//div[@class='price']/span[text()='$194.00']")).getText();
        System.out.println(ipodPrice);



        WebElement ipodElement=driver.findElement(By.xpath("//button[@title='Add to Cart' and @onclick=\"cart.add('32');\"]"));
        JavascriptExecutor jse=(JavascriptExecutor) driver;
        jse.executeScript("arguments[0].click()",ipodElement);
        //opening cart
        driver.findElement(By.xpath("//div[@class='cart-icon']/descendant::*[name()='svg']")).click();

        String cartItemName=driver.findElement(By.xpath("//table[@class='table']/descendant::td/a[text()='iPod Touch']")).getText();
        System.out.println(cartItemName);

        String cartItemPrice=driver.findElement(By.xpath("//table[@class='table']/tbody/tr/td[4]")).getText();
        System.out.println(cartItemPrice);

        Assert.assertEquals(ipodText,cartItemName);
        Assert.assertEquals(ipodPrice,cartItemPrice);



        driver.quit();





    }
}
