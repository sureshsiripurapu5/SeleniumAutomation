package allAboutSelenium.fileUploadAndFileDownload;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.File;
import java.time.Duration;
import java.util.HashMap;

public class DownloadFileExample {
    WebDriver driver;

    @BeforeSuite
    public void initialize(){
        ChromeOptions chromeOptions=new ChromeOptions();
        HashMap<String,Object> map=new HashMap<>();
        map.put("profile.default_content_settings.popups",0);
        map.put("download.default_directory",System.getProperty("user.dir")+"\\downloads");
        chromeOptions.setExperimentalOption("prefs",map);
        driver=new ChromeDriver(chromeOptions);
    }

    @BeforeTest
    public void launch(){
        driver.get("https://the-internet.herokuapp.com/download");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }

    @Test
    public void downloadFile() throws InterruptedException {
        driver.findElement(By.xpath("//a[@href='download/demo_upload1.pdf']")).click();
        Thread.sleep(5000);
        File file=new File(System.getProperty("user.dir")+"\\downloads\\demo_upload1.pdf");
        Assert.assertTrue(file.exists());

    }
}
