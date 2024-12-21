package allAboutSelenium.screenShots;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

public class TakingScreenShot {

    WebDriver driver;

    @Test
    public void capturingScreenShot() throws IOException {
        driver= new EdgeDriver();
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();

        TakesScreenshot takesScreenshot=(TakesScreenshot) driver;
        File sourceFile=takesScreenshot.getScreenshotAs(OutputType.FILE);

        File targetFile= new File("C:\\Users\\Suresh Siripurapu\\SeleniumAutomation\\ScreenShots\\fullpage.png");
        sourceFile.renameTo(targetFile);
        driver.quit();
    }

    @Test
    public void capturingScreenShotUsingApachePoiLibrary() throws IOException{
        driver= new EdgeDriver();
        driver.get("https://www.orangehrm.com/");
        driver.manage().window().maximize();

        TakesScreenshot takesScreenshot=(TakesScreenshot) driver;

        File sourceFile=takesScreenshot.getScreenshotAs(OutputType.FILE);

        File targetFile=new File(System.getProperty("user.dir")+"\\ScreenShots\\orangeHrm.png");

        FileUtils.copyFile(sourceFile,targetFile);
        driver.quit();

    }

    @Test
    public void capturingCertainPageScreenShot(){
        driver= new EdgeDriver();
        driver.get("https://www.nopcommerce.com/en/features");
        driver.manage().window().maximize();

        WebElement carPage=driver.findElement(By.xpath("//div[@class='fragment features-fragment features-getstarted-fragment features-getstarted-fragment-green']"));

        File sourceFile=carPage.getScreenshotAs(OutputType.FILE);

        File targetFile=new File(System.getProperty("user.dir")+"\\ScreenShots\\partialPages.png");

        sourceFile.renameTo(targetFile);
        driver.quit();


    }

    @Test
    public void captureCertainWebElement() throws IOException{
        driver= new EdgeDriver();
        driver.get("https://www.flipkart.com/");
        driver.manage().window().maximize();

        WebElement flipkartImg=driver.findElement(By.xpath("//img[@title='allAboutSelenium.practice.Flipkart']"));

        File sourceFile=flipkartImg.getScreenshotAs(OutputType.FILE);
        File targetFile=new File(System.getProperty("user.dir")+"\\ScreenShots\\flipkartLogo.png");

        FileUtils.copyFile(sourceFile,targetFile);
        driver.quit();

    }
}
