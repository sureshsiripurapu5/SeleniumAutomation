package allAboutSelenium.fileUploadAndFileDownload;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class MultipleFileUpload {

    WebDriver driver;
    @Test
    public void verfyingMultipleFileUploads(){
        driver=new EdgeDriver();
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();

        String file1="C:\\Users\\Suresh Siripurapu\\java\\ClassNameAndFileNameDifferent.java";
        String  file2="C:\\Users\\Suresh Siripurapu\\java\\CommandLineArguments.java";

        WebElement multipleFiles=driver.findElement(By.xpath("//form[@id='multipleFilesForm']/input[@id='multipleFilesInput']"));
        multipleFiles.sendKeys(file1+"\n"+file2);

        driver.findElement(By.xpath("//form[@id='multipleFilesForm']/input[@id='multipleFilesInput']/following-sibling::button[@type='submit']")).click();
        String text= driver.findElement(By.xpath("//p[@id='multipleFilesStatus']")).getText();

        System.out.println(text);

        driver.quit();


    }
}
