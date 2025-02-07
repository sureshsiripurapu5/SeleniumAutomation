package allAboutSelenium.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class HandlingWebTables {
    WebDriver driver;
    @BeforeClass
    public void initializeBrowser(){
        driver=new EdgeDriver();
    }
    @Test
    public void fetchingTextBasedOnTheName(){

        driver.get("https://www.tutorialspoint.com/selenium/practice/webtables.php");
        driver.manage().window().maximize();

        String firstName="Cierra";
        List<WebElement> data=driver.findElements(By.xpath("//td[@scope='row' and contains(text(),'"+firstName+"')]/parent::tr/td[not(a)]"));
        List<String> tableData=new ArrayList<>();

        for (int i=0;i<data.size();i++){
            tableData.add(data.get(i).getText().trim());
        }
        System.out.println(tableData);
    }

    @Test
    public void fetchingSpecificColumnDataAndSortingInAscendingOrder(){
        driver.get("https://www.tutorialspoint.com/selenium/practice/webtables.php");
        driver.manage().window().maximize();

        List<WebElement> firstNamesColum=driver.findElements(By.xpath("//th[text()='First Name']/../../..//tbody/tr/td[1]"));
        List<String> firstNamesData=new ArrayList<>();
        for (int i=0;i<firstNamesColum.size();i++){
            firstNamesData.add(firstNamesColum.get(i).getText().trim());
        }
        //1.sorting the data using Collections.sort()
        Collections.sort(firstNamesData);
        System.out.println(firstNamesData);
        //2.sorting the data and removing the duplicates using stream pipeline
        firstNamesData.stream()
                .sorted()
                .distinct()
                .forEach(System.out::println);
    }

}
