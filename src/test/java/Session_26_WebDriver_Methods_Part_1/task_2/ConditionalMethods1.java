package Session_26_WebDriver_Methods_Part_1.task_2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConditionalMethods1 {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.get("https://demo.nopcommerce.com/register");
        driver.manage().window().maximize();

        /** isEnabled() */
        boolean status = driver.findElement(By.xpath("//input[@id='FirstName']")).isEnabled();
        System.out.println("Enable status  : " +status);

        // output : Display status of logo : true


    }
}
