package allAboutSelenium.fileUploadAndFileDownload;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class SingleFileUpload {
    WebDriver driver;

    @Test
    public void singleFileUpload(){
        driver=new EdgeDriver();
        driver.get("https://the-internet.herokuapp.com/upload");
        driver.manage().window().maximize();

        String filePathLoaction=System.getProperty("user.dir")+"\\uploadFiles\\ClassNameAndFileNameDifferent.java";
        WebElement chooseFileBtn=driver.findElement(By.cssSelector("input[id='file-upload']"));
        chooseFileBtn.sendKeys(filePathLoaction);

        WebElement uploadBtn=driver.findElement(By.cssSelector("input[id='file-submit']"));
        uploadBtn.click();


    }
}
