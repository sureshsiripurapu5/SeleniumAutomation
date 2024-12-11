package allAboutSelenium.handlingDropDowns;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class DropDownsList {

    WebDriver driver;

    @Test
    public void verifyDropDownList(){
        driver= new EdgeDriver();
        driver.get("https://www.salesforce.com/in/form/signup/freetrial-salesforce-starter/?d=jumbo1-btn-ft");

        WebElement jobTitleDropDown=driver.findElement(By.xpath("//select[@name='UserTitle']"));

        Select dropDown=new Select(jobTitleDropDown);

        dropDown.selectByValue("Operations_Manager_AP"); //by value
        dropDown.selectByIndex(3); //by index
        dropDown.selectByVisibleText("Developer / Software Engineer"); //by text

        String selectedOption=dropDown.getFirstSelectedOption().getText();

        Assert.assertEquals(selectedOption,"Developer / Software Engineer");

        List<WebElement> listOfOptions=dropDown.getOptions();

        List<String> optionsText= new ArrayList<>();

        for (WebElement options:listOfOptions){
            optionsText.add(options.getText());
        }

        System.out.println(optionsText);






    }
}
