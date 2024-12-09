package allAboutSelenium.handleBrowserWindows;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class HandlingBrowserWindowsDemo {

    WebDriver driver;


    @Test
    public void windowHandles(){
        driver=new EdgeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().maximize();

        driver.findElement(By.xpath("//a[text()='OrangeHRM, Inc']")).click();
        //getting windowHandles of different browsers
        Set<String>windows=driver.getWindowHandles();
        //It will give parent browser window title.
        System.out.println(driver.getTitle()); //OrangeHRM

        //approach 1
        /*List<String> multipleWindows=new ArrayList<>(windows);
        String parentWindow=multipleWindows.get(0);
        String childWindow=multipleWindows.get(1);

        //switching parent to child browser to do the operations
        driver.switchTo().window(childWindow);

        //It will give the child browser title
        System.out.println(driver.getTitle()); //Human Resources Management Software | OrangeHRM


        //switching to parent browser
        driver.switchTo().window(parentWindow);
        System.out.println(driver.getTitle()); //OrangeHRM

         */

        //Approach 2
        for(String winId:windows){
          String winTitle  =driver.switchTo().window(winId).getTitle();
          if(winTitle.equals("Human Resources Management Software | OrangeHRM")){
              driver.close();
          }
        }



    }
}
