import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Erp {

    WebDriver driver;

    @BeforeSuite
    public void initilazeBrowser(){
        driver=new ChromeDriver();
    }


    @Test
    public void lmsLogin() throws InterruptedException {

        driver.get("https://lms.kluniversity.in/login/index.php");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//input[@id='username']")).sendKeys("2301050155");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Suresh@123");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//button[text()='Log in']")).click();

        Thread.sleep(3000);
        driver.findElement(By.xpath("//span[starts-with(text(),'Siripurapu  Suresh 2301050155')]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//span[normalize-space()='Log out']")).click();
    }

    @AfterTest
    public void terminate(){
        driver.quit();
    }
}
