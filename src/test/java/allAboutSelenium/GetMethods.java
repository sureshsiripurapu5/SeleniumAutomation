package allAboutSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import java.util.Set;

public class GetMethods {

    WebDriver driver;

    @Test
    public void getMethods() throws InterruptedException {
        driver=new EdgeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        driver.manage().window().maximize();
        //returns the title of the page
         String titleOfWebpage=driver.getTitle();
        System.out.println("The title of the page ::"+titleOfWebpage); //OrangeHRM

        //returns the current url of the page
        String currentUrl=driver.getCurrentUrl();
        System.out.println("The current url of the page::"+currentUrl); //https://opensource-demo.orangehrmlive.com/web/index.php/auth/login

        //returns the pageSource of the page
        String pageSource= driver.getPageSource();
        System.out.println("The page source of the page ::"+pageSource);

      //returns the window ID of the browser window(The id is dynamic )
        String windowHandleId= driver.getWindowHandle();
        System.out.println("The current id of window ::"+windowHandleId); //8953AA8903C34207C536365F9EB59FB8



        Thread.sleep(5000);
        driver.findElement(By.xpath("//a[text()='OrangeHRM, Inc']")).click();
        //org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {"method":"xpath","selector":"//a[text()='OrangeHRM, Inc']"}
        //it will throw the exception because of syncronization problem.

        //returns the Id's of the mutliple browser windows.
        //set doesn't allow the duplicates.
        Set<String> windowHandles=driver.getWindowHandles();
        System.out.println("WindowHandles::"+windowHandles); //[8953AA8903C34207C536365F9EB59FB8, 1CB6D4FF8515A3331BCBC0211C8AC592]



    }
}
