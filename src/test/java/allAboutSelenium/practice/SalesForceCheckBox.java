package allAboutSelenium.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SalesForceCheckBox {
    WebDriver driver;


    @BeforeClass
    public void initializeBrowser(){
        driver=new EdgeDriver();
    }

    @Test
    public void VerifyCheckDownisSelectedOrNot(){
        driver.get("https://www.salesforce.com/in/form/signup/freetrial-salesforce-starter/?d=jumbo1-btn-ft");
        WebElement mainServiceAgreement=driver.findElement(By.xpath("//input[@id='SubscriptionAgreement']"));
        boolean isCheckBoxSelected= mainServiceAgreement.isSelected();
        System.out.println(isCheckBoxSelected);

        WebElement checkBox =driver.findElement(By.xpath("//input[@id='SubscriptionAgreement']/following-sibling::div[@class='checkbox-ui']"));

        checkBox.click();
        boolean checkBoxAfterClicking = mainServiceAgreement.isSelected();
        System.out.println(checkBoxAfterClicking);


    }
}
