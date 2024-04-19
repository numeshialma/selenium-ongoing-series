package Session_26_WebDriver_Methods_Part_1.task_2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConditionalMethods {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.get("https://demo.nopcommerce.com/register");
        driver.manage().window().maximize();

        /** isDisplayed() */
        WebElement logo = driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
        System.out.println("Display status of logo : " +logo.isDisplayed());

        // output : Display status of logo : true

        // This also correct
        boolean status = driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']")).isDisplayed();
        System.out.println("Display status : " +status);

        // output : Display status : true

    }
}
