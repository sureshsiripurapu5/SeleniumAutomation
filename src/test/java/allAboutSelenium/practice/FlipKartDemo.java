package allAboutSelenium.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class FlipKartDemo {


    WebDriver driver;

    @BeforeSuite
    public void initializeBrowser(){
        driver=new EdgeDriver();
    }

    @Test
    public void checkBoxValidation(){
        driver.get("https://www.flipkart.com/mobile-phones-store?fm=neo%2Fmerchandising&iid=M_16f5d35c-1f11-43e8-9020-06883d302838_1_372UD5BXDFYS_MC.ZRQ4DKH28K8J&otracker=hp_rich_navigation_2_1.navigationCard.RICH_NAVIGATION_Mobiles_ZRQ4DKH28K8J&otracker1=hp_rich_navigation_PINNED_neo%2Fmerchandising_NA_NAV_EXPANDABLE_navigationCard_cc_2_L0_view-all&cid=ZRQ4DKH28K8J");

        WebElement twoGdropDown = driver.findElement(By.xpath("(//input[@type='checkbox'])[12]"));
        boolean isBeforeSelected=twoGdropDown.isSelected();
        System.out.println(isBeforeSelected);

        WebElement clickCheckDOwm=driver.findElement(By.xpath("(//input[@type='checkbox'])[12]/following-sibling::div[@class='XqNaEv']"));
        clickCheckDOwm.click();

        boolean isAfterSelected=twoGdropDown.isSelected();
        System.out.println(isAfterSelected);
    }
}
