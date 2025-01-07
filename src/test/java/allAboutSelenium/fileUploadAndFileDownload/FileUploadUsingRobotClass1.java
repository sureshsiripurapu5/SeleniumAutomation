package allAboutSelenium.fileUploadAndFileDownload;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

public class FileUploadUsingRobotClass1 {
    WebDriver driver;
    @Test
    public void fileUploadUsingRobotClass() throws AWTException, InterruptedException {
        driver=new EdgeDriver();
        driver.get("https://www.foundit.in/upload");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        WebElement resumeUploadBtn=driver.findElement(By.xpath("//div[contains(text(),'Upload Resume')]"));
        resumeUploadBtn.click();

        WebElement fileChoose=driver.findElement(By.xpath("//input[@id='file-upload']"));
        JavascriptExecutor javascriptExecutor=(JavascriptExecutor) driver;
        javascriptExecutor.executeScript("arguments[0].click()",fileChoose);

        Thread.sleep(5000);

        StringSelection filePathLocation=new StringSelection(System.getProperty("user.dir")+"\\uploadFiles\\2301050173-TEJA resume.pdf");
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(filePathLocation,null);

        Robot robot=new Robot();
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);

        driver.findElement(By.xpath("//input[@type='submit' and @id='pop_upload']")).click();

    }
}
