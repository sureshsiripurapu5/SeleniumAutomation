package allAboutSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class ConditionalMethods {

    WebDriver driver;

    @Test
    public void conditionalMethods() throws InterruptedException {
        driver = new EdgeDriver();
        driver.get("https://demo.nopcommerce.com/register");

        //isDisplayed()-- we can check the element is displayed or not on the webpage.
        WebElement logo = driver.findElement(By.xpath("//div[@class='header-logo']/a/img"));
        boolean logoS = logo.isDisplayed();
        System.out.println(logoS);

        //isEnabled()-- we can check the status of the element is in enabled or disabled state.
        WebElement status = driver.findElement(By.xpath("//input[@id='FirstName']"));
        System.out.println(status.isEnabled());

        //isSelected()-- We can check the element is selected or not
        WebElement male_radioButton=driver.findElement(By.xpath("//input[@id='gender-male']"));
        WebElement female_radioButton= driver.findElement(By.xpath("//input[@id='gender-female']"));
        System.out.println("Before selection male radiobutton::"+male_radioButton.isSelected()); //false
        System.out.println("Before selection female radioButton::"+female_radioButton.isSelected()); //false

        male_radioButton.click();
        female_radioButton.click();

        System.out.println("After Selection male radiobutton::"+male_radioButton.isSelected()); //false
        System.out.println("After Selection male radiobutton::"+female_radioButton.isSelected()); //true



    }
}
