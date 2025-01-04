package allAboutSelenium.tables;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class HandleCalenderTest {
    WebDriver driver;
    JavascriptExecutor javascriptExecutor;

    String year="2025";
    String month="August";
    String date="25";

    @Test
    public void selectddMMYY(){
        driver=new ChromeDriver();
        driver.get("https://www.makemytrip.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));


        WebElement closeBtn=driver.findElement(By.xpath("//span[@data-cy='closeModal']"));
        closeBtn.click();

        WebElement departure=driver.findElement(By.xpath("//span[text()='Departure']"));
        departure.click();

        WebElement nextMonth=driver.findElement(By.xpath("//span[@aria-label='Next Month']"));

        //div[@class='DayPicker-Caption']/div[contains(text(),'2025')]
        //div[@class='DayPicker-Caption']/div[contains(text(),'January')]

        while(true){
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
            if(driver.findElements(By.xpath("//div[@class='DayPicker-Caption']/div[contains(text(),'"+year+"')]")).size()>0)
                break;
            else
                nextMonth.click();
        }

        while (true){
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));

            if(driver.findElements(By.xpath(" //div[@class='DayPicker-Caption']/div[contains(text(),'"+month+"')]")).size()>0)
                break;
            else
                nextMonth.click();
        }

        String dateXpath = "//div[@class='DayPicker-Caption']/div[contains(text(),'"+month+"')]/../following-sibling::div[@class='DayPicker-Body']/descendant::p[text()='"+date+"']";
        WebElement date=driver.findElement(By.xpath(dateXpath));
        //date.click();
        javascriptExecutor=(JavascriptExecutor) driver;
        javascriptExecutor.executeScript("arguments[0].click()",date);

        List<WebElement> fullDate = driver.findElements(By.xpath("//p[@data-cy='departureDate']/span[text()]"));
        List<String> dateInfo = new ArrayList<>();

        for (int i=0; i< fullDate.size(); i++){
            dateInfo.add(fullDate.get(i).getText());
        }
        System.out.println(dateInfo);




    }
}
