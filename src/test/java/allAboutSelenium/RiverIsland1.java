package allAboutSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class RiverIsland1 {
    WebDriver driver;

    @Test
    public void verifyHomepage() throws InterruptedException {
        driver=new EdgeDriver();
        driver.get("https://www.riverisland.com/women");
        driver.manage().window().maximize();

        driver.findElement(By.xpath("//button[text()='Accept all and continue']")).click();

        WebElement menCategory =driver.findElement(By.xpath("//a[@data-menu-hierarchy='Men']/span"));
        WebElement allMenCategory=driver.findElement(By.xpath("(//a[normalize-space()='All Menswear'])[1]"));

        Actions actions=new Actions(driver);
        actions.moveToElement(menCategory).moveToElement(allMenCategory).build();

        WebElement product=driver.findElement(By.xpath("//h5[@data-qa='product-title' and contains(text(),'Black Faux Leather Bomber Jacket')]"));
        product.click();

        WebElement size=driver.findElement(By.xpath("//div[@role='button' and text()='S']"));
        size.click();

        WebElement addToBag=driver.findElement(By.xpath("//span[text()='Add to bag']"));
        addToBag.click();






    }
}
