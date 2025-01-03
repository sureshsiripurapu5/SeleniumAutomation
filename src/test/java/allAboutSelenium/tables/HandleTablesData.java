package allAboutSelenium.tables;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HandleTablesData {
    WebDriver driver;

    @Test
    public void verifyDataInTheTable(){
        driver=new EdgeDriver();
        driver.get("https://the-internet.herokuapp.com/tables");
        driver.manage().window().maximize();

        String columnHeading="Due";

       List<WebElement> headerRowData=driver.findElements(By.xpath("//table[@id='table1']/descendant::tr/th"));
       List<String> rowData=new ArrayList<>();

       for (int i=0;i<headerRowData.size();i++){
           rowData.add(headerRowData.get(i).getText());
       }

        System.out.println("header row data::"+rowData);

       int index=rowData.indexOf(columnHeading)+1;
        System.out.println("index::"+index);

        WebElement data=driver.findElement(By.xpath("//span[text()='"+columnHeading+"']/ancestor::table[@id='table1']//tbody/tr[1]/td["+index+"]"));
        System.out.println("data::"+data.getText());

        List<WebElement> firstRow=driver.findElements(By.xpath("//table[@id='table1']//tbody/tr[1]/td[not(a)]"));
        List<String> firstRowData=new ArrayList<>();
        List<String> expectedData= Arrays.asList("Smith","John","jsmith@gmail.com","$50.00","http://www.jsmith.com");

        for(int i=0;i<firstRow.size();i++){
            firstRowData.add(firstRow.get(i).getText().trim());
        }

        System.out.println("firstRowData::"+firstRowData);
        Assert.assertEquals(firstRowData,expectedData);




    }
}
