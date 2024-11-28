import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Blah {

    @Test
    public void launch(){

        WebDriver driver= new ChromeDriver();

        driver.get("https://www.salesforce.com/in/form/signup/freetrial-sales/?d=topnav2-btn-ft");


        WebElement checkbox= driver.findElement(By.xpath("//div[contains(text(), 'I agree to the')]/../div[@class='checkbox-ui']/preceding-sibling::input"));
        boolean aaa= checkbox.isSelected();
        System.out.println(aaa);

        try{
            checkbox.click();


        }
        catch (ElementClickInterceptedException e){

        }
        System.out.println(checkbox.isSelected());

    }
}
