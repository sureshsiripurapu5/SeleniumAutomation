package allAboutSelenium.fileUploadAndFileDownload;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import java.util.HashMap;

public class BrowserOptions {


    @Test
    public void verifyChromeOptions(){
        ChromeOptions chromeOptions=new ChromeOptions();
        HashMap<String,String> map=new HashMap<>();
        map.put("deviceName","iphone SE");
        //chromeOptions.setExperimentalOption("mobileEmulation",map);
        chromeOptions.setBrowserVersion("129");
        chromeOptions.setAcceptInsecureCerts(false);

        WebDriver driver=new ChromeDriver(chromeOptions);
        //driver.get("https://the-internet.herokuapp.com/");
        driver.get("http://www.cacert.org/");


    }
}
