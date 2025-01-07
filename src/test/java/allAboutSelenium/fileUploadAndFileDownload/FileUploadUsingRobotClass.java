package allAboutSelenium.fileUploadAndFileDownload;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

public class FileUploadUsingRobotClass {
    WebDriver driver;

    @Test
    public void uploadingFileUsingRobotClass() throws AWTException, InterruptedException {
        driver=new EdgeDriver();
        driver.get("https://the-internet.herokuapp.com/upload");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        WebElement chooseFileBtn=driver.findElement(By.xpath("//div[@id='drag-drop-upload']"));
        chooseFileBtn.click();
        Robot robot=new Robot();

        //1)copy the path to the clipboard
        Thread.sleep(5000);
        StringSelection filePath=new StringSelection(System.getProperty("user.dir")+"\\uploadFiles\\ClassNameAndFileNameDifferent.java");
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(filePath,null);

        //2)ctrl+V
        //Robot robot=new Robot();
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_CONTROL);

        //enter
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);

        driver.findElement(By.xpath("//input[@id='file-submit']")).click();




    }
}
