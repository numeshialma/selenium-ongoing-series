package Session_27_WebDriver_Waiting_Methods.task_03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ExplicitWaitDemo {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        // explicit wait
        WebDriverWait myWait = new WebDriverWait(driver,Duration.ofSeconds(10));   // declaration

        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().maximize();

        myWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Username']")));  // use
        driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");

        driver.close();
    }
}
