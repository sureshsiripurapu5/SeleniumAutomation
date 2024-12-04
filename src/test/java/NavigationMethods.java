import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class NavigationMethods {
    WebDriver driver;

    @BeforeSuite
    public void initializeBrowser(){
        driver=new EdgeDriver();
    }

    @Test
    public void navigationMethods(){
        driver.get("https://www.saucedemo.com/");
       String title = driver.getTitle();
        System.out.println("The title is:"+title);

        Assert.assertEquals(title,"Swag Labs" ,"both titles are not same");

        String url=driver.getCurrentUrl();
        System.out.println("Url:"+url);
        Assert.assertEquals(url,"https://www.saucedemo.com/","both urls are not same");


        driver.navigate().to("https://www.flipkart.com/");
        String flipkartTitle=driver.getTitle();
        System.out.println("Flipakrt title:"+flipkartTitle);
        Assert.assertEquals(flipkartTitle,"Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!");

        driver.navigate().back();
        Assert.assertEquals(url,"https://www.saucedemo.com/","both urls are not same");

        driver.navigate().forward();
        Assert.assertEquals(flipkartTitle,"Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!");

        driver.navigate().refresh();
        Assert.assertEquals(flipkartTitle,"Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!");







    }
    @AfterSuite
    public void terminate(){
        driver.quit();
    }
}
