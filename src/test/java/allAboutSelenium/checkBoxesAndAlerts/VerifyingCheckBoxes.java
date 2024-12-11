package allAboutSelenium.checkBoxesAndAlerts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class VerifyingCheckBoxes {

    WebDriver driver;

    @Test
    public void handlingCheckBoxes() throws InterruptedException {
        driver=new EdgeDriver();
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();

        //1) find the specific checkbox and perform click() operation
       // driver.findElement(By.xpath("//input[@id='sunday']")).click();

        //2) find multiple checkboxes and perform click operation
        List<WebElement> checkBoxes =driver.findElements(By.xpath("//input[@class='form-check-input' and @type='checkbox']"));
        /*
        for(int i=0;i<checkBoxes.size();i++){
            checkBoxes.get(i).click();
        }
        */

        /*
         for (WebElement checkboxes:checkBoxes){
             checkboxes.click();
         }

         */

        //3) select last 3 checkboxes
        //no of elements-no of elemnts to be checked=starting index 7-3=4
        /*
        for (int i=4;i<checkBoxes.size();i++){
           checkBoxes.get(i).click();
        }

         */

        //4) select first 3 checkboxes
        /*
        for(int i=0;i<3;i++){
            checkBoxes.get(i).click();
        }

         */

        //5) unselect checkboxes if they are selected
        for(int i=0;i<3;i++){
            checkBoxes.get(i).click();
        }

        Thread.sleep(5000);

        for(int i=0;i<checkBoxes.size();i++){
            if(checkBoxes.get(i).isSelected()){
                checkBoxes.get(i).click();
            }
        }

    }
}
