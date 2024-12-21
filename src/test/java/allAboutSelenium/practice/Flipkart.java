package allAboutSelenium.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Flipkart {
    WebDriver driver;

    @BeforeSuite
    public void initializeBrowser(){
        driver=new EdgeDriver();
    }

    @Test
    public void dropDown(){
        driver.get("https://www.flipkart.com/mobile-phones-store?fm=neo%2Fmerchandising&iid=M_d783804c-613c-4f1b-97ae-f117d5ce6bbc_1_372UD5BXDFYS_MC.ZRQ4DKH28K8J&otracker=hp_rich_navigation_2_1.navigationCard.RICH_NAVIGATION_Mobiles_ZRQ4DKH28K8J&otracker1=hp_rich_navigation_PINNED_neo%2Fmerchandising_NA_NAV_EXPANDABLE_navigationCard_cc_2_L0_view-all&cid=ZRQ4DKH28K8J");
        //div[@title='4 GB']
        WebElement dropdown4g= driver.findElement(By.xpath(" (//input[@type='checkbox' and @class='vn9L2C'])[10]"));

        boolean before =dropdown4g.isSelected();
        System.out.println(before);

        WebElement dropdown= driver.findElement(By.xpath("//div[@title='4 GB']/descendant::label/child::input/following-sibling::div[@class='XqNaEv']"));


        dropdown.click();

        boolean after =dropdown4g.isSelected();
        System.out.println(after);
    }
}
