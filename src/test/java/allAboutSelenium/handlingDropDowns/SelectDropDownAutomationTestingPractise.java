package allAboutSelenium.handlingDropDowns;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.List;

public class SelectDropDownAutomationTestingPractise {

    WebDriver driver;

    @Test
    public void verifyingDropDowns(){
        driver=new EdgeDriver();
        driver.get("https://testautomationpractice.blogspot.com/");

        WebElement dropDownList=driver.findElement(By.xpath("//select[@id='country']"));

        Select select=new Select(dropDownList);

        //select.selectByVisibleText("Brazil"); //selecting dropdown by text
        //select.selectByValue("india"); //select dropdown by value attribute
        //select.selectByIndex(5); //select by index

        //getting no of options available in dropdown
        List<WebElement>options=select.getOptions();
        System.out.println(options.size());

        //printing values
//        for(int i=0;i<options.size();i++){
//           String texts= options.get(i).getText();
//            System.out.println(texts);
//        }

        //foreach loop
        for(WebElement text:options){
            String totalTextsInDropDwons=text.getText();
            System.out.println(totalTextsInDropDwons);
        }
    }
}
