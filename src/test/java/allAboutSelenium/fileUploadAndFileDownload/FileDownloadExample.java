package allAboutSelenium.fileUploadAndFileDownload;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.File;
import java.time.Duration;
import java.util.HashMap;

public class FileDownloadExample {
    WebDriver driver;

    @Test
    public void downloadFile() throws InterruptedException {

        ChromeOptions chromeOptions=new ChromeOptions();
        HashMap<String,Object> chromePrefs=new HashMap<>();
        chromePrefs.put("profile.default_content_settings.popups",0);
        chromePrefs.put("download.default_directory",System.getProperty("user.dir")+"\\downloads");
        chromeOptions.setExperimentalOption("prefs",chromePrefs);

        driver=new ChromeDriver(chromeOptions);

        driver.get("https://the-internet.herokuapp.com/download");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        driver.findElement(By.xpath("//a[@href='download/SOLID_IMP.pdf']")).click();
        Thread.sleep(5000);

        File file=new File(System.getProperty("user.dir")+"\\downloads\\SOLID_IMP.pdf");
        Assert.assertTrue(file.exists());






    }
}
