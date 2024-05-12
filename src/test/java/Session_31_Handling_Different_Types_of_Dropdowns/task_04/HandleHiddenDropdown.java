package Session_31_Handling_Different_Types_of_Dropdowns.task_04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class HandleHiddenDropdown {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php");
        driver.manage().window().maximize();

        // Login steps
        driver.findElement(By.name("username")).sendKeys("Admin");
        driver.findElement(By.name("password")).sendKeys("admin123");
        driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();

        // clicking on PIM
        driver.findElement(By.xpath("//span[normalize-space()='PIM']")).click();

        // click on the dropdown
        driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/form[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/i[1]")).click();

        // select single option
        driver.findElement(By.xpath("//span[normalize-space()='Financial Analyst']")).click();


    }
}
