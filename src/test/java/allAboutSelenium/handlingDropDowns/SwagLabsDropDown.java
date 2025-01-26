package allAboutSelenium.handlingDropDowns;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class SwagLabsDropDown {
    WebDriver driver;

    @Test
    public void dropDown(){
        driver=new EdgeDriver();
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();

        driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
        driver.findElement(By.xpath("//input[@id='login-button']")).click();

        WebElement dropDown=driver.findElement(By.xpath("//select[@class='product_sort_container']"));

        Select select=new Select(dropDown);
        select.selectByValue("hilo");
    }
}
