package allAboutSelenium.javaScriptExecutorInterface;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SingleFileUpload {

    WebDriver driver;

    @Test
    public void verfyingSingleFileUpload(){
        driver=new EdgeDriver();
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();

        //single file
        driver.findElement(By.xpath("//form[@id='singleFileForm']/input[@id='singleFileInput']")).sendKeys("C:\\Users\\Suresh Siripurapu\\java\\ClassNameAndFileNameDifferent.java");

        driver.findElement(By.xpath("//form[@id='singleFileForm']/input[@id='singleFileInput']/following-sibling::button[@type='submit']")).click();

        String text=driver.findElement(By.xpath("//p[@id='singleFileStatus']")).getText();
        System.out.println(text);

        Assert.assertEquals(text,"Single file selected: ClassNameAndFileNameDifferent.java, Size: 101 bytes, Type:");

//        if(text.equals("Single file selected: ClassNameAndFileNameDifferent.java, Size: 101 bytes, Type:")){
//            System.out.println("Same");
//        }else {
//            System.out.println("not same");
//        }

        driver.quit();
    }
}
